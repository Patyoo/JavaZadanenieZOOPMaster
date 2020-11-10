package app.commands;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandManager {
    private DoctorManager doctorManager;
    private NurseManager nurseManager;
    private CashierManager cashierManager;
    private PatientManager patientManager;
    private GeneralEmployeeManager generalEmployeeManager;

    public CommandManager(){
        Scanner scanner = new Scanner(System.in);
        doctorManager = new DoctorManager(scanner);
        patientManager= new PatientManager(scanner);
        generalEmployeeManager = new GeneralEmployeeManager(scanner);
        int option=1;
        while(option!=0) {
            try {
                System.out.println("Choose type of actions");
                System.out.println("1 - Doktor");
                System.out.println("2 - Nurse");
                System.out.println("3 - Cashier");
                System.out.println("4 - Patient");
                System.out.println("5 - General Employee");
                System.out.println("0 - End");
                option = scanner.nextInt();
                switch(option) {
                    case 1:
                        doctorManager.handleOptions();
                        break;
                    case 4:
                        patientManager.handleOptions();
                        break;
                    case 5:
                        generalEmployeeManager.handleOptions();
                        break;
                    default: option = 0;
                }
            }
            catch(InputMismatchException | NumberFormatException ex ) {
                System.out.println("Invalid Number, Please try again");
            }
        }
//getnut vsekych pacientov a tak




    }

}
