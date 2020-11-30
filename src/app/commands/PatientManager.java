package app.commands;

import app.Ambulance;
import app.global.Instances;
import app.humans.Patient;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientManager extends GeneralManager {
    private Ambulance currentAmbulance;
    private Scanner scanner;

    public PatientManager(Ambulance currentAmbulance) {
        this.scanner=super.getScanner();
        this.currentAmbulance=currentAmbulance;
    }

    private void addPatientToInstances(){
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

    private void getInfoPatient(){
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
                System.out.println("3 - Get inspection");
                int option = scanner.nextInt();

                switch(option) {
                    case 0: break;
                    case 1:
                        addPatientToInstances();
                        break;
                    case 2:
                        getInfoPatient();
                        break;
                    case 3:
                        System.out.println("Type patient's name");
                        scanner.nextLine();
                        String patientName= scanner.nextLine();
                        Patient patient = currentAmbulance.getPatient(patientName);
                        if(patient==null){
                            System.out.println("No patient was found in ambulance");
                        }
                        else{
                            patient.getInspection(currentAmbulance.getDoctor());
                            if(patient.isIll()){
                                System.out.println("Patient is ill");
                                patient.getDrugs(currentAmbulance.getCashier());
                                System.out.println("Cashier "+currentAmbulance.getCashier().getName()+" gave "+patient.getCurrentDrug().getProductInfo());
                                System.out.println("Patient picked up the drug and went home\n ");
                            }
                            else{
                                System.out.println("Patient is healthy and is leaving the ambulance\n");
                            }
                            currentAmbulance.removePatient(patient);
                        }


                }
            }
            catch(InputMismatchException | NumberFormatException ex ) {
                System.out.println("Invalid Number, Please try again");
            }

        }
}

