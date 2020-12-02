package app.humans;

import app.humans.employees.Cashier;
import app.humans.employees.Doctor;
import app.products.Confirmation;
import app.products.Drug;
import app.products.DrugEnums;

public class Patient  implements Human {
    private String name,surname;
    private int age,ID;
    private boolean isIll;
    private boolean hasReceipt;
    private boolean hasConfirmation;
    private boolean hasDrug;
    private Drug currentDrug;
    private Confirmation confirmation;

    public Patient(String name,String surname,int age,int ID){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.ID=ID;
    }

    public void getSpecificInfo(){
        System.out.println("(Patient) Name: "+name+", Surname: "+surname+", ID: "+ID+" , age: "+age);
    }

    public void getInspection(Doctor currentDoctor){
        this.confirmation = currentDoctor.makeInspection(this);
        this.hasConfirmation=true;
    }

    public void getDrugs(Cashier currentCashier){
        if(hasReceipt){
            currentCashier.giveDrugs(currentDrug.getIndex());
            System.out.println("Patient "+name + " got his Drugs:");
            DrugEnums.getInfo(currentDrug.getIndex());
        }
        else System.out.println("Patient "+name + " does not have a receipt!");

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

    public void setIll(boolean ill) {
        isIll = ill;
    }

    public void setHasReceipt(boolean hasReceipt) {
        this.hasReceipt = hasReceipt;
    }

    public void setConfirmation (Confirmation confirmation) {
        this.confirmation=confirmation;
        this.hasConfirmation = true;
    }

    public void showConfirmation(){
        confirmation.getProductInfo();
    }

    public void setCurrentDrug(Drug drug) {
        this.currentDrug = drug;
    }

    public Drug getCurrentDrug() {
        return currentDrug;

    }

    public boolean hasDrug() {
        return hasDrug;
    }

    public void setHasDrug(boolean hasDrug) {
        this.hasDrug = hasDrug;
    }

}
