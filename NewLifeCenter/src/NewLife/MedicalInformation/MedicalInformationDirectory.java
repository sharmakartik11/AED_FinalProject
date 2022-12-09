/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.MedicalInformation;

import java.util.ArrayList;

/**
 *
 * @author kartik
 */
public class MedicalInformationDirectory {
    private ArrayList<MedicalInformation> medInfoList;

    public MedicalInformationDirectory() {
        medInfoList = new ArrayList<>();
    }

    public ArrayList<MedicalInformation> getMedInfoList() {
        return medInfoList;
    }

    public void setMedInfoList(ArrayList<MedicalInformation> medInfoList) {
        this.medInfoList = medInfoList;
    }
    
    public ArrayList<MedicalInformation> addMedInfo(MedicalInformation medInfo){
       
        medInfoList.add(medInfo);
        return medInfoList;
    }
     public ArrayList<MedicalInformation> removeMedInfo(MedicalInformation medInfo){
       
        medInfoList.remove(medInfo);
        return medInfoList;
    }
    
}
