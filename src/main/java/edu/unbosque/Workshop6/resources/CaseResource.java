package edu.unbosque.Workshop6.resources;

import edu.unbosque.Workshop6.resources.pojos.CasePOJO;
import edu.unbosque.Workshop6.resources.pojos.Data;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cases")
public class CaseResource {

    private Data data= new Data();

    public CaseResource(){
        data.setCases();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Hello, World!";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(CasePOJO casePOJO) {
        if(casePOJO.getType().equals("lost")||casePOJO.getType().equals("stole")||casePOJO.getType().equals("decease")){
            return Response.status(Response.Status.CREATED).entity(casePOJO).build();
        }else{
            return Response.status(Response.Status.NOT_ACCEPTABLE).entity(casePOJO).build();
        }
    }
}