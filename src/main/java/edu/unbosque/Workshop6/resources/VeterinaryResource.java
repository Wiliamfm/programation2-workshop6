package edu.unbosque.Workshop6.resources;

import edu.unbosque.Workshop6.resources.pojos.VeterinaryPOJO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ResourceBundle;

@Path("/veterinary")
public class VeterinaryResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(VeterinaryPOJO veterinaryPOJO) {
        return Response.status(Response.Status.CREATED).entity(veterinaryPOJO).build();
    }

    @PUT
    @Path("/{username}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String id, VeterinaryPOJO veterinaryPOJO){
        veterinaryPOJO.setUsername(id);
        return Response.status(Response.Status.OK).entity(veterinaryPOJO).build();
    }
}