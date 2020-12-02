package app.humans.employees;

import app.Ambulance;
import app.humans.Patient;

public class Nurse extends Employee implements Worker {
    private boolean hasModifiedListOfPatients;
    private Ambulance currentAmbulance;

    public Nurse(String name,String surname,int ID){
        super(name,surname,ID);
    }

    public void getSpecificInfo(){
        System.out.println("(GeneralEmployee) Name: "+super.name+", surname: "+super.surname+", ID: "+super.ID+ ", hasModifiedPatients: "+hasModifiedListOfPatients+'\n');
    }
    public void prepareAmbulance(){
        System.out.println("Nurse "+ super.name +" has opened the ambulance and greeted:");
        for(Patient patient:currentAmbulance.getPatients()){
            System.out.println(patient.getName());
        }
        System.out.println("Ambulance is ready for working!\n");
    }

    public int getNumOfScheduledPatients(){
        return  currentAmbulance.getNumOfPatients();
    }

    public void setAmbulance(Ambulance ambulance){
        this.currentAmbulance=ambulance;
    }

    public boolean hasModifiedListOfPatients() {
        return hasModifiedListOfPatients;
    }

    public void setHasModifiedListOfPatients(boolean hasModifiedListOfPatients) {
        this.hasModifiedListOfPatients = hasModifiedListOfPatients;
    }
}
