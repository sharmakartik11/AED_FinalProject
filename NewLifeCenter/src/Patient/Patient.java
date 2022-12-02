/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Encounters.EncounterHistory;

/**
 *
 * @author shivaniguglani
 */
public class Patient extends Person{
    
    private int patientID;
    private EncounterHistory encounterHistory;
    
    public Patient(String firstName, String lastName, String buildingName, String unitNumber, String city, 
            String state, int zipCode, String email, String password, int ssn, int age, int patientID){
        super(firstName, lastName, buildingName, unitNumber, city,  state, zipCode, email, password, ssn, age);
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patiendID) {
        this.patientID = patiendID;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
        
    
}
