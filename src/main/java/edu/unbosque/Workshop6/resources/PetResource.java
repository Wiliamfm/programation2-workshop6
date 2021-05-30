package edu.unbosque.Workshop6.resources;

import edu.unbosque.Workshop6.resources.pojos.Data;
import edu.unbosque.Workshop6.resources.pojos.PetPOJO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/pets")
public class PetResource {

    private Data data= new Data();

    public PetResource(){
        data.setPets();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){
        return Response.status(Response.Status.OK).entity(data.getPetPOJOList()).build();
    }

    @GET
    @Path("/{type}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listFilter(@PathParam("type") String type){
        List<PetPOJO> discriminated= new ArrayList<>();
        for (PetPOJO pet :
                data.getPetPOJOList()) {
            try {
                int auxId = Integer.parseInt(type);
                if (pet.getId() == auxId) {
                    discriminated.add(pet);
                }
            } catch (NumberFormatException e) {
                if (pet.getMicroship().equals(type) || pet.getName().equals(type) || pet.getSpecie().equals(type) || pet.getRace().equals(type) || pet.getSize().equals(type) || pet.getSex().equals(type)) {
                    discriminated.add(pet);
                }
            }
        }
        return Response.status(Response.Status.OK).entity(discriminated).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(PetPOJO petPOJO){
        return Response.status(Response.Status.CREATED).entity(petPOJO).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("id") int id, PetPOJO petPOJO){
        return Response.status(Response.Status.OK).entity(petPOJO).build();
    }
}