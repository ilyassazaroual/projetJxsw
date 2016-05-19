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

@Path("share")
public class ShareFiles {

    @GET
    @Produces ("application/json")
    @Path("/dropbox/")
    public Response getShareFileDropbox(@QueryParam("path") String chemin) {
	Client client = ClientBuilder.newClient();
	try{
		 chemin = URLEncoder.encode(chemin, "UTF-8");
	}catch(Exception e ){}
	WebTarget target = client.target("https://api.dropboxapi.com/1/shares/auto/").path(chemin);
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDropbox);
	Response response = invocationBuilder.get();
	return response;

    }

    @GET
    @Produces ("application/json")
    @Path("/drive/")
    public Response getShareFileDrive(@QueryParam("fileid") String fileid) {
		ClientRest clientrest=ClientRest.getinstance();
		Client client = ClientBuilder.newClient();
    	String test = "{\n \"role\": \"writer\",\n \"type\": \"anyone\"\n}";
		WebTarget target = client.target("https://www.googleapis.com/drive/v2/files/"+fileid+"/permissions");
		Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
		invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive());
		Response response = invocationBuilder.post(Entity.entity(test,MediaType.APPLICATION_JSON));
	return response;	
	
    }

}
