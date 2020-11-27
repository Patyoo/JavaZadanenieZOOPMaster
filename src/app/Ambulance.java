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
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Drug> drugs = new ArrayList<>();
    private int[] numOfDrugs;

    public Ambulance(String name, String address){
        this.name=name;
        this.address=address;
    }

    public void startAmbulance(){
        for(Employee employee : employees){
            employee.prepareAmbulance();
        }
    }

    public Doctor getDoctor() {
        for(Employee employee: employees){
            if(employee instanceof Doctor) return (Doctor) employee;
        }
        return null;
    }

    public void addDoctor(Doctor doctor) {
        employees.add(doctor);
        doctor.setAmbulance(this);
        Instances.addGlobalDoctor(doctor);
    }

    public Nurse getNurse() {
        for(Employee employee: employees){
            if(employee instanceof Nurse) return (Nurse) employee;
        }
        return null;
    }

    public void addNurse(Nurse nurse) {
        employees.add(nurse);
        Instances.addGlobalNurse(nurse);
    }

    public Cashier getCashier() {
        for(Employee employee: employees){
            if(employee instanceof Cashier) return (Cashier) employee;
        }
        return null;
    }

    public void addCashier(Cashier cashier) {
        employees.add(cashier);
        cashier.setAmbulance(this);
        Instances.addGlobalCashier(cashier);
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
        Instances.addGlobalEmployee(employee);

    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public Patient getPatient(String name){
        for(Patient patient: patients){
            if(patient.getName().equals(name)){
                return patient;
            }
        }
        return null;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
        Instances.addGlobalPatient(patient);
    }

    public void removePatient(Patient removePatient){
     patients.remove(removePatient);
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

    public void removeNumOfDrugs(int index, int value) {
        numOfDrugs[index] -= value;
    }

    public void setNumOfDrugs(int[] numOfDrugs) {
        this.numOfDrugs = numOfDrugs;
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

