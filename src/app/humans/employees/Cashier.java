package app.humans.employees;

import app.Ambulance;
import app.global.Instances;
import app.products.DrugEnums;

public class Cashier extends Employee implements Worker {
    boolean hasModifiedListOfDrugs;
    private Ambulance currentAmbulance;

    public Cashier(String name,String surname,int ID){
        super(name,surname,ID);
    }

    public void getSpecificInfo(){
        System.out.println("(Cashier) Name: "+super.name+", surname: "+super.surname+", ID: "+super.ID + ", modifiedDrugs:"+hasModifiedListOfDrugs+"\n");
    }
    public void prepareAmbulance(){
        System.out.println("Cashier " +super.name+" has checked the warehouse\n");
        controlAmounts();
    }

    public void giveDrugs(int indexOfDrug){
        Instances.removeGlobalNumOfDrug(indexOfDrug,1);
        currentAmbulance.removeNumOfDrugs(indexOfDrug,1);
    }

    public void controlAmounts(){
        int index=0;
        boolean flag=false;
        for(int drugAmount : currentAmbulance.getNumOfDrugs()){
            if(drugAmount==0){
                System.out.println("Ambulance has run out of:"+ DrugEnums.getName(index));
                flag=true;
                break;
            }
            index++;
        }
        if(!flag) System.out.println("Ambulance has every drug in warehouse");
    }

    public void setAmbulance(Ambulance ambulance){
        this.currentAmbulance=ambulance;
    }

}
