package app.humans.employees;

import app.Ambulance;
import app.humans.Patient;
import app.products.Confirmation;

public class Doctor extends Employee implements Human{
    private String expertise;
    private boolean hasPatient;
    private Confirmation confirmation;

    public Doctor(String name,String surname,int ID,String expertise){
        super(name,surname,ID);
    }

    public String getName(){
        return super.getName();
    }

    public void getSpecificInfo(){
        System.out.println("(Doctor) Name: "+super.name+", surname: "+super.surname+", ID: "+super.ID + ", expertise: "+expertise);
    }

    public void createConfirmation(Ambulance ambulance,Patient patient){
        this.confirmation=new Confirmation(ambulance,patient);
    }
}
