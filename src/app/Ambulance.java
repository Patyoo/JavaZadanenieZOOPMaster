package app;

import app.humans.employees.Cashier;
import app.humans.employees.Doctor;
import app.humans.employees.Employee;
import app.humans.employees.Nurse;

public class Ambulance {
    private String name;
    private String address;
    private Employee doctor,nurse,cashier;

    public Ambulance(String name,String address){
        this.name=name;
        this.address=address;
        System.out.println("Name of Ambulance: "+name+", address:" +address);
    }

    public void addDoctor(Doctor doctor){
        this.doctor=doctor;
        System.out.println("New doctor added to " +name+":  " + this.doctor.getInfo());
    }

    public void addNurse(Nurse nurse){
        this.nurse=nurse;
        System.out.println("New nurse added to " +name+":  " + this.nurse.getInfo());
    }

    public void addCashier(Cashier cashier){
        this.cashier=cashier;
        System.out.println("New cashier added to " +name+":  "+ this.cashier.getInfo());
    }

}
