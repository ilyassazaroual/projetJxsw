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



@Path("preview")
public class MediaPreview {
/*
    @POST
    @Produces ("application/json")
    @Path("/dropbox")
    public Response getmediaFilesDropbox(@QueryParam("path") String path) {

    }

    @GET
    @Produces ("application/json")
    @Path("/drive")
    public Response getmediaFilesDrive(@QueryParam("path") String path) {
	
    }
*/

    @GET
    @Produces ("application/json")
    @Path("/dropbox")
    public Response getpreviewFilesDropbox(@QueryParam("path") String chemin) {
	Client client = ClientBuilder.newClient();
	ClientRest clientrest=ClientRest.getinstance();
	WebTarget target = client.target("https://content.dropboxapi.com/1/previews/auto/").path(chemin);
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDropbox());
	Response response = invocationBuilder.get();
	return response;
    }
    
    @GET
    @Produces ("application/json")
    @Path("/drive")
    public Response getpreviewFilesDrive(@QueryParam("path") String chemin) {
    ClientRest clientrest=ClientRest.getinstance();
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/files/").path(chemin+"alt=media");
	//target.queryParam("alt","media");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive());
	Response response = invocationBuilder.get();
	return response;
    }

}
