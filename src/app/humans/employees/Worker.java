package app.humans.employees;

import app.Ambulance;
import app.humans.Human;

public interface Worker extends Human {
    void prepareAmbulance();
    void setAmbulance(Ambulance ambulance);
}
