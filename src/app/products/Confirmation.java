package app.products;

import app.Ambulance;
import app.humans.Patient;
import app.humans.employees.Doctor;
import app.humans.employees.Employee;

public class Confirmation {
    private Ambulance ambulance;
    private Patient patient;

    public Confirmation(Ambulance ambulance, Patient patient){
        this.ambulance=ambulance;
        this.patient=patient;
    }
}
