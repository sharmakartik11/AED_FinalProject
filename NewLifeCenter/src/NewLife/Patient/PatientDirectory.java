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
    private ArrayList<Patient> patientlist;
    
    public PatientDirectory(){
        patientlist = new ArrayList<Patient>();
    }
    public ArrayList<Patient> getPatientList() {
        return patientlist;
        
    }
    
    public ArrayList<Patient> addPatient(Patient c){
       
        patientlist.add(c);
        return patientlist;
    }
     public ArrayList<Patient> deletePatient(Patient c){
       
        patientlist.remove(c);
        return patientlist;
    }
    
}
