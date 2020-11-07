package app.commands;

import app.global.Instances;

import app.humans.employees.Doctor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoctorManager implements InputManager{

    private Scanner scanner;
    public DoctorManager(Scanner scanner){
        this.scanner=scanner;
    }

    public void addDoctorToInstances(){
        scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Surname: ");
        String surname = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("id: ");
        int id = scanner.nextInt();
        System.out.println("Expertise: ");
        String expertise = scanner.nextLine();
        Instances.addGlobalDoctor( new Doctor(name,surname,id,expertise));
    }


    public void getInfoDoctor(){
        scanner.nextLine();
        System.out.println("Type name of searched doctor");
        String nameOfSearchedDoctor = scanner.nextLine();
        boolean found=false;
        for(Doctor doctor : Instances.getGlobalDoctors()){
            if(doctor.getName().equals(nameOfSearchedDoctor)){
                found=true;
                System.out.println("Doctor by name "+nameOfSearchedDoctor+" was found! More info:");
                System.out.println(doctor.getInfo());
                break;
            }
        }
        if(!found){
            System.out.println("Doctor by name "+nameOfSearchedDoctor+" was not found! More info:");
        }

    }

    public void handleOptions(){
        try {
            System.out.println("Available actions:");
            System.out.println("1 - Add new Doctor");
            System.out.println("2 - Get info about doctor ");
            int option = scanner.nextInt();
            if(option == 1) addDoctorToInstances();
            if(option == 2) getInfoDoctor();
        }
        catch(InputMismatchException | NumberFormatException ex ) {
            System.out.println("Invalid Number, Please try again");
        }

    }
}
