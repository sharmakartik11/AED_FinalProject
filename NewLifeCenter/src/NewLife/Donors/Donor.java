/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Donors;

import NewLife.Patient.Person;
import NewLife.UserAccount.UserAccount;

/**
 *
 * @author shivaniguglani
 */
public class Donor extends UserAccount{
    
    private int donorID;
    private String eggType;
    private float height;
    private float weight;
    private String eyeColor;
    private int IQ;
    private String occupation;
    private String familyDiseaseHistory;

    public Donor(int donorID, String eggType, float height, float weight, String eyeColor, int IQ, String occupation, String familyDiseaseHistory, String firstName, String lastName, String buildingName, String unitNumber, String city, String state, int zipCode, String email, int ssn, int age, String gender) {
        
        this.donorID = donorID;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.IQ = IQ;
        this.occupation = occupation;
        this.familyDiseaseHistory = familyDiseaseHistory;
    }

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getFamilyDiseaseHistory() {
        return familyDiseaseHistory;
    }

    public void setFamilyDiseaseHistory(String familyDiseaseHistory) {
        this.familyDiseaseHistory = familyDiseaseHistory;
    }
    
    public enum familyDiseaseHistory{
        Diabetes,
        Alzhiemers,
        Cancer,
        SickleCellAnemia,
        Thalassemia,
        ChromosomalAnomality;
}
    
    public enum occupation{
        BusinessOwner,
        Corporate,
        Law,
        Education,
        Engineering,
        Farming,
        Healthcare,
        EntertainmentAndMedia,
        Construction,
        Finance;
    }
    
}
