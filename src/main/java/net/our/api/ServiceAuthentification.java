package net.our.api;


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




@Path("service")
public class ServiceAuthentification {
	
	@POST
    @Path("/auth")
    public Response authentification(@FormParam("username") String log,@FormParam("password") String mp) throws SQLException {

        try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/projetjxsw","root","");
			Statement st = (Statement) conect.createStatement();
			String req = "select * from user where nom=\""+log+"\" and password=\""+mp+"\"";
			ResultSet res=st.executeQuery(req);
			if(res.first()) {
			String authorize = "http://localhost:8080/";
	    	return Response.seeOther(new URI(authorize)).build();
			}		
			else {
			return Response.serverError().entity("Unable to Process this Request : Utilisateur invalide").build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().entity("Unable to Process this Request ").build();

		}
    }   
	
	
	@GET
    @Path("/id")
    //@Produces(MediaType.APPLICATION_JSON)
    public String getHello( @PathParam("id") int id) {
        //User user = new User(id, "Ali", 23);
        if(id !=2) return "eureur";
        else return "OK";
    } 

}
