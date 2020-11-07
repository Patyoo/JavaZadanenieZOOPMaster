package app.products;

import app.Ambulance;
import app.humans.Patient;
import app.humans.employees.Doctor;
import app.humans.employees.Employee;

public class Confirmation implements GeneralProduct{
    private Ambulance ambulance;
    private Patient patient;

    public Confirmation(Ambulance ambulance, Patient patient){
        this.ambulance=ambulance;
        this.patient=patient;
    }

 
    public String getProductInfo() {
        return null;
    }

}
