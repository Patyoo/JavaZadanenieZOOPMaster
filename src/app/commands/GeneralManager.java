package app.commands;

import java.util.Scanner;

public abstract class GeneralManager {
    private Scanner scanner= new Scanner(System.in);

    public void closeTerminal(){
        System.out.println("Input manager have been eliminated");
    }
    public Scanner getScanner(){
        return scanner;
    }
    public abstract void handleOptions();
}
