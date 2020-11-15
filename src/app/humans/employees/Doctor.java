package app.humans.employees;

import app.humans.Human;

public class Doctor extends Employee implements Human {
    private String expertise;
    private boolean hasPatient;

    public Doctor(String name,String surname,int ID,String expertise){
        super(name,surname,ID);
    }

    public String getName(){
        return super.getName();
    }

    public void getSpecificInfo(){
        System.out.println("(Doctor) Name: "+super.name+", surname: "+super.surname+", ID: "+super.ID + ", expertise: "+expertise);
    }

}
