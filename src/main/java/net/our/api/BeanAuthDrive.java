package net.our.api;
public class BeanAuthDrive{
    
    private String acces_token;
    private String token_type;
    private String expires_in;

    public String getAccess_token(){
	return acces_token;
    }  
    public String getToken_type(){
	return token_type;
    }
    public String getExpires_in(){
	return expires_in;
    }
    public void setAccess_token(String acces_token){
	this.acces_token = acces_token;
    }
    public void setToken_type(String token_type){
	this.token_type = token_type;
    }
    public void setExpires_in(String expires_in){
	this.expires_in = expires_in;
    }

}
