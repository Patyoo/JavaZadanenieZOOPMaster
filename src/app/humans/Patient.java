package app.humans;

import app.humans.employees.Human;
import app.products.Confirmation;

public class Patient  implements Human {
    private String name,surname;
    private int age,ID;
    private boolean isIll,hasReceipt,hasConfirmation;
    private Confirmation confirmation;

    public Patient(String name,String surname,int age,int ID){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.ID=ID;
    }

    public void addConfirmation(Confirmation confirmation){
        this.confirmation=confirmation;
    }

    public void getSpecificInfo(){
        System.out.println("(Patient) Name: "+name+", Surname: "+surname+", ID: "+ID+" , age: "+age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public boolean isIll() {
        return isIll;
    }

    public boolean isHasReceipt() {
        return hasReceipt;
    }

    public boolean isHasConfirmation() {
        return hasConfirmation;
    }

}
