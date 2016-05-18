package net.our.api;

public class ClientRest {

    public String tokenDropbox = null;
    public String tokenDrive = null;
    public ClientInfo infos;
    
        private static ClientRest instance=null;

    public ClientRest(){
	this.infos = new ClientInfo();
    }

    public void setTokenDropbox(String tokenDropbox){
	this.tokenDropbox = tokenDropbox;
    }
    public String getTokenDropbox(){
	return this.tokenDropbox;
    }
    public void setTokenDrive(String tokenDrive){
	this.tokenDrive = tokenDrive;
    }
    public String getTokenDrive(){
	return this.tokenDrive;
    }
    public void setUsername(String username){
	this.infos.setUsername(username);
    }
    public String getUsername(){
	return this.infos.getUsername();
    }
    public void setEmail(String email){
	this.infos.setEmail(email);
    }
    public String getEmail(){
	return this.infos.getEmail();
    }
    public void setQuotaTotal(Double quotaTotal){
	this.infos.setQuotaTotal(quotaTotal);
    }
    public Double getQuotaTotal(){
	return this.infos.getQuotaTotal();
    }
    public void setQuotaUsed(Double quotaUsed){
	this.infos.setQuotaUsed(quotaUsed);
    }
    public Double getQuotaUsed(){
	return this.infos.getQuotaUsed();
    }
//singleton
        public synchronized static ClientRest getinstance(){
        if(instance==null){
            synchronized (ClientRest.class) {
                    instance=new ClientRest();  
            }
        }
        return instance;
    }
    
}
