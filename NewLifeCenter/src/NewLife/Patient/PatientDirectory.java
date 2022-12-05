/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Patient;

import java.util.ArrayList;

/**
 *
 * @author shivaniguglani
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        this.patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public void addPatient(Patient newPatient){      
        
        patientList.add(newPatient);   
    }
    
    public void deletePatient(Patient p){
        
        System.out.println(patientList.size());
        for(int i=0 ; i < patientList.size() ; i++){  
            if(patientList.get(i) == p)
                patientList.remove(i);
        }
    }
    
    public Patient searchPatient(int patientID, String firstName, String lastName, 
            String city, String email, int ssn, int zipCode){
        
        for(int i=0 ; i < patientList.size() ; i++){            
            if(patientList.get(i).getFirstName().equals(firstName)){
                return patientList.get(i);
            }
            if(patientList.get(i).getLastName().equals(lastName)){
                return patientList.get(i);
            }
            if(patientList.get(i).getCity().equals(city)){
                return patientList.get(i);
            }
            if(patientList.get(i).getEmail().equals(email)){
                return patientList.get(i);
            }
            if(patientList.get(i).getSsn()==(ssn)){
                return patientList.get(i);
            }
            if(patientList.get(i).getPatientID()==(patientID)){
                return patientList.get(i);
            }
            if(patientList.get(i).getZipCode()==(zipCode)){
                return patientList.get(i);
            }
        }
        return null;
    }
}
