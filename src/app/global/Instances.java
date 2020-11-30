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
    private static ArrayList<Patient> globalPatients = new ArrayList<>();
    private static ArrayList<Doctor> globalDoctors =  new ArrayList<>();
    private static ArrayList<Nurse> globalNurses =  new ArrayList<>();
    private static ArrayList<Cashier> globalCashiers =  new ArrayList<>();
    private static ArrayList<Employee> globalEmployees = new ArrayList<>();
    private static int[] globalNumOfDrugs;
    private static boolean wasInitialized=false;


    public Instances(Seeder defaultSeeder){
        if(!wasInitialized){
            currentAmbulance=defaultSeeder.getDefaultAmbulance();
            globalPatients=currentAmbulance.getPatients();
            if(currentAmbulance.getDoctor() != null) globalDoctors.add(currentAmbulance.getDoctor());
            if(currentAmbulance.getNurse() != null) globalNurses.add(currentAmbulance.getNurse());
            if(currentAmbulance.getCashier() != null) globalCashiers.add(currentAmbulance.getCashier());
            globalNumOfDrugs=currentAmbulance.getNumOfDrugs();
        }
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

    public static void removeGlobalNumOfDrug(int index,int value) {
        globalNumOfDrugs[index] -= value;
    }

    public static Cashier getGlobalCashier(int index) {
        return globalCashiers.get(index);
    }


    public static ArrayList<Cashier> getGlobalCashiers() {
        return globalCashiers;
    }

    public static ArrayList<Nurse> getGlobalNurses() {
        return globalNurses;
    }

    public static void addGlobalEmployee(Employee employee){
        globalEmployees.add(employee);
    }

    public static ArrayList<Employee> getGlobalEmployees(){
        return globalEmployees;
    }

    public static Ambulance getCurrentAmbulance() {
        return currentAmbulance;
    }

}
