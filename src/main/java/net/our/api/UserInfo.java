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



@Path("userinfo")
public class UserInfo {

    @GET
    @Produces ("application/json")
    @Path("/dropbox")
    public Response getUserInfoDropbox() {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://api.dropboxapi.com/").path("1/account/info");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDropbox);
	//Response response = invocationBuilder.get();
	//return response;
	 BeanUserInfoDropbox response = invocationBuilder.get(BeanUserInfoDropbox.class);
	 return invocationBuilder.get();
	/*
	BeanUserInfoDropbox  pojo = response.readEntity(BeanUserInfoDropbox.class);
	return pojo;*/
	    
    }

    @GET
    @Produces ("application/json")
    @Path("/drive")
    public Response getUserInfoDrive() {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/").path("about");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDrive);
	Response response = invocationBuilder.get();
	return response;
    }
}
