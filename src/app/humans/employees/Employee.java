package app.humans.employees;

import app.humans.Human;

public class Employee implements Human {
    protected String name,surname;
    protected int ID;

    public Employee(String name,String surname,int ID){
        this.name=name;
        this.surname=surname;
        this.ID=ID;
    }

    public void getSpecificInfo(){
        System.out.println("(GeneralEmployee) Name: "+name+", surname: "+surname+", ID: "+ID);
    }
    public String getName(){
        return  name;
    }

}
