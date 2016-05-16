package net.java;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;






@Path("/service")
public class Service {
	
	@POST
    @Path("/{auth}")
	@Consumes("application/x-www-form-urlencoded")
    public String authentification( @FormParam("log") String log,@FormParam("mp") String mp) throws SQLException {
        System.out.println("********************"+log);
        String str="";
        try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("pilote chargé");
			Connection conect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/projetjxsw","root","");
			Statement st = (Statement) conect.createStatement();
			String req = "select * from user where login=\""+log+"\" and password=\""+mp+"\"";
			System.out.println("**********"+req);
			ResultSet res=st.executeQuery(req);
			if(res.first()) str= "OK";
			else str = "erreur d'authentidfication";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        return str;
    }   
	
	
	
	@GET
    @Path("/{id}")
    //@Produces(MediaType.APPLICATION_JSON)
    public String getHello( @PathParam("id") int id) {
        //User user = new User(id, "Ali", 23);
        if(id !=2) return "eureur";
        else return "OK";
    } 

}
