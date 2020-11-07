package app.global;

import app.Ambulance;
import app.humans.Patient;
import app.humans.employees.Cashier;
import app.humans.employees.Doctor;
import app.humans.employees.Employee;
import app.humans.employees.Nurse;
import app.seed.Seeder;

import java.util.ArrayList;

public class Instances {
    private static Ambulance currentAmbulance;
    private static ArrayList<Patient> globalPatients = new ArrayList<Patient>();
    private static ArrayList<Doctor> globalDoctors =  new ArrayList<Doctor>();
    private static ArrayList<Nurse> globalNurses =  new ArrayList<Nurse>();

    private static ArrayList<Cashier> globalCashiers =  new ArrayList<Cashier>();
    private static int[] globalNumOfDrugs;
    private static boolean wasInitialized=false;


    public Instances(Seeder defaultSeeder){
        if(wasInitialized == false){
            currentAmbulance=defaultSeeder.getDefaultAmbulance();
            globalPatients=currentAmbulance.getPatients();
            if(currentAmbulance.getDoctor() instanceof Doctor) globalDoctors.add((Doctor) currentAmbulance.getDoctor());
            if(currentAmbulance.getNurse() instanceof Nurse) globalNurses.add((Nurse) currentAmbulance.getNurse());
            if(currentAmbulance.getCashier() instanceof Cashier) globalCashiers.add((Cashier) currentAmbulance.getCashier());
            globalNumOfDrugs=currentAmbulance.getNumOfDrugs();
        }
    }

    public Ambulance getAmbulanceInstance(){
        return  currentAmbulance;
    }

    public static void addGlobalDoctor(Employee currentDoctor) {
        if(currentDoctor instanceof Doctor) globalDoctors.add((Doctor) currentDoctor);
    }

    public static ArrayList<Doctor> getGlobalDoctors() {
        return globalDoctors;
    }

    public static void addGlobalNurse(Employee currentNurse) {
        if(currentNurse instanceof Nurse) globalNurses.add((Nurse) currentNurse);
    }

    public static void addGlobalCashier(Employee currentCashier) {
        if(currentCashier instanceof Cashier) globalCashiers.add((Cashier) currentCashier);
    }

    public static ArrayList<Patient> getGlobalPatients() {
        return globalPatients;
    }

    public static Patient getGlobalPatient(int index) {
        return globalPatients.get(index);
    }

    public static void addGlobalPatient(Patient newPatient) {
        globalPatients.add(newPatient);
    }

    public static int getGlobalNumOfDrug(int index) {
        return globalNumOfDrugs[index];
    }

    public static void addGlobalNumOfDrug(int index,int value) {
        globalNumOfDrugs[index] += value;
    }

    public static Cashier getGlobalCashier() {
        return globalCashiers.get(3);
    }

}
