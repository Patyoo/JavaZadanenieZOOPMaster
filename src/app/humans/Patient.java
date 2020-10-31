package app.humans;

public class Patient {
    private String name,surname;
    private int age,ID;
    private boolean isIll,hasReceipt,hasConfirmation;
    //recept a confirmation Object pridat;

    public Patient(String name,String surname,int age,int ID){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.ID=ID;
    }



}
