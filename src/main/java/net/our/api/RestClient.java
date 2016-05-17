/*
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.apache.http.client.ClientProtocolException;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.PrintWriter;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.Header;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.NameValuePair;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.util.EntityUtils;
import org.apache.http.entity.StringEntity;
import java.text.ParseException;
import org.json.*;
import com.google.common.collect.ImmutableMap;
import com.sun.jersey.multipart.FormDataParam;

@Path("/")
public class ResClient {
  private RestClientDropbox dropbox = null;
  private RestClientDrive drive = null;  //TODO change MAP<String, IKiwiShare>

  public ResClient() {
    dropbox = RestClientDropbox.getInstance();
    drive = RestClientDrive.getInstance();
  }

  @GET
  @Path("authorize")
  public Response getAuthUrl() {
    //TODO for services.
    JSONArray responses = new JSONArray();
    JSONObject dropboxResponse = _dropbox.getAuthUrl();
    dropboxResponse.put("service", "dropbox");
    responses.put(dropboxResponse);
    JSONObject driveResponse = _drive.getAuthUrl();
    driveResponse.put("service", "drive");
    responses.put(driveResponse);

    JSONObject result = new JSONObject();
    result.put("urls", responses);
    return Response.status(200).entity(result.toString()).build();
  }


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
  @Path("/callbackDropbox")
  @Override
  public Response authentificateDropbox(@QueryParam("code") String code, @QueryParam("error") String error) {
    return Response.status(200).entity(_dropbox.authentificate(code, error).toString()).build();
  }

  @GET
  @Path("/callbackDrive")
  @Override
  public Response authentificateDrive(@QueryParam("code") String code, @QueryParam("error") String error) {
    return Response.status(200).entity(_drive.authentificate(code, error).toString()).build();
  }

  @GET
  @Path("/get")
  @Override
  public Response getFileInfo(@QueryParam("path") String file) {
    JSONObject result = new JSONObject();
    result.put("dropbox", _dropbox.getFileInfo(file));
    result.put("drive", _drive.getFileInfo(file));
    return Response.status(200).entity(result.toString()).build();
  }

  @POST
  @Path("/put")
  @Override
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  public Response sendFile(@FormDataParam("file") InputStream file, @QueryParam("path") String destination) {
    JSONObject result = new JSONObject();
    try {
      byte[] byteArray = IOUtils.toByteArray(file);
      InputStream inputDrop = new ByteArrayInputStream(byteArray);
      InputStream inputDrive = new ByteArrayInputStream(byteArray);
      result.put("dropbox", _dropbox.sendFile(inputDrop, destination));
      result.put("drive", _drive.sendFile(inputDrive, destination));
    } catch (Exception e) {
      result.put("err", e.getMessage());
    }
    return Response.status(200).entity(result.toString()).build();
  }


  @GET
  @Path("/info")
  @Override
  public Response getSpaceInfo() {
    JSONObject result = new JSONObject();
    result.put("dropbox", _dropbox.getSpaceInfo());
    result.put("drive", _drive.getSpaceInfo());
    return Response.status(200).entity(result.toString()).build();
  }

  @GET
  @Path("/mkdir")
  @Override
  public Response mkdir(@QueryParam("path") String folder) {
    JSONObject result = new JSONObject();
    result.put("dropbox", _dropbox.mkdir(folder));
    result.put("drive", _drive.mkdir(folder));
    return Response.status(200).entity(result.toString()).build();
  }

  @GET
  @Path("/rm")
  @Override
  public Response removeFile(@QueryParam("path") String file) {
    JSONObject result = new JSONObject();
    result.put("dropbox", _dropbox.removeFile(file));
    result.put("drive", _drive.removeFile(file));
    return Response.status(200).entity(result.toString()).build();
  }

  @GET
  @Path("/mv")
  @Override
  public Response moveFile(@QueryParam("from") String from, @QueryParam("to") String to) {
    JSONObject result = new JSONObject();
    result.put("dropbox", _dropbox.moveFile(from, to));
    result.put("drive", _drive.moveFile(from, to));
    return Response.status(200).entity(result.toString()).build();
  }

  @GET
  @Path("/share")
  @Override
  public Response shareFile(@QueryParam("path") String file) {
    JSONObject result = new JSONObject();
    result.put("dropbox", _dropbox.shareFile(file));
    result.put("drive", _drive.shareFile(file));
    return Response.status(200).entity(result.toString()).build();
  }


  @GET
  @Path("/tree")
  @Override
  public Response tree(@QueryParam("merge") String merge) {
    JSONObject result = new JSONObject();
    JSONArray files = _dropbox.tree().getJSONArray("files");
    JSONArray temp = _drive.tree().getJSONArray("files");
    if(merge != null && (merge.equals("true") || merge.equals("1"))) {
      List<String> alreadyAdded = new ArrayList<String>();
      for(int i = 0; i < files.length(); ++i) {
        alreadyAdded.add(files.getJSONObject(i).getString("path"));
      }
      for(int i = 0; i < temp.length(); i++) {
        String pathToAdd = temp.getJSONObject(i).getString("path");
        if(!alreadyAdded.contains(pathToAdd)) {
          files.put(temp.getJSONObject(i));
          alreadyAdded.add(pathToAdd);
        }
      }
      result.put("files", files);
    } else {
      result.put("dropbox", files);
      result.put("drive", temp);
    }
    return Response.status(200).entity(result.toString()).build();
  }
}

*/