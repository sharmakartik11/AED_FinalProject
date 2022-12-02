/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Donors;

import java.util.ArrayList;

/**
 *
 * @author shivaniguglani
 */
public class DonorDirectory {
    
    private ArrayList<Donor> DonorList;

    public DonorDirectory(ArrayList<Donor> DonorList) {
        this.DonorList = DonorList;
    }

    public ArrayList<Donor> getDonorList() {
        return DonorList;
    }

    public void setDonorList(ArrayList<Donor> DonorList) {
        this.DonorList = DonorList;
    }
    
    public void addDonor(Donor newDonor){
        DonorList.add(newDonor);
    }
    
    public void deleteMedicine(Donor d){
        
        System.out.println(DonorList.size());
        for(int i=0 ; i < DonorList.size() ; i++){  
            if(DonorList.get(i) == d)
                DonorList.remove(i);
        }
    }
    
    public Donor searchDonor(int DonorID, int IQ, float height, 
            String eyeColor, String occupation, String FamDisHist)
    {
        for(int i=0 ; i < DonorList.size() ; i++){            
            if(DonorList.get(i).getDonorID()==DonorID){
                return DonorList.get(i);
            }
            if(DonorList.get(i).getIQ()==IQ){
                return DonorList.get(i);
            }
            if(DonorList.get(i).getHeight()==height){
                return DonorList.get(i);
            }
            if(DonorList.get(i).getEyeColor().equals(eyeColor)){
                return DonorList.get(i);
            }
            if(DonorList.get(i).getOccupation().equals(occupation)){
                return DonorList.get(i);
            }
            if(DonorList.get(i).getFamilyDiseaseHistory().equals(FamDisHist)){
                return DonorList.get(i);
            }
        }
        return null;
    }
}
