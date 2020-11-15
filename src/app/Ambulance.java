package app;

import app.global.Instances;
import app.humans.Patient;
import app.humans.employees.Cashier;
import app.humans.employees.Doctor;
import app.humans.employees.Employee;
import app.humans.employees.Nurse;
import app.products.Drug;

import java.util.ArrayList;

public class Ambulance {
    private String name;
    private String address;
    private Employee doctor;
    private Employee nurse;
    private Employee cashier;
    private Employee universalEmployee;
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Drug> drugs = new ArrayList<>();
    private int[] numOfDrugs;

    public Ambulance(String name, String address){
        this.name=name;
        this.address=address;
    }

    public Employee getDoctor() {
        if(doctor instanceof Doctor) return (Doctor) doctor;
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
        Instances.addGlobalDoctor(doctor);
    }

    public Employee getNurse() {
        if(nurse instanceof Nurse) return (Nurse) nurse;
        return nurse;
    }

    public void setNurse(Employee nurse) {
        this.nurse = nurse;
        Instances.addGlobalNurse(nurse);
    }

    public Employee getCashier() {
        if(cashier instanceof Cashier) return (Cashier) cashier;
        return cashier;
    }

    public void setCashier(Employee cashier) {
        this.cashier = cashier;
        Instances.addGlobalCashier(cashier);
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
        Instances.addGlobalPatient(patient);
    }

    public int getNumOfDrugs(int index) {
        return numOfDrugs[index];
    }

    public int[] getNumOfDrugs() {
        return numOfDrugs;
    }

    public void setNumOfDrugs(int index, int value) {
        this.numOfDrugs[index]=value;
    }

    public void setNumOfDrugs(int[] numOfDrugs) {
        this.numOfDrugs = numOfDrugs;
    }

    public Employee getUniversalEmployee() {
        return universalEmployee;
    }

    public void setUniversalEmployee(Employee universalEmployee) {
        this.universalEmployee = universalEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Drug> getDrugs() {
        return drugs;
    }

    public void addDrugs(Drug drug) {
        drugs.add(drug);
    }

}

