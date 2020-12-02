package app.humans.employees;

import app.Ambulance;
import app.humans.Patient;
import app.products.Confirmation;
import app.products.Drug;
import app.products.DrugEnums;

import java.util.ArrayList;
import java.util.Random;

public class Doctor extends Employee implements Worker {
    private String expertise;
    private Ambulance currentAmbulance;
    private ArrayList<Employee> helperEmployees = new ArrayList<>();

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
        System.out.println("\nDoctor "+super.name+" has cleared the schedule");
        int numOfPatients=currentAmbulance.getNurse().getNumOfScheduledPatients();
        if(numOfPatients>1){
            System.out.println("Doctor is expecting a busy day because of the number of patients.("+numOfPatients+")\n");
        }
        else System.out.println("Doctor is not in a hurry because of the number of patients.("+numOfPatients+")\n");
    }

    public void setAmbulance(Ambulance ambulance){
        this.currentAmbulance=ambulance;
    }

    public Confirmation makeInspection(Patient patient){
        Random random = new Random();
        boolean isIll =  random.nextBoolean();
        patient.setIll(isIll);
        if(isIll){
            patient.setHasReceipt(true);
            patient.setCurrentDrug(new Drug((int) (Math.random()* DrugEnums.values().length)));
        }
        return new Confirmation(currentAmbulance,patient,this);

    }

    public ArrayList<Employee> getHelperEmployees() {
        return helperEmployees;
    }

    public void addHelperEmployees(Employee helperEmployees) {
        this.helperEmployees.add(helperEmployees);
    }

}
