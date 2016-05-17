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

@Path("shareFolder")
public class ShareFolder {

    // TODO
    @GET
    @Produces ("application/json")
    @Path("/dropbox/{pathFile}")
    public Response getShareFolderDropbox(@PathParam("pathFile") String pathFile) {

	//	String folderId = getFolderId(pathFile);
	
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://api.dropboxapi.com/").path("1/shared_folder/"/*+folderId*/);
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDropbox);
	Response response = invocationBuilder.get();
	return response;
	/*
	BeanUserInfoDropbox pojo = response.readEntity(BeanUserInfoDropbox.class);
	return pojo;
	    */
    }

    //TODO
    @GET
    @Path("/dropbox/search/{pathFile}")
    public Response getFolderId(@PathParam("pathFile") String path){
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://api.dropboxapi.com/").path("1/search/auto/"+path);
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDropbox);
	Form form = new Form();
	form.param("query","Documents");
       	Invocation inv = invocationBuilder.buildPost(Entity.entity(form, MediaType.APPLICATION_JSON));
	return inv.invoke();
	/*
	Response response = invocationBuilder.get();
	return response;
	*/
    }
}
