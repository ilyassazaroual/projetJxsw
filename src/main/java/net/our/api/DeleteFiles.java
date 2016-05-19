package net.our.api;

import net.our.beans.*;
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



@Path("delete")
public class DeleteFiles {

    @GET
    @Produces ("application/json")
    @Path("/dropbox")
	//mvntarget.queryParam("path",chemin);
    public Response deleteFileDropbox(@QueryParam("path") String chemin) {

	Client client = ClientBuilder.newClient();
	ClientRest clientrest=ClientRest.getinstance();

	try{
		 chemin = URLEncoder.encode(chemin, "UTF-8");
	}catch(Exception e ){}

	WebTarget target = client.target("https://api.dropboxapi.com/1/fileops/delete"+"?root=auto&path="+chemin);
	//target.queryParam("root","auto");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDropbox());
	Response response = invocationBuilder.get();
	return response;
    }

    @GET
    @Produces ("application/json")
    @Path("/drive")
    public Response deleteFileDrive(@QueryParam("fileid") String fileid) {
    ClientRest clientrest=ClientRest.getinstance();
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/files/"+fileid);
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive());
	Response response = invocationBuilder.delete();
	return response;
	


    }

}
