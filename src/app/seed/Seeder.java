package app.seed;

import app.Ambulance;
import app.humans.Patient;
import app.humans.employees.Cashier;
import app.humans.employees.Doctor;
import app.humans.employees.Employee;
import app.humans.employees.Nurse;

public class Seeder {

    private static Seeder instanceOfDefaultSeeder;
    private static Ambulance ambulanceDefault = new Ambulance("WowAmbulancia","Tuto");
    private static Patient patientDefault = new Patient("TomiPac","P",15,0);
    private static Employee doctorDefault = new Doctor("LaciDok","Doktor",100,"None");
    private static Employee nurseDefault = new Nurse("LauraNur","Nurse",200);
    private static Employee cashierDefault = new Cashier("PetoCas","Cash",300);
    private static Employee employeeDefault = new Employee("AdamEmp","Hardy",00);
    private static int numOfDrugsDefault[] = {10,10,10};

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
