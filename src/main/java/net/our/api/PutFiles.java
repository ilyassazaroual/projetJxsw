package net.our.api;


import com.sun.jersey.multipart.FormDataParam;

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
import org.json.*;
import java.io.File;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.InputStream;

import java.io.OutputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;

import com.sun.jersey.multipart.FormDataParam;



@Path("putfile")
public class PutFiles {

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Path("/dropbox")
    public Response putFileDropbox(@FormDataParam("file") InputStream file, @QueryParam("path") String destination_path) {
    	  	

    Client client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();

	
	Response response = invocationBuilder.get();


	final FileDataBodyPart filePart = new FileDataBodyPart("file", file, MediaType.APPLICATION_OCTET_STREAM_TYPE);
	final MultiPart multipart = new FormDataMultiPart().bodyPart(filePart);	
	WebTarget target = client.target("https://content.dropboxapi.com/1/files_put/auto/");
	Response response = target.request(MediaType.MULTIPART_FORM_DATA).put(Entity.entity(multipart, multipart.getMediaType()));

	// send request

/*
      @FormDataParam("file") InputStream fileInputStream,
	  @FormDataParam("file") FormDataContentDisposition contentDispositionHeader) {

        String filePath = "https://content.dropboxapi.com/1/files_put/auto/" + destination + "?param=val&access_token=" + _token;

        try {
            OutputStream outpuStream = new FileOutputStream(new File(serverLocation));
            int read = 0;
            byte[] bytes = new byte[1024];
            outpuStream = new FileOutputStream(new File(serverLocation));

            while ((read = uploadedInputStream.read(bytes)) != -1) {
                outpuStream.write(bytes, 0, read);
            }
            outpuStream.flush();
            outpuStream.close();
        } catch (IOException e) {
 
            e.printStackTrace();
        }

        String output = "File uploaded : " + filePath;
        return Response.status(200).entity(output).build();
    }
*/


    }

   	@POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Path("/drive")
    public Response putFileDropbox(@FormDataParam("file") InputStream file, @QueryParam("path") String destination_path) {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/").path("/files");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDrive);
	Response response = invocationBuilder.get();
	return response;
    }
}
