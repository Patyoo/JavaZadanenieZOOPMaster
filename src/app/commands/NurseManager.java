package app.commands;

import app.global.Instances;
import app.humans.employees.Nurse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NurseManager extends GeneralManager{
    private Scanner scanner;
    public NurseManager(){
        this.scanner=super.getScanner();;
    }

    public void addNurseToInstances(){
        scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Surname: ");
        String surname = scanner.nextLine();
        System.out.println("id: ");
        int id = scanner.nextInt();
        Instances.addGlobalNurse( new Nurse(name,surname,id));
    }


    public void getInfoNurse(){
        scanner.nextLine();
        System.out.println("Type name of searched nurse");
        String nameOfSearchedCNurse = scanner.nextLine();
        boolean found=false;
        for(Nurse nurse : Instances.getGlobalNurses()){
            if(nurse.getName().equals(nameOfSearchedCNurse)){
                found=true;
                System.out.println("Doctor by name "+nameOfSearchedCNurse+" was found! More info:");
                nurse.getSpecificInfo();
                break;
            }
        }
        if(!found){
            System.out.println("Doctor by name "+nameOfSearchedCNurse+" was not found! More info:");
        }

    }

    public void handleOptions(){
        try {
            System.out.println("Available actions:");
            System.out.println("1 - Add new Nurse");
            System.out.println("2 - Get info about Nurse ");
            int option = scanner.nextInt();
            switch(option) {
                case 0: break;
                case 1:
                    addNurseToInstances();
                    break;
                case 2:
                    getInfoNurse();
                    break;
            }
        }
        catch(InputMismatchException | NumberFormatException ex ) {
            System.out.println("Invalid Number, Please try again");
        }

    }
}
