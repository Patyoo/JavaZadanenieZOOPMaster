package app.commands;

import app.global.Instances;
import app.humans.employees.Cashier;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CashierManager {

    private Scanner scanner;
    public CashierManager(Scanner scanner){
        this.scanner=scanner;
    }

    public void addCashierToInstances(){
        scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Surname: ");
        String surname = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("id: ");
        int id = scanner.nextInt();
        Instances.addGlobalCashier( new Cashier(name,surname,id));
    }


    public void getInfoCashier(){
        scanner.nextLine();
        System.out.println("Type name of searched cashier");
        String nameOfSearchedCashier = scanner.nextLine();
        boolean found=false;
        for(Cashier cashier : Instances.getGlobalCashiers()){
            if(cashier.getName().equals(nameOfSearchedCashier)){
                found=true;
                System.out.println("Doctor by name "+nameOfSearchedCashier+" was found! More info:");
                cashier.getSpecificInfo();
                break;
            }
        }
        if(!found){
            System.out.println("Doctor by name "+nameOfSearchedCashier+" was not found! More info:");
        }

    }

    public void handleOptions(){
        try {
            System.out.println("Available actions:");
            System.out.println("1 - Add new Cashier");
            System.out.println("2 - Get info about Cashier ");
            int option = scanner.nextInt();
            switch(option) {
                case 1:
                    addCashierToInstances();
                    break;
                case 2:
                    getInfoCashier();
                    break;
            }
        }
        catch(InputMismatchException | NumberFormatException ex ) {
            System.out.println("Invalid Number, Please try again");
        }

    }
}
