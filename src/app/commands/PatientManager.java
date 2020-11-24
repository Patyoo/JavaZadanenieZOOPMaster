package app.commands;

import app.global.Instances;
import app.humans.Patient;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientManager extends GeneralManager {

    private Scanner scanner;
    public PatientManager(){
        this.scanner=super.getScanner();;
    }

    public void addPatientToInstances(){
        scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Surname: ");
        String surname = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("id: ");
        int id = scanner.nextInt();
        Instances.addGlobalPatient( new Patient(name,surname,age,id));
    }

    public void getInfoPatient(){
        scanner.nextLine();
        System.out.println("Type name of searched patient");
        String nameOfSearchedPatient = scanner.nextLine();
        boolean found=false;
        for(Patient patient : Instances.getGlobalPatients()){
            if(patient.getName().equals(nameOfSearchedPatient)){
                found=true;
                patient.getSpecificInfo();
                break;
            }
        }
        if(!found){
            System.out.println("Patient by name "+nameOfSearchedPatient+" was not found! More info:");
        }
    }

    public void handleOptions(){
            try {
                System.out.println("Available actions:");
                System.out.println("1 - Add new Patient");
                System.out.println("2 - Get info about patient ");
                int option = scanner.nextInt();

                switch(option) {
                    case 0: break;
                    case 1:
                        addPatientToInstances();
                        break;
                    case 2:
                        getInfoPatient();
                        break;
                }
            }
            catch(InputMismatchException | NumberFormatException ex ) {
                System.out.println("Invalid Number, Please try again");
            }

        }
}

