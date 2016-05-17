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

@Path("shareFile")
public class ShareFile {

    @GET
    @Produces ("application/json")
    @Path("/dropbox/{pathFile}")
    public Response getShareFileDropbox(@PathParam("pathFile") String pathFile) {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://api.dropboxapi.com/").path("1/shares/auto/"+pathFile);
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDropbox);
	Response response = invocationBuilder.get();
	return response;
	/*
	BeanUserInfoDropbox pojo = response.readEntity(BeanUserInfoDropbox.class);
	return pojo;
	    */
    }

    // TODO
    @GET
    @Produces ("application/json")
    @Path("/drive/{pathFile}")
    public Response getShareFileDrive(@PathParam("pathFile") String pathFile) {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/").path("files/"+pathFile+"/permissions");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDrive);
       	Invocation inv = invocationBuilder.buildPost(Entity.entity(new Form(), MediaType.APPLICATION_JSON));
	return inv.invoke();
	//	return response;
    }
}
