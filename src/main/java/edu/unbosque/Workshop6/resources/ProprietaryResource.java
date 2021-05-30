package edu.unbosque.Workshop6.resources;

import edu.unbosque.Workshop6.resources.pojos.Data;
import edu.unbosque.Workshop6.resources.pojos.PetPOJO;
import edu.unbosque.Workshop6.resources.pojos.ProprietaryPOJO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/proprietary")
public class ProprietaryResource {

    private Data data= new Data();

    public ProprietaryResource(){
        data.setProprietaries();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){
        return Response.status(Response.Status.OK).entity(data.getProprietaryPOJOList()).build();
    }

    @GET
    @Path("/{type}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listFilter(@PathParam("type") String type){
        ArrayList<ProprietaryPOJO> discriminated= new ArrayList<>();
        for (ProprietaryPOJO owner :
                data.getProprietaryPOJOList()) {
            try{
                int auxId= Integer.parseInt(type);
                if(owner.getId()== auxId){
                    discriminated.add(owner);
                }
            }catch(NumberFormatException e){
                if(owner.getName().equals(type) || owner.getNeighborhood().equals(type)){
                    discriminated.add(owner);
                }
            }
        }
        return Response.status(Response.Status.OK).entity(discriminated).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(ProprietaryPOJO proprietaryPOJO){
        return Response.status(Response.Status.CREATED).entity(proprietaryPOJO).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("id") int id, ProprietaryPOJO proprietaryPOJO){
        return Response.status(Response.Status.OK).entity(proprietaryPOJO).build();
    }
}