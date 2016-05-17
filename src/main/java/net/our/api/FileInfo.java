package net.our.api;

import net.our.beans.infofile.*;
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
    @Path("/dropbox/{path}")
    public Response getInfoFileDropbox(@PathParam("path") String path) {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://api.dropboxapi.com/").path("1/metadata/auto/"+path);
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDropbox);
	Response response = invocationBuilder.get();
	
	return response;

	
    }
    
    @GET
    @Produces ("application/json")
    @Path("/drive/")
    public Response getInfoFileDrive() {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/").path("files");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);

	//	return invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDrive).get();
	
	
	BeanFilesDrive bean = invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDrive).get(BeanFilesDrive.class);
	Response response = Response.status(Response.Status.OK).build();
	return response;
	
    }
}
