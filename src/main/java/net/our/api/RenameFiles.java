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
import java.io.File;
import org.glassfish.jersey.client.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

@Path("rename")
public class RenameFiles {

    @GET
    @Produces ("application/json")
    @Path("/dropbox")
    public Response RenameFileDropbox(@QueryParam("pathfile") String pathfrom, @QueryParam("newpath") String pathto) {
		Client client = ClientBuilder.newClient();
		ClientRest clientrest=ClientRest.getinstance();

		WebTarget target = client.target("https://api.dropboxapi.com/1/fileops/move"+"?root=auto&from_path="+pathfrom+"&to_path="+pathto);
		Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
		invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDropbox());
		Response response = invocationBuilder.get();
		return response;
    }

    /** TODDO **/

    @GET
    @Produces ("application/json")
    @Path("/drive/{fileid}")
    public Response renameFileDrive(@PathParam("fileid") String id, @QueryParam("newname") String name) {

    ClientRest clientrest=ClientRest.getinstance();
	Client client = ClientBuilder.newClient();
/*
	File file = new File();
	file.createNewFile();
	FileWriter fw = new FileWriter(file.getAbsoluteFile());
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("");

*/

		WebTarget target = client.target("https://www.googleapis.com/drive/v2/files/"+id+"?fields=title");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive());
	Response response = invocationBuilder.get();
	return response;
	
    }
}