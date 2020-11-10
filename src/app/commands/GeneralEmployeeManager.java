package app.commands;

import app.global.Instances;
import app.humans.employees.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GeneralEmployeeManager implements InputManager{

    private Scanner scanner;
    public GeneralEmployeeManager(Scanner scanner){
        this.scanner=scanner;
    }

    public void addGeneralEmployeeToInstances(){
        scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Surname: ");
        String surname = scanner.nextLine();
        System.out.println("id: ");
        int id = scanner.nextInt();
        Instances.addGlobalGeneralEmployee(new Employee(name,surname,id));
    }

    public void getInfoGeneralEmployee(){
        scanner.nextLine();
        System.out.println("Type name of searched patient");
        String nameOfSearchedEmployee = scanner.nextLine();
        boolean found=false;
        for(Employee employee : Instances.getGlobalEmployees()){
            if(employee.getName().equals(nameOfSearchedEmployee)){
                found=true;
                employee.getSpecificInfo();
                break;
            }
        }
        if(!found){
            System.out.println("Patient by name "+nameOfSearchedEmployee+" was not found! More info:");
        }

    }

    public void handleOptions(){
        try {
            System.out.println("Available actions:");
            System.out.println("1 - Add new General Employee");
            System.out.println("2 - Get info about General Employee ");
            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    addGeneralEmployeeToInstances();
                    break;
                case 2:
                    getInfoGeneralEmployee();
                    break;
            }
        }
        catch(InputMismatchException | NumberFormatException ex ) {
            System.out.println("Invalid Number, Please try again");
        }

    }
}
