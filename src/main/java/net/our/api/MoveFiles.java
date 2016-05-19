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



@Path("move")
public class MoveFiles {

    @GET
    @Produces ("application/json")
    @Path("/dropbox")
	//mvntarget.queryParam("path",chemin);
    public Response MoveFileDropbox(@QueryParam("pathfrom") String pathfrom, @QueryParam("pathto") String pathto) {
	Client client = ClientBuilder.newClient();
	ClientRest clientrest=ClientRest.getinstance();

	WebTarget target = client.target("https://api.dropboxapi.com/1/fileops/move"+"?root=auto&from_path="+pathfrom+"&to_path="+pathto);
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDropbox());
	Response response = invocationBuilder.get();
	return response;
    }

    /******* TODDOO*****/
    @GET
    @Produces ("application/json")
    @Path("/drive")
    public Response MoveFileDrive(@QueryParam("path") String fileId) {

    ClientRest clientrest=ClientRest.getinstance();

	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/files/").path(fileId);
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive());
	Response response = invocationBuilder.delete();
	return response;
	


    }

}