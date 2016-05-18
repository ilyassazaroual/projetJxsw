package net.our.api;

public class ClientInfo {

    private String username = null;
    private String email = null;
    private Double quotaTotal = null;
    private Double quotaUsed = null;
	
    public ClientInfo(){

    }

    public void setUsername(String username){
	this.username = username;
    }
    public String getUsername(){
	return this.username;
    }
    public void setEmail(String email){
	this.username = username;
    }
    public String getEmail(){
	return this.email;
    }
    public void setQuotaTotal(Double quotaTotal){
	this.quotaTotal = quotaTotal;
    }
    public Double getQuotaTotal(){
	return this.quotaTotal;
    }
    public void setQuotaUsed(Double quotaUsed){
	this.quotaUsed = quotaUsed;
    }
    public Double getQuotaUsed(){
	return this.quotaUsed;
    }
}
