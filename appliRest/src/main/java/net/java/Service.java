package net.java;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entites.User;


@Path("/service")
public class Service {
	
	@POST
    @Path("/{auth}")
	@Consumes("application/x-www-form-urlencoded")
    public String authentification( @FormParam("log") String log,@FormParam("mp") String mp) {
        System.out.println("********************"+log);
        if(log.equals("admin") && mp.equals("admin")) return "Authentification réeussie";
        else return "<h3>erreur d'authentidfication</h3>";
    }   
	
	
	
	@GET
    @Path("/{id}")
    //@Produces(MediaType.APPLICATION_JSON)
    public String getHello( @PathParam("id") int id) {
        User user = new User(id, "Ali", 23);
        if(id !=2) return "eureur";
        else return user.getUsername();
    } 

}
