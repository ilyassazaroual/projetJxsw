
/*
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



@Path("put")
public class PutFiles {

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Path("/dropbox")
    public Response putFileDropbox(@FormDataParam("file") InputStream file,
        @FormDataParam("file") FormDataContentDisposition fileDetail, 
        @QueryParam("path") String parent_id) {
    	  	
    String uploadedFileLocation = "http://localhost:8080/webapi/upload/files/" + fileDetail.getFileName();

    try {
            OutputStream out = new FileOutputStream(new File(uploadedFileLocation));
            int read = 0;
            byte[] bytes = new byte[1024];

            out = new FileOutputStream(new File(uploadedFileLocation));
            while ((read = file.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            out.flush();
            out.close();
        } catch (IOException e) {

            e.printStackTrace();
        }

    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("https://api.dropboxapi.com/").path("1/oauth2/token");
    FormDataMultiPart form = new FormDataMultiPart();
    FormDataBodyPart fdp = new FormDataBodyPart("content",out,MediaType.APPLICATION_OCTET_STREAM_TYPE);
   
    form.bodyPart(fdp);
    String response = resource.type(MediaType.MULTIPART_FORM_DATA).post(String.class, form);
    return response;

    }



  public JSONObject sendFile(final InputStream toUpload,
                             final String destination) {
    byte[] buffer = new byte[16384];
    int bytesRead;
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    while ((bytesRead = file.read(buffer)) != -1)
    {
        output.write(buffer, 0, bytesRead);
    }
    output.flush();
    byte[] byteArray=output.toByteArray();
    InputStream inputFile = new ByteArrayInputStream(byteArray);

    JSONObject result = new JSONObject();
    result=sendfile(inputFile,parent_id)

    return Response.status(Response.Status.OK).entity(result.toString()).build();
String url = "https://content.dropboxapi.com/1/files_put/auto/"
    + destination + "?param=val&access_token=" + _token;

    String fname = UUID.randomUUID().toString();
    File file = null;




    }



      @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Path("/drive")
    public Response putFileDropbox(@FormDataParam("file") InputStream file, @QueryParam("path") String parent_id) {
            


    }


    }

 
}
*/