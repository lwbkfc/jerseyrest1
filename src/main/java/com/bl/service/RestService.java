package com.bl.service;

import com.bl.entity.User;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by lwb on 15/8/19.
 */
@Path("/restService")
public class RestService {
    @GET
    @Path("/getUserText")
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserText(){
        return "Hello,World!";

    }

    @GET
    @Path("/getUserXml")
    @Produces(MediaType.APPLICATION_XML)
    public User getUserXml(){
        User user = new User();
        user.setName("snail");
        user.setAge("22");
        user.setSex("male");
        return user;
    }

    @GET
    @Path("/getUserJson")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserJson(){
        User user = new User();
        user.setName("snail");
        user.setAge("22");
        user.setSex("male");
        return user;
    }
}





































