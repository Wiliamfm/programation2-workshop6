package edu.unbosque.Workshop6.resources;

import edu.unbosque.Workshop6.resources.pojos.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/show")
public class InfoResource {

    private Data data= new Data();

    public InfoResource(){
    }

    @GET
    @Path("/owners")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOwners() {
        data.setProprietaries();
        ArrayList<Info> total=new ArrayList<>();
        ArrayList<String> neighborhoods=new ArrayList<>();
        for (ProprietaryPOJO owner :
                data.getProprietaryPOJOList()) {
            Info info = new Info(owner.getNeighborhood(),1);
            setTotal(neighborhoods, total, info);
        }
        return Response.status(Response.Status.OK).entity(total).build();
    }

    @GET
    @Path("/pets")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPets() {
        data.setPets();
        data.setVisits();
        ArrayList<Info> total1=new ArrayList<>();
        ArrayList<Info> total2=new ArrayList<>();
        ArrayList<Info> total3=new ArrayList<>();
        ArrayList<Info> total4=new ArrayList<>();
        ArrayList<Info> total5=new ArrayList<>();
        ArrayList<Info> total6=new ArrayList<>();
        ArrayList<String> val1=new ArrayList<>();
        ArrayList<String> val2=new ArrayList<>();
        ArrayList<String> val3=new ArrayList<>();
        ArrayList<String> val4=new ArrayList<>();
        ArrayList<String> val5=new ArrayList<>();
        ArrayList<String> val6=new ArrayList<>();
        for (PetPOJO pet :
                data.getPetPOJOList()) {
            Info info1 = new Info(pet.getSpecie(),1);
            Info info2 = new Info(pet.getRace(),1);
            Info info3 = new Info(pet.getSize(),1);
            Info info4 = new Info(pet.getSex(),1);
            Info info5 = new Info(pet.getMicroship(), 1);
            setTotal(val1, total1, info1);
            setTotal(val2, total2, info2);
            setTotal(val3, total3, info3);
            setTotal(val4, total4, info4);
            if(!info5.getValue().equals("")){
                Info aux= new Info("NumberWithMicroship", 1);
                setTotal(val5, total5, aux);
            }
        }
        for (VisitPOJO visit :
                data.getVisitPOJOList()) {
            Info info6 = new Info(visit.getType(), 1);
            if(info6.getValue().equals("esterilización")){
                Info aux= new Info("NumberSterilizations", 1);
                setTotal(val6, total6, aux);
            }
        }
        ArrayList<ArrayList> total= new ArrayList<>();
        total.add(total1);
        total.add(total2);
        total.add(total3);
        total.add(total4);
        total.add(total5);
        total.add(total6);
        return Response.status(Response.Status.OK).entity(total).build();
    }

    @GET
    @Path("/cases")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCases() {
        data.setCases();
        ArrayList<Info> total=new ArrayList<>();
        ArrayList<String> value=new ArrayList<>();
        for (CasePOJO cas :
                data.getCasePOJOList()) {
            Info info = new Info(cas.getType(),1);
            setTotal(value, total, info);
        }
        return Response.status(Response.Status.OK).entity(total).build();
    }

    @GET
    @Path("/visits")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVets() {
        data.setVisits();
        ArrayList<Info> total1=new ArrayList<>();
        ArrayList<Info> total2=new ArrayList<>();
        ArrayList<String> value1=new ArrayList<>();
        ArrayList<String> value2=new ArrayList<>();
        for (VisitPOJO visit :
                data.getVisitPOJOList()) {
            Info info1 = new Info(visit.getType(),1);
            Info info2 = new Info(visit.getVet().getName(),1);
            setTotal(value1, total1, info1);
            setTotal(value2, total2, info2);
        }
        ArrayList<ArrayList> total= new ArrayList<>();
        total.add(total1);
        total.add(total2);
        return Response.status(Response.Status.OK).entity(total).build();
    }

    private void setTotal(ArrayList<String> val, ArrayList<Info> total, Info info){
        if(val.contains(info.getValue())){
            for (Info in :
                    total) {
                if (in.getValue().equals(info.getValue())) {
                    in.setTotal(in.getTotal()+1);
                }
            }
        }else{
            val.add(info.getValue());
            total.add(info);
        }
    }
}