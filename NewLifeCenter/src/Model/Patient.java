/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shivaniguglani
 */
public class Patient extends Person{
    
    private int patiendID;
    private EncounterHistory encounterHistory;
    
    public Patient(String firstName, String lastName, String buildingName, String unitNumber, String city, 
            String state, int zipCode, String email, String password, int ssn, int age, int patientID){
        super(firstName, lastName, buildingName, unitNumber, city,  state, zipCode, email, password, ssn, age);
    }

    public int getPatiendID() {
        return patiendID;
    }

    public void setPatiendID(int patiendID) {
        this.patiendID = patiendID;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
        
    
}
