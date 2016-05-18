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



@Path("authorize")
public class Authorize {

    public static String tokenDropbox = null;
    public static String tokenDrive = null;

    String dropboxConsumerKey = "r5cbkv6uktfkdxz";
    String dropboxConsumerSecret = "net37abb7rh573q";
    String driveConsumerKey = "728092218226-g7ltrqtstmjl8ugh7qltuod0jcvigpc8.apps.googleusercontent.com";
    String driveConsumerSecret = "OLc0JngrEqV4R9EBUqJsW-a5";
    public static String baseUrl = "http://localhost:8080/webapi/";
    @GET
    @Path("/dropbox")
    public Response authorizeDropbox() {
	String authorize = "https://www.dropbox.com/1/oauth2/authorize?response_type=code&client_id="+ dropboxConsumerKey +"&redirect_uri=http://localhost:8080/webapi/authorize/dropboxCallback&state=500&require_role=personal&force_reapprove=false&disable_signup=false";
	try{	
	    return Response.seeOther(new URI(authorize)).build();
	}catch(Exception e){
	    return Response.serverError().entity("Unable to Process this Request").build();
	}
    }

    @GET
    @Path("/drive")
    public Response authorizeDrive() {
      String scope = "https://www.googleapis.com/auth/drive";
      String authorize = "https://accounts.google.com/o/oauth2/v2/auth?response_type=code&client_id="+ driveConsumerKey +"&redirect_uri=http://localhost:8080/webapi/authorize/driveCallback&scope="+ scope; // +"&nonce="+ googleNonce;
	try{	
	    return Response.seeOther(new URI(authorize)).build();
	}catch(Exception e){
	    return Response.serverError().entity("Unable to Process this Request").build();
	}
    }

    @GET
    @Produces ("text/html")
    @Path("/dropboxCallback")
    public Response dropboxCallback(@Context HttpServletRequest request, @Context UriInfo uriInfo,
                         @QueryParam("code") String code, @QueryParam("state") String state) {

    if (code == null) {
        return Response.status(Response.Status.BAD_REQUEST).entity("Authorization code required").build();
    } 

    if (state == null) {
        return Response.status(Response.Status.BAD_REQUEST).entity("Missing state string").build();
    }
  
    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("https://api.dropboxapi.com/").path("1/oauth2/token");
    Form form = new Form();
    form.param("code",code);
    form.param("grant_type","authorization_code");
    form.param("client_id",dropboxConsumerKey);
    form.param("client_secret",dropboxConsumerSecret);
    form.param("redirect_uri",baseUrl + uriInfo.getPath());

    BeanAuthDropbox bean = target.request(MediaType.APPLICATION_JSON_TYPE)
    .post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
        BeanAuthDropbox.class);
    
    tokenDropbox = bean.getAccess_token();
        //ajout des tokens dans le singleton
     ClientRest clientrest=ClientRest.getinstance();
      clientrest.setTokenDropbox(tokenDropbox);


    


	URI uri;
    try {
        uri = new URI("http://localhost:8080/");
        return Response.seeOther(uri).build();
    } catch (URISyntaxException e) {
        e.printStackTrace();
        return null;
    }
    //return Response.status(Response.Status.OK).entity("<p><a href='"+baseUrl+"userinfo/dropbox'> Dropbox Get User Info</a></p>").build();


    }

    

    @GET
    @Produces ("text/html")
    @Path("/driveCallback")
    public Response driveCallback(@Context HttpServletRequest request, @Context UriInfo uriInfo,
				  @QueryParam("code") String code, @QueryParam("error") String error){
	if(error != null){
	    return Response.status(Response.Status.BAD_REQUEST).entity("Bad request").build();
	}
	if(code == null){
	    return Response.status(Response.Status.BAD_REQUEST).entity("Bad request no code").build();
	}

	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/").path("oauth2/v4/token");
	Form form = new Form();
	form.param("code",code);
	form.param("grant_type","authorization_code");
	form.param("client_id",driveConsumerKey);
	form.param("client_secret",driveConsumerSecret);
	form.param("redirect_uri",baseUrl + uriInfo.getPath());


	BeanAuthDrive bean = target.request(MediaType.APPLICATION_JSON_TYPE)
	    .post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
		  BeanAuthDrive.class);
  
	tokenDrive = bean.getAccess_token();

      ClientRest clientrest=ClientRest.getinstance();
      clientrest.setTokenDrive(tokenDrive);

	return Response.status(Response.Status.OK).entity("<p><a href='"+baseUrl+"userinfo/drive'> Drive Get User Info</a></p>").build();
	
    }
}
