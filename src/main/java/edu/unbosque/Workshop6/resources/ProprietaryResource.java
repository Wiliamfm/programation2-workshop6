package edu.unbosque.Workshop6.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/proprietary")
public class ProprietaryResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String no(){
        return "aa";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello, World!";
    }
}