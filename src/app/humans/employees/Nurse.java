package app.humans.employees;

import app.humans.Human;

public class Nurse extends Employee implements Human {
    boolean hasModifiedListOfPatients;

    public Nurse(String name,String surname,int ID){
        super(name,surname,ID);
    }

    public void getSpecificInfo(){
        System.out.println("(GeneralEmployee) Name: "+super.name+", surname: "+super.surname+", ID: "+super.ID+ ", hasModifiedPatients: "+hasModifiedListOfPatients+'\n');
    }
    public void prepareAmbulance(){
        System.out.println("Doctor has opened the ambulance");
    }
}
