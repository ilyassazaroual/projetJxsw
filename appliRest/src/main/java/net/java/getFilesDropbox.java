import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import com.sun.jersey.oauth.client.OAuthClientFilter;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthSecrets;


public class getFilesDropbox {


    private static final String CONSUMER_KEY = "lut9d352qvqerw7";
    private static final String CONSUMER_SECRET = "cl3vm2hl6wvca2r";
    private static final String REQUEST_TOKEN_URL = "https://api.dropbox.com/1/oauth/request_token";
    private static final String AUTHORIZE_URL = "https://www.dropbox.com/1/oauth/authorize";
    private static final String ACCESS_TOKEN_URL = "https://api.dropbox.com/1/oauth/access_token";
 
 
  
    private static String OAUTH_TOKEN;
    private static String OAUTH_TOKEN_SECRET;
 


    @GET
    @Path("/service")
    public String authorize() {
    
 
             URL url=new URL("https://www.dropbox.com/1/oauth/authorize?response_type=code&client_id=lut9d352qvqerw7&
                redirect_uri=http://localhost:9000/rest/authorize");
            HttpURLConnection connection;
            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", USER_AGENT);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(connection.getOutputStream());
            outputStreamWriter.write(tokenUri.toString());
            outputStreamWriter.flush();
            InputStreamReader inputStreamReader=new InputStreamReader(connection.getInputStream());
            String responseDropBox=inputStreamReader.text;
            System.out.print(" "+responseDropBox);

    } 

    @GET
    (/authorize) 
    public String getRequestToken() {
                System.out.println(" Je suis là ");

    } 

     @GET
    public String getAccessToken() {

    
    } 
}
