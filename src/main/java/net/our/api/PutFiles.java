
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
import org.glassfish.jersey.media.multipart.*;


@Path("put")
public class PutFiles {

@GET
@Path("/drive/")
public Response putFileDrive() {


        
        Client client = ClientBuilder.newClient();
        ClientRest clientrest=ClientRest.getinstance();

    ClassLoader classLoader = getClass().getClassLoader();
     org.glassfish.jersey.media.multipart.file.FileDataBodyPart filePart = new org.glassfish.jersey.media.multipart.file.FileDataBodyPart("file", new File(classLoader.getResource("test").getFile()));
    FormDataMultiPart formDataMultiPart = new FormDataMultiPart();
     FormDataMultiPart multipart = (FormDataMultiPart) formDataMultiPart.field("foo", "bar").bodyPart(filePart);


      
     WebTarget target = client.target("https://www.googleapis.com/upload/drive/v2/files/uploadType=multipart").register(MultiPartFeature.class);
     Response response = target.request().header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive()).post(Entity.entity(multipart, multipart.getMediaType()));
     return response;
}

@GET
@Path("/drive1/")
public Response putFileDrive4() {
        /*
        Client client = ClientBuilder.newClient();
        ClientRest clientrest=ClientRest.getinstance();
        String s = "{\n \"title\": \"ok\"\n}";

        Item bean = new Item();
        bean.setTitle("ok");

        MultiPart multiPartEntity = new MultiPart()
        .bodyPart(new BodyPart(bean, MediaType.APPLICATION_JSON_TYPE))
        .bodyPart(new BodyPart().entity("mache?"));


    MultivaluedMap<String,Object> myHeaders = new MultivaluedHashMap<String,Object>("Autorization", "Bearer " + clientrest.getTokenDrive());
    myHeaders.add("Content-Length","500");

    WebTarget target = client.target("https://www.googleapis.com/upload/drive/v2/files/uploadType=multipart");
    Invocation.Builder inv = target.request(MediaType.APPLICATION_JSON_TYPE);
   Response response = inv.headers(myHeaders).post(Entity.entity(multiPartEntity, multiPartEntity.getMediaType()));
   */
   // Invocation.Builder request = target.request();
  //  request.accept(MediaType.APPLICATION_JSON_TYPE).header("Authorization", "Bearer " + clientrest.getTokenDrive()).header("Content-Length","500");
   // Response response = request.post(Entity.entity(multiPartEntity, multiPartEntity.getMediaType()));

     /*target = target.request(MediaType.APPLICATION_JSON_TYPE).header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive()).;
     target = target.post();
     */
    return null;
/*
    ClassLoader classLoader = getClass().getClassLoader();
     org.glassfish.jersey.media.multipart.file.FileDataBodyPart filePart = new org.glassfish.jersey.media.multipart.file.FileDataBodyPart("file", new File(classLoader.getResource("test").getFile()));
    FormDataMultiPart formDataMultiPart = new FormDataMultiPart();
     FormDataMultiPart multipart = (FormDataMultiPart) formDataMultiPart.field("foo", "bar").bodyPart(filePart);
*/
     
      
    

}
/*
@GET
@Path("/drive2/")
public Response putFileDrive2(){
           /
            ClientRest clientrest=ClientRest.getinstance();

        Client client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();
        WebTarget webTarget = client.target("https://www.googleapis.com/upload/drive/v2/files/uploadType=multipart");
        MultiPart multiPart = new MultiPart();
        multiPart.setMediaType(MediaType.MULTIPART_FORM_DATA_TYPE);

    ClassLoader classLoader = getClass().getClassLoader();

        org.glassfish.jersey.media.multipart.file.FileDataBodyPart fileDataBodyPart = new org.glassfish.jersey.media.multipart.file.FileDataBodyPart("file",new File(classLoader.getResource("test").getFile()),
            MediaType.APPLICATION_OCTET_STREAM_TYPE);
        multiPart.bodyPart(fileDataBodyPart);

         Response response = webTarget.request(MediaType.APPLICATION_JSON_TYPE).header().header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive())
        .post(Entity.entity(multiPart, multiPart.getMediaType()));
        return response;


}
@POST
@Path("/upload")   
@Consumes(MediaType.MULTIPART_FORM_DATA)
public Response putDrive3( @FormDataParam("file") InputStream fileInputStream, @FormDataParam("file") FormDataContentDisposition contentDispositionHeader){

    return null;

}
*/

/*

    @POST
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

*/

    

   

        
        //String filePath = "/home/gael/srv/" + contentDispositionHeader.getFileName();
/*
        // save the file to the server
        try {
            OutputStream outpuStream = new FileOutputStream(new File(filePath));
            int read = 0;
            byte[] bytes = new byte[1024];

            outpuStream = new FileOutputStream(new File(filePath));
            while ((read = fileInputStream.read(bytes)) != -1) {
                outpuStream.write(bytes, 0, read);
            }
            outpuStream.flush();
            outpuStream.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
     Client client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();
        WebTarget webTarget = client.target("https://www.googleapis.com/upload/drive/v2/files/uploadType=multipart");
        MultiPart multiPart = new MultiPart();
        multiPart.setMediaType(MediaType.MULTIPART_FORM_DATA_TYPE);


        org.glassfish.jersey.media.multipart.file.FileDataBodyPart fileDataBodyPart = new org.glassfish.jersey.media.multipart.file.FileDataBodyPart("file",
            new File("/home/gael/test"),
            MediaType.APPLICATION_OCTET_STREAM_TYPE);
        multiPart.bodyPart(fileDataBodyPart);
         Response response = webTarget.request(MediaType.APPLICATION_JSON_TYPE).header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive())
        .post(Entity.entity(multiPart, multiPart.getMediaType()));
		return response;
/*/
    // in = new FileInputStream(getClass().getResourceAsStream("/test"));


    /*
        ClientRest clientrest=ClientRest.getinstance();
        Client client = ClientBuilder.newClient();


        FileDataBodyPart filePart = new FileDataBodyPart("file", new File("/home/gael/test"));
         MultiPart multiPartEntity = new FormDataMultiPart().field("meta", "ok", MediaType.APPLICATION_JSON_TYPE).bodyPart(filePart);
  


        WebTarget target = client.target("https://www.googleapis.com/upload/drive/v2/files/uploadType=multipart");
        Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
        invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive()).header("Content-Type","multipart/related; boundary=\"foo_bar_baz\"").header("Content-Length","500");
        Response response = invocationBuilder.post(Entity.entity(multiPartEntity, multiPartEntity.getMediaType()));

         
         WebTarget target = client.target("https://www.googleapis.com/upload/drive/v2/files/uploadType=multipart");
        Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
        invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + clientrest.getTokenDrive()).header("Content-Type","multipart/related; boundary=\"foo_bar_baz\"").header("Content-Length","500");
        Response response = invocationBuilder.post(Entity.entity(mediaContent,MediaType.APPLICATION_OCTET_STREAM));
        */


    


    
 
}
