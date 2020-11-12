package app.main;

import app.Ambulance;
import app.commands.CommandManager;
import app.global.Instances;
import app.humans.Patient;
import app.humans.employees.Cashier;
import app.humans.employees.Doctor;
import app.humans.employees.Employee;
import app.humans.employees.Nurse;
import app.products.DrugNames;
import app.seed.Seeder;

public class Main {
    public static void main(String[] args) {


        Seeder defaultSeeder = Seeder.getSeederDefault();
        Instances globalInstances = new Instances(defaultSeeder);
        CommandManager commandManager = new CommandManager();

    }

}
