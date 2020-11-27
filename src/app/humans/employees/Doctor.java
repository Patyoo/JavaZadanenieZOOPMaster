package app.humans.employees;

import app.Ambulance;
import app.humans.Human;
import app.humans.Patient;
import app.products.Confirmation;
import app.products.Drug;
import app.products.DrugEnums;

import java.util.Random;

public class Doctor extends Employee implements Human {
    private String expertise;
    private Ambulance currentAmbulance;

    public Doctor(String name,String surname,int ID,String expertise){
        super(name,surname,ID);
    }

    public String getName(){
        return super.getName();
    }

    public void getSpecificInfo(){
        System.out.println("(Doctor) Name: "+super.name+", surname: "+super.surname+", ID: "+super.ID + ", expertise: "+expertise+'\n');
    }
    public void prepareAmbulance(){
        System.out.println("Doctor has cleared the schedule");
    }

    public void setAmbulance(Ambulance ambulance){
        this.currentAmbulance=ambulance;
    }

    public Confirmation makeInspection(Patient patient){
        Random random = new Random();
        //boolean isIll =  random.nextBoolean();
        boolean isIll = true;
        patient.setIll(isIll);
        if(isIll){
            patient.setHasReceipt(true);
            patient.setCurrentDrug(new Drug((int) (Math.random()* DrugEnums.values().length)));
        }
        patient.setHasConfirmation(true);
        return new Confirmation(currentAmbulance,patient,this);

    }


}
