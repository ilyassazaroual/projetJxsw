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



@Path("userfiles")
public class UserFiles {

    @GET
    @Produces ("application/json")
    @Path("/dropbox")
    public Response getUserFilesDropbox() {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://api.dropboxapi.com/").path("1/metadata/auto");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDropbox);
	Response response = invocationBuilder.get();
	return response;
    }

    @GET
    @Produces ("application/json")
    @Path("/drive")
    public Response getUserFilesDrive() {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/").path("/files");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDrive);
	Response response = invocationBuilder.get();
	return response;
    }

}
