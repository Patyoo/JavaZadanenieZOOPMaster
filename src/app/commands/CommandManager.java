package app.commands;

import app.Ambulance;
import app.global.Instances;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandManager extends GeneralManager {
    private final DoctorManager doctorManager;
    private final NurseManager nurseManager;
    private final CashierManager cashierManager;
    private final PatientManager patientManager;
    private final EmployeeManager employeeManager;
    private Scanner scanner;
    private Ambulance currentAmbulance;

    public CommandManager() {
        currentAmbulance = Instances.getCurrentAmbulance();
        currentAmbulance.startAmbulance();
        scanner = super.getScanner();

        doctorManager = new DoctorManager();
        cashierManager = new CashierManager();
        patientManager = new PatientManager(currentAmbulance);
        nurseManager = new NurseManager();
        employeeManager = new EmployeeManager();

        handleOptions();
    }

    public void handleOptions() {
        System.out.println("\nName of ambulance:" + currentAmbulance.getName()+"\n");
        int option = 1;
        while (option != 0) {
            try {
                System.out.println("Choose type of actions");
                System.out.println("1 - Doctor");
                System.out.println("2 - Nurse");
                System.out.println("3 - Cashier");
                System.out.println("4 - Patient");
                System.out.println("5 - Employee");
                System.out.println("0 - End");
                option = scanner.nextInt();
                switch (option) {
                    case 0:
                        CommandManager.super.closeTerminal();
                        option = 0;
                        break;
                    case 1:
                        doctorManager.handleOptions();
                        break;
                    case 2:
                        nurseManager.handleOptions();
                        break;
                    case 3:
                        cashierManager.handleOptions();
                        break;
                    case 4:
                        patientManager.handleOptions();
                        break;
                    case 5:
                        employeeManager.handleOptions();
                        break;
                }
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("Invalid Number, Please try again");
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }

    }

}
