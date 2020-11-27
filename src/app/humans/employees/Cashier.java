package app.humans.employees;

import app.Ambulance;
import app.global.Instances;
import app.humans.Human;

public class Cashier extends Employee implements Human {
    boolean hasModifiedListOfDrugs;
    private Ambulance currentAmbulance;

    public Cashier(String name,String surname,int ID){
        super(name,surname,ID);
    }

    public void getSpecificInfo(){
        System.out.println("(Cashier) Name: "+super.name+", surname: "+super.surname+", ID: "+super.ID + ", modifiedDrugs:"+hasModifiedListOfDrugs+"\n");
    }
    public void prepareAmbulance(){
        System.out.println("Cashier has check the warehouse");
    }

    public void giveDrugs(int indexOfDrug){
        //pozriet ci sme nesli na - hodnoty
        Instances.removeGlobalNumOfDrug(indexOfDrug,1);
        currentAmbulance.removeNumOfDrugs(indexOfDrug,1);
    }

    public void setAmbulance(Ambulance ambulance){
        this.currentAmbulance=ambulance;
    }

}
