package net.our.api;

import net.our.beans.infofile.dropbox.*;
import net.our.beans.infofile.drive.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.client.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;
import java.net.URI;
import java.io.*;
import java.util.*;
import org.glassfish.jersey.client.*;

@Path("fileInfo")
public class FileInfo {
    
    
    @GET
    @Produces ("application/json")
    @Path("/dropbox_one/{Path}")
    public Response getInfoFileDropbox(@PathParam("Path") String path) {

	
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://api.dropboxapi.com/").path("1/metadata/auto/"+path);
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDropbox);
	Response response = invocationBuilder.get();
	
	return response;
	
    }

    @GET
    @Path("/dropbox")
    @Produces ("application/json")
    public Response getAllInfoFileDropbox() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		getAllInfoFileDropbox("",sb);
		sb.append(" }");
		return Response.status(Response.Status.OK).entity(sb.toString()).build();
    }
    

    public StringBuilder getAllInfoFileDropbox(String path, StringBuilder sb) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://api.dropboxapi.com/").path("1/metadata/auto/"+path);
		
		Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
		invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDropbox);
   		 BeanFileInfoDropbox pojo = invocationBuilder.get(BeanFileInfoDropbox.class);
   		 

		List<Content> tab = pojo.getContents();
		for(int i=0; i<tab.size(); i++){
		    if(tab.get(i).getIs_dir()){
	 		   	sb = getAllInfoFileDropbox(tab.get(i).getPath(),sb);
				//sb.append(tmp.toString());
	 	   }else{
	 		   	String tmp = new String("{\"path\": \"" + tab.get(i).getPath() + "\", \"modified\": \"" + tab.get(i).getModifier() + "\", \"size\": \"" + tab.get(i).getSize() + "\"}, ");
	 		   	sb.append(tmp);
	 	   }
		}	
		return sb;
    }
    

    
    @GET
    @Produces ("application/json")
    @Path("/drive/")
    public Response getInfoFileDrive() {
    ClientRest clientrest=ClientRest.getinstance();
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/").path("/files");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive());
	Response response = invocationBuilder.get();
	return response;	
    	/*
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/").path("files");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);

	//	return invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDrive).get();
	
	
	BeanFilesDrive bean = invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDrive).get(BeanFilesDrive.class);
	Response response = Response.status(Response.Status.OK).build();
	return response;
	*/
    }
}
