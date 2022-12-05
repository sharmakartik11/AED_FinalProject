/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctors;

import java.util.ArrayList;

/**
 *
 * @author shivaniguglani
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList;
    
    public DoctorDirectory(){
        this.doctorList = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public void addDoctor(Doctor newDoctor){
            doctorList.add(newDoctor);        
    }
    
    public void deleteDoctor(Doctor doc){
        doctorList.remove(doc);
    }
    
    public Doctor searchDoctorBySpeciality(String speciality){
        for (int counterDoc = 0; counterDoc < doctorList.size(); counterDoc++){
            if (doctorList.get(counterDoc).equals(speciality)){
                return doctorList.get(counterDoc);
            }
        }
        return null;
    }
}
