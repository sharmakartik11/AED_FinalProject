/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medicines;

import java.util.ArrayList;

/**
 *
 * @author shivaniguglani
 */
public class MedicineDirectory {
    
    private ArrayList<Medicine> medicineList;

    public MedicineDirectory(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public void addMedicine(Medicine newMedicine){
        medicineList.add(newMedicine);
    }
    
    public void deleteMedicine(Medicine m){
        
        System.out.println(medicineList.size());
        for(int i=0 ; i < medicineList.size() ; i++){  
            if(medicineList.get(i) == m)
                medicineList.remove(i);
        }
    }
    
    public Medicine searchMedicine(int medID, String name, String Manufacturer, String Type, int power, int medCost){
        for(int i=0 ; i < medicineList.size() ; i++){            
            if(medicineList.get(i).getMedicineName().equals(name)){
                return medicineList.get(i);
            }
            if(medicineList.get(i).getMedManufacturer().equals(Manufacturer)){
                return medicineList.get(i);
            }
            if(medicineList.get(i).getMedicineType().equals(Type)){
                return medicineList.get(i);
            }
            if(medicineList.get(i).getMedicineCost()==medCost){
                return medicineList.get(i);
            }
            if(medicineList.get(i).getMedPower()==power){
                return medicineList.get(i);
            }
            if(medicineList.get(i).getMedID()==medID){
                return medicineList.get(i);
            }
        }
    return null;
    }

}
