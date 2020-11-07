package app.humans.employees;

public abstract class Employee implements Human {
    private String name,surname;
    private int ID;

    public Employee(String name,String surname,int ID){
        this.name=name;
        this.surname=surname;
        this.ID=ID;
    }

    public String getInfo(){
        return "Name: "+name+", Surname: "+surname+", ID: "+ID;
    }
    public String getName(){
        return  name;
    }

}
