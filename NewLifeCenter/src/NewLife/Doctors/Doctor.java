/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Doctors;

import NewLife.Patient.Person;

/**
 *
 * @author shivaniguglani
 */
public class Doctor extends Person{
    
    private int doctorID;
    private String doctorName;
    private String speciality;

    public Doctor(String firstName, String lastName, String buildingName, String unitNumber, String city, 
            String state, int zipCode, String email, int ssn, int age, String gender,
            int doctorID, String doctorName, String speciality) {
        super(firstName, lastName, buildingName, unitNumber, city,  state, zipCode, email, ssn, age, gender);
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.speciality = speciality;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    public enum speciality{
        GeneralPhysician,
        GynaecologyAndObstetrics,
        Urology,
        Embrylogy,
        Neonatologist;
    }
    
}
