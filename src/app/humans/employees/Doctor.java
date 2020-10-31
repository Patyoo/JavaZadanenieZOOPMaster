package app.humans.employees;

public class Doctor extends Employee {
    String expertise;
    boolean hasPatient;

    public Doctor(String name,String surname,int ID,String expertise){
        super(name,surname,ID);
    }
}
