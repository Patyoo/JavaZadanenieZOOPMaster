package app.main;

import app.Ambulance;
import app.commands.CommandManager;
import app.global.Instances;
import app.humans.Patient;
import app.humans.employees.Cashier;
import app.humans.employees.Doctor;
import app.humans.employees.Employee;
import app.humans.employees.Nurse;
import app.seed.Seeder;

public class Main {
    public static void main(String[] args){

        Seeder defaultSeeder = Seeder.getSeederDefault();
        Instances globalInstances= new Instances(defaultSeeder);

        CommandManager commandManager= new CommandManager();

//        Ambulance ambulance = globalInstances.getAmbulanceInstance();
//
//        System.out.println(ambulance.getCashier().getInfo());
//
//        Employee newCashier= new Cashier("New","Cashier",000);
//
//        ambulance.setCashier(newCashier);
//
//        System.out.println(ambulance.getCashier().getInfo());
//
//        Ambulance newAmbulance = new Ambulance("New","Ambulance");
//        newAmbulance.setCashier( new Cashier("SuperNew","Cashier",000));
//
//        System.out.println(newAmbulance.getCashier().getInfo());
//
//        System.out.println("www");
//        System.out.println(Instances.getGlobalCashier().getInfo());


        //System.out.println(globalInstances.getCurrentCashier().getInfo());
       // ambulance.setCashier(new Cashier("Novy","Cashier",69));

       // System.out.println(ambulance.getCashier().getInfo());
       // System.out.println(globalInstances.getCurrentCashier().getInfo());

//        System.out.println(ambulance.getDoctor().getInfo());
//
//        System.out.println(globalInstances.getCurrentDoctor().getInfo());

        //Patient pa = ambulance.getPatient("Pacient");
        //System.out.println(pa.getName());

        //Doctor doctor= ambulance.getDoctor();
       // doctor.createConfirmation(ambulance,pa);
    }
}
