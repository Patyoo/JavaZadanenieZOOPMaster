package app.commands;

import app.global.Instances;
import app.humans.employees.Employee;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeManager extends GeneralManager {
    private Scanner scanner;
    public EmployeeManager(){
        this.scanner=super.getScanner();
    }

    public void addEmployeeToInstances(){
        scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Surname: ");
        String surname = scanner.nextLine();
        System.out.println("id: ");
        int id = scanner.nextInt();
        Instances.addGlobalDoctor( new Employee(name,surname,id));
    }


    public void getInfoEmployee(){
        scanner.nextLine();
        System.out.println("Type name of searched employee");
        String nameOfSearchedEmployee = scanner.nextLine();
        boolean found=false;
        for(Employee employee : Instances.getGlobalEmployees()){
            if(employee.getName().equals(nameOfSearchedEmployee)){
                found=true;
                System.out.println("Employee by name "+nameOfSearchedEmployee+" was found! More info:");
                employee.getSpecificInfo();
                break;
            }
        }
        if(!found){
            System.out.println("Doctor by name "+nameOfSearchedEmployee+" was not found! More info:");
        }

    }

    public void handleOptions(){
        try {
            System.out.println("Available actions:");
            System.out.println("1 - Add new Employee");
            System.out.println("2 - Get info about employee ");
            int option = scanner.nextInt();
            switch(option) {
                case 0: break;
                case 1:
                    addEmployeeToInstances();
                    break;
                case 2:
                    getInfoEmployee();
                    break;
            }
        }
        catch(InputMismatchException | NumberFormatException ex ) {
            System.out.println("Invalid Number, Please try again");
        }

    }
}

