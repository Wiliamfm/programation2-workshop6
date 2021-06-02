package edu.unbosque.Workshop6.resources;

import edu.unbosque.Workshop6.resources.pojos.VisitPOJO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/veterinary/visit")
public class VisitResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response visit(VisitPOJO visitPOJO) {
        if(visitPOJO.getType().equals("esterilización") || visitPOJO.getType().equals("vacunación") || visitPOJO.getType().equals("desparasitación") || visitPOJO.getType().equals("urgencia") || visitPOJO.getType().equals("control")){
            return Response.status(Response.Status.CREATED).entity(visitPOJO).build();
        }else if(visitPOJO.getType().equals("implantación") && !(visitPOJO.getMicroship()==null)){
            return Response.status(Response.Status.CREATED).entity(visitPOJO).build();
        }else{
            return Response.status(Response.Status.NOT_ACCEPTABLE).entity(visitPOJO).build();
        }
    }
}