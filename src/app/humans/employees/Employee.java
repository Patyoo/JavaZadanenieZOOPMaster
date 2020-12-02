package app.humans.employees;

import app.Ambulance;

public class Employee implements Worker {
    protected String name,surname;
    protected int ID;
    protected Ambulance currentAmbulance;

    public Employee(String name,String surname,int ID){
        this.name=name;
        this.surname=surname;
        this.ID=ID;
    }

    public void prepareAmbulance(){
        System.out.println("Employee "+this.name+"started working");
        currentAmbulance.getDoctor().addHelperEmployees(this);
    }

    public void getSpecificInfo(){
        System.out.println("(GeneralEmployee) Name: "+name+", surname: "+surname+", ID: "+ID+'\n');
    }
    public String getName(){
        return  name;
    }

    public void setAmbulance(Ambulance ambulance){
        this.currentAmbulance=ambulance;
    }

}
