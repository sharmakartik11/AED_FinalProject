/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Doctors;

import java.util.ArrayList;

/**
 *
 * @author shivaniguglani
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList;
    
    public DoctorDirectory(){
        doctorList = new ArrayList<Doctor>();
    }
    
    public ArrayList<Doctor> addDoctor(Doctor c){
       
        doctorList.add(c);
        return doctorList;
    }
     public ArrayList<Doctor> deleteDoctor(Doctor c){
       
        doctorList.remove(c);
        return doctorList;
    }
    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
        
    }
    
    
    
}
