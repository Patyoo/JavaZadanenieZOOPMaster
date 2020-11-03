package app.seed;

import app.Ambulance;
import app.humans.Patient;
import app.humans.employees.Cashier;
import app.humans.employees.Doctor;
import app.humans.employees.Nurse;

public class Seeder {

    private static Seeder instanceOfDefaultSeeder;
    private Ambulance ambulanceDefault = new Ambulance("Ambulancia","Tuto");
    private Patient patientDefault = new Patient("Pacient","P",15,0);
    private Doctor doctorDefault = new Doctor("Doktor","Doktor",100,"None");
    private Nurse nurseDefault = new Nurse("Nurse","Nurse",200);
    private Cashier cashierDefault = new Cashier("Cashier","Cash",300);
    private int numOfDrugsDefault[] = {10,10,10};

    public static Seeder getSeederDefault(){
        if(instanceOfDefaultSeeder == null ) instanceOfDefaultSeeder = new Seeder();
        return instanceOfDefaultSeeder;
    }

    public Ambulance getDefaultAmbulance() {
        ambulanceDefault.setDoctor(doctorDefault);
        ambulanceDefault.setNurse(nurseDefault);
        ambulanceDefault.setCashier(cashierDefault);
        ambulanceDefault.addPatient(patientDefault);
        ambulanceDefault.setNumOfDrugs(numOfDrugsDefault);
        return ambulanceDefault;
    }












}
