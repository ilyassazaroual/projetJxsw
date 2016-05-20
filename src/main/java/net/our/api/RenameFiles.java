package net.our.api;

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


@Path("rename")
public class RenameFiles {

    @GET
    @Produces ("application/json")
    @Path("/dropbox")
    public Response renameFileDropbox(@QueryParam("pathfile") String pathfrom, @QueryParam("newpath") String pathto) {
		Client client = ClientBuilder.newClient();
		ClientRest clientrest=ClientRest.getinstance();	
		try{
		 pathfrom = URLEncoder.encode(pathfrom, "UTF-8");
		 pathto = URLEncoder.encode(pathto, "UTF-8");
		}catch(Exception e ){}

		WebTarget target = client.target("https://api.dropboxapi.com/1/fileops/move"+"?root=auto&from_path="+pathfrom+"&to_path="+pathto);
		Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
		invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDropbox());
		Response response = invocationBuilder.get();
		return response;
    }

    @GET
    @Produces ("application/json")
    @Path("/drive")
    public Response renameFileDrive(@QueryParam("fileid") String id, @QueryParam("newname") String name) {
   	 	ClientRest clientrest=ClientRest.getinstance();
		Client client = ClientBuilder.newClient();
		String json="{\n \"title\": \""+name+"\"\n}";
		WebTarget target = client.target("https://www.googleapis.com/drive/v2/files/"+id+"?fields=title");
		Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
		invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive());
		Response response = invocationBuilder.put(Entity.entity(json,MediaType.APPLICATION_JSON));
		return response;	
    }
}