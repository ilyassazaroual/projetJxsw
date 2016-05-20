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

    @GET
    @Produces ("application/json")
    @Path("/dropbox")
    public Response getpreviewFilesDropbox(@QueryParam("path") String chemin) {
	Client client = ClientBuilder.newClient();
	ClientRest clientrest=ClientRest.getinstance();
<<<<<<< HEAD
	WebTarget target = client.target("https://api.dropboxapi.com/1/media/auto/").path(chemin);
=======
	try{
		 chemin = URLEncoder.encode(chemin, "UTF-8");
	}catch(Exception e ){}
	WebTarget target = client.target("https://content.dropboxapi.com/1/media/auto/").path(chemin);
>>>>>>> 96f3d957d577b0773bae993e27d25dbc290b6fe5
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDropbox());
	Response response = invocationBuilder.get();
	return response;
    }

}
