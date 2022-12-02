/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shivaniguglani
 */
public class Encounter extends VitalSigns{
    private String medicinePrescribed;
    private String procedure;
    private String diagnosis;
    
    public Encounter(float bodyTemp, int bloodPressure, float weight, float height, 
            String medicinePrescribed , String procedure , String diagnosis){
        super(bodyTemp, bloodPressure, weight, height);
        this.diagnosis = diagnosis;
        this.medicinePrescribed = medicinePrescribed;
        this.procedure = procedure;
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
    

}
