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
    
    private EncounterHistory encounterHistory;
    
    public Patient(String firstName, String lastName, String buildingName, String unitNumber, String city, 
            String state, int zipCode, String email, String password, int ssn, int age){
        super(firstName, lastName, buildingName, unitNumber, city,  state, zipCode, email, password, ssn, age);
    }
        

}
