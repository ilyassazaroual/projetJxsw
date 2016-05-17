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



@Path("userfiles")
public class UserFiles {

    @GET
    @Produces ("application/json")
    @Path("/dropbox")
    public Response getUserFilesDropbox() {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://api.dropboxapi.com/").path("1/metadata/auto");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDropbox);
	Response response = invocationBuilder.get();
	return response;
    }

    @GET
    @Produces ("application/json")
    @Path("/drive")
    public Response getUserFilesDrive() {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("https://www.googleapis.com/drive/v2/").path("/files");
	Invocation.Builder invocationBuilder =  target.request(MediaType.APPLICATION_JSON);
	invocationBuilder.header(HttpHeaders.AUTHORIZATION,"Bearer " + Authorize.tokenDrive);
	Response response = invocationBuilder.get();
	return response;
    }


    public JSONObject DriveFiles() {
    JSONObject result = new JSONObject();
    try {
      this.synchronize();
      JSONArray files = new JSONArray();
      for (String key : this._pathToId.keySet()) {
        if(!key.equals("/")) {
          JSONObject file = new JSONObject();
          file.put("path", key);
          files.put(file);
        }
      }
      result.put("files", files);
    } catch (Exception e) {
      Map<String, String> jsonContent = new HashMap();
      jsonContent.put("err", "Can't build tree");
      return new JSONObject(jsonContent);
    }
    return result;
  }
  
  public JSONObject Dropboxfiles() {
    String json=null;
    JSONObject result = new JSONObject();
    try {
      JSONArray path = new JSONArray();
      mkPath("",
      new StringBuilder("https://api.dropboxapi.com/1/metadata/auto/")
      .append("?access_token=").append(_token)
      .toString(),
      path
      );
      result.put("files", path);
    } catch (Exception e) {
      Map<String, String> jsonContent = new HashMap();
      jsonContent.put("err", "Unable to parse json " + json );
      return new JSONObject(jsonContent);
    }
    return result;
  }
}
