package app.humans.employees;

import app.humans.Human;

public class Cashier extends Employee implements Human {
    boolean hasModifiedListOfDrugs;

    public Cashier(String name,String surname,int ID){
        super(name,surname,ID);
    }

    public void getSpecificInfo(){
        System.out.println("(Cashier) Name: "+super.name+", surname: "+super.surname+", ID: "+super.ID + ", modifiedDrugs:"+hasModifiedListOfDrugs+"\n");
    }
    public void prepareAmbulance(){
        System.out.println("Cashier has check the warehouse");
    }

}
