package app.main;

import app.commands.CommandManager;
import app.global.Instances;
import app.seed.Seeder;

public class Main {
    public static void main(String[] args) {


        Seeder defaultSeeder = Seeder.getSeederDefault();
        Instances globalInstances = new Instances(defaultSeeder);
        CommandManager commandManager = new CommandManager();

    }

}
