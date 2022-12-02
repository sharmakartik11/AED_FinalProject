/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encounters;

import Medicines.Medicine;
import Medicines.MedicineDirectory;
import java.util.Date;

/**
 *
 * @author shivaniguglani
 */
public class Encounter extends VitalSigns{
    private String medicinePrescribed;
    private String procedure;
    private String diagnosis;
    private Date encounterDate;
    private MedicineDirectory medicineList;
    
    public Encounter(float bodyTemp, int bloodPressure, float weight, float height, 
            String medicinePrescribed , String procedure , String diagnosis, Date encounterDate){
        super(bodyTemp, bloodPressure, weight, height);
        this.diagnosis = diagnosis;
        this.medicinePrescribed = medicinePrescribed;
        this.procedure = procedure;
        this.encounterDate = encounterDate;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getMedicinePrescribed() {
        return medicinePrescribed;
    }

    public void setMedicinePrescribed(String medicinePrescribed) {
        this.medicinePrescribed = medicinePrescribed;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    public Medicine getMedicineAvailability(String medName){
        for (int i=0; i < medicineList.getMedicineList().size()  ; i++)
        {
            if (medicineList.getMedicineList().get(i).equals(medName)){
                return medicineList.getMedicineList().get(i);
            }
        }
        return null;
    }
}
