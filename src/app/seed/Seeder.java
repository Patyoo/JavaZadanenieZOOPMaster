package app.seed;

import app.Ambulance;
import app.humans.Patient;
import app.humans.employees.Cashier;
import app.humans.employees.Doctor;
import app.humans.employees.Employee;
import app.humans.employees.Nurse;

public class Seeder {

    private static Seeder instanceOfDefaultSeeder;
    private Ambulance ambulanceDefault = new Ambulance("Ambulancia","Tuto");
    private Patient patientDefault = new Patient("Pacient","P",15,0);
    private Employee doctorDefault = new Doctor("Doktor","Doktor",100,"None");
    private Employee nurseDefault = new Nurse("Nurse","Nurse",200);
    private Employee cashierDefault = new Cashier("Cashier","Cash",300);
    private Employee employeeDefault = new Employee("Employee","Hardy",00);
    private int numOfDrugsDefault[] = {10,10,10};

    public static Seeder getSeederDefault(){
        if(instanceOfDefaultSeeder == null ) instanceOfDefaultSeeder = new Seeder();
        return instanceOfDefaultSeeder;
    }

    public Ambulance getDefaultAmbulance() {
        ambulanceDefault.addDoctor(doctorDefault);
        ambulanceDefault.addNurse(nurseDefault);
        ambulanceDefault.addCashier(cashierDefault);
        ambulanceDefault.addPatient(patientDefault);
        ambulanceDefault.setNumOfDrugs(numOfDrugsDefault);
        ambulanceDefault.addEmployee(employeeDefault);
        return ambulanceDefault;
    }












}
