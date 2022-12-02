/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shivaniguglani
 */
public class EncounterHistory extends Encounter{
    
    
    public EncounterHistory(float bodyTemp, int bloodPressure, float weight, float height, 
            String medicinePrescribed , String procedure , String diagnosis){
        super(bodyTemp, bloodPressure, weight, height, medicinePrescribed, procedure , diagnosis);
    }
    
}
