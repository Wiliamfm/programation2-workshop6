package edu.unbosque.Workshop6.resources.pojos;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private List<ProprietaryPOJO> proprietaryPOJOList= new ArrayList<>();
    private List<PetPOJO> petPOJOList= new ArrayList<>();
    private List<CasePOJO> casePOJOList= new ArrayList<>();
    private List<VeterinaryPOJO> veterinaryPOJOList= new ArrayList<>();
    private List<VisitPOJO> visitPOJOList= new ArrayList<>();

    public void setProprietaries(){
        proprietaryPOJOList.add(new ProprietaryPOJO("Username1", 0, "name1", "address1", "neighborhood1"));
        proprietaryPOJOList.add(new ProprietaryPOJO("Username2", 1, "name2", "address2", "neighborhood2"));
        proprietaryPOJOList.add(new ProprietaryPOJO("Username3", 2, "name3", "address3", "neighborhood3"));
        proprietaryPOJOList.add(new ProprietaryPOJO("Username4", 0, "name4", "address4", "neighborhood1"));
        ArrayList<PetPOJO> petPOJOList = new ArrayList<>();
        petPOJOList.add(new PetPOJO(0, "microship1", "name1", "species1", "race1", "size1", "sex1", "picture1", new ProprietaryPOJO("Username1", 0, "name1", "address1", "neighborhood1")));
        petPOJOList.add(new PetPOJO(1, "microship2", "name2", "species2", "race2", "size2", "sex2", "picture2", new ProprietaryPOJO("Username1", 0, "name1", "address1", "neighborhood1")));
        petPOJOList.add(new PetPOJO(2, "microship3", "name3", "species3", "race3", "size3", "sex3", "picture3", new ProprietaryPOJO("Username1", 0, "name1", "address1", "neighborhood1")));
        petPOJOList.add(new PetPOJO(3, "microship4", "name4", "species4", "race4", "size4", "sex4", "picture4", new ProprietaryPOJO("Username1", 0, "name1", "address1", "neighborhood1")));
        proprietaryPOJOList.get(0).setPets(petPOJOList);
        petPOJOList.clear();
        petPOJOList.add(new PetPOJO(0, "microship1", "name1", "species1", "race1", "size1", "sex1", "picture1", new ProprietaryPOJO("Username2", 1, "name2", "address2", "neighborhood2")));
        petPOJOList.add(new PetPOJO(1, "microship2", "name2", "species2", "race2", "size2", "sex2", "picture2", new ProprietaryPOJO("Username2", 1, "name2", "address2", "neighborhood2")));
        petPOJOList.add(new PetPOJO(2, "microship3", "name3", "species3", "race3", "size3", "sex3", "picture3", new ProprietaryPOJO("Username2", 1, "name2", "address2", "neighborhood2")));
        petPOJOList.add(new PetPOJO(3, "microship4", "name4", "species4", "race4", "size4", "sex4", "picture4", new ProprietaryPOJO("Username2", 1, "name2", "address2", "neighborhood2")));
        proprietaryPOJOList.get(1).setPets(petPOJOList);
    }

    public void setPets(){
        petPOJOList.add(new PetPOJO(0, "microship1", "name1", "species1", "race1", "size1", "sex1", "../photos/pet1.jpg", new ProprietaryPOJO("Username1", 1, "name1", "address1", "neighborhood1")));
        petPOJOList.add(new PetPOJO(1, "microship2", "name2", "species2", "race2", "size2", "sex2", "../photos/pet2.jpg", new ProprietaryPOJO("Username1", 1, "name1", "address1", "neighborhood1")));
        petPOJOList.add(new PetPOJO(2, "microship3", "name3", "species3", "race3", "size3", "sex3", "../photos/pet3.jpg", new ProprietaryPOJO("Username2", 2, "name2", "address2", "neighborhood2")));
        petPOJOList.add(new PetPOJO(3, "microship4", "name4", "species4", "race4", "size4", "sex4", "../photos/pet4.jpg", new ProprietaryPOJO("Username3", 3, "name3", "address3", "neighborhood3")));
    }

    public void setCases(){
        casePOJOList.add(new CasePOJO(0, "date0", "lost", "desciption0", 0));
        casePOJOList.add(new CasePOJO(0, "date1", "stole", "desciption1", 1));
        casePOJOList.add(new CasePOJO(0, "date2", "decease", "desciption2", 2));
    }

    public void setVets(){
        setVisits();
        veterinaryPOJOList.add((new VeterinaryPOJO("username1", "vet1", "addres1", "neighborhood1", visitPOJOList)));
        veterinaryPOJOList.add((new VeterinaryPOJO("username2", "vet2", "addres2", "neighborhood2", visitPOJOList)));
        veterinaryPOJOList.add((new VeterinaryPOJO("username3", "vet3", "addres3", "neighborhood3", visitPOJOList)));
    }

    public void setVisits(){
        visitPOJOList.add(new VisitPOJO(1, "date1", "esterilización", "desciption1", new VeterinaryPOJO("username1", "vet1", "addres1", "neighborhood1", visitPOJOList), 1, ""));
        visitPOJOList.add(new VisitPOJO(2, "date2", "implantación", "desciption2", new VeterinaryPOJO("username1", "vet1", "addres1", "neighborhood1", visitPOJOList), 3, ""));
        visitPOJOList.add(new VisitPOJO(2, "date3", "esterilización", "desciption3", new VeterinaryPOJO("username3", "vet3", "addres3", "neighborhood3", visitPOJOList), 3, ""));
    }

    //GETTERS ----- SETTERS

    public List<ProprietaryPOJO> getProprietaryPOJOList() {
        return proprietaryPOJOList;
    }

    public void setProprietaryPOJOList(List<ProprietaryPOJO> proprietaryPOJOList) {
        this.proprietaryPOJOList = proprietaryPOJOList;
    }

    public List<PetPOJO> getPetPOJOList() {
        return petPOJOList;
    }

    public void setPetPOJOList(List<PetPOJO> petPOJOList) {
        this.petPOJOList = petPOJOList;
    }

    public List<CasePOJO> getCasePOJOList() {
        return casePOJOList;
    }

    public void setCasePOJOList(List<CasePOJO> casePOJOList) {
        this.casePOJOList = casePOJOList;
    }

    public List<VeterinaryPOJO> getVeterinaryPOJOList() {
        return veterinaryPOJOList;
    }

    public void setVeterinaryPOJOList(List<VeterinaryPOJO> veterinaryPOJOList) {
        this.veterinaryPOJOList = veterinaryPOJOList;
    }

    public List<VisitPOJO> getVisitPOJOList() {
        return visitPOJOList;
    }

    public void setVisitPOJOList(List<VisitPOJO> visitPOJOList) {
        this.visitPOJOList = visitPOJOList;
    }
}
