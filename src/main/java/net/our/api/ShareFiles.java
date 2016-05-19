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

@Path("sharefiles")
public class ShareFiles {

    @GET
    @Produces ("application/json")
    @Path("/dropbox/")
    public Response getShareFileDropbox(@QueryParam("path") String path) {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://api.dropboxapi.com/1/shares/auto/").path(path);
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDropbox);
	Response response = invocationBuilder.get();
	return response;
	/*
	BeanUserInfoDropbox pojo = response.readEntity(BeanUserInfoDropbox.class);
	return pojo;
	    */
    }

    /**********  TODDO **/
    @GET
    @Produces ("application/json")
    @Path("/drive/")
    public Response getShareFileDrive(@QueryParam("fileid") String fileid) {

    if(fileid == null){
    	// mauvais non de fichier send BAD REQUEST ou autre
			
    }


	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/files/"+fileid+"/permissions");
	
		Form form = new Form();
	form.param("role","writer");
	form.param("type","anyone");	
  	 return target.request(MediaType.APPLICATION_JSON_TYPE).post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE));

/*
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDrive);
	Form form = new Form();
	form.param("role","writer");
	form.param("type","anyone");	

    Response inv = invocationBuilder.buildPost(Entity.entity(form, MediaType.APPLICATION_JSON)).invoke();
	return inv;
	*/
	//	return response;

	
    }

}
