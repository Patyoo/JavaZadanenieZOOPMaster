package app.products;

import app.Ambulance;
import app.humans.Patient;
import app.humans.employees.Doctor;

public class Confirmation implements GeneralProduct{
    private Ambulance ambulance;
    private Patient patient;
    private Doctor doctor;

    public Confirmation(Ambulance ambulance, Patient patient,Doctor doctor){
        this.ambulance=ambulance;
        this.patient=patient;
        this.doctor=doctor;
    }

    public String getProductInfo() {
        return null;
    }

}
