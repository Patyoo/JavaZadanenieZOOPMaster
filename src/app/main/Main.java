package app.main;

import app.Ambulance;
import app.humans.employees.Cashier;
import app.humans.employees.Doctor;
import app.humans.employees.Nurse;

public class Main {
    public static void main(String[] args){
        Ambulance ambulance= new Ambulance("Ambulancia","Tuto");

        ambulance.addDoctor(new Doctor("Peto","Pod",100,"None"));
        ambulance.addNurse(new Nurse("Zdenka","Podhorska",200));
        ambulance.addCashier(new Cashier("Pato","Pod",300));

    }
}
