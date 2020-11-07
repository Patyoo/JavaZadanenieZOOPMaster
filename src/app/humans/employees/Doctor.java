package app.humans.employees;

import app.Ambulance;
import app.humans.Patient;
import app.products.Confirmation;

public class Doctor extends Employee {
    private String expertise;
    private boolean hasPatient;
    private Confirmation confirmation;

    public Doctor(String name,String surname,int ID,String expertise){
        super(name,surname,ID);
    }

    public String getName(){
        return super.getName();
    }

    public void createConfirmation(Ambulance ambulance,Patient patient){
        this.confirmation=new Confirmation(ambulance,patient);
    }
}
