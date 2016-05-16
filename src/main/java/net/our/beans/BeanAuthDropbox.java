package net.our.beans;
public class BeanAuthDropbox{
    
    private String acces_token;
    private String token_type;
    private String uid;

    public String getAccess_token(){
	return acces_token;
    }  
    public String getToken_type(){
	return token_type;
    }
    public String getUid(){
	return uid;
    }
    public void setAccess_token(String acces_token){
	this.acces_token = acces_token;
    }
    public void setToken_type(String token_type){
	this.token_type = token_type;
    }
    public void setUid(String uid){
	this.uid = uid;
    }

}
