/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author shivaniguglani
 */
public class EncounterHistory extends Encounter{
    
    private ArrayList<Encounter> encounterList; 
    
    public EncounterHistory(float bodyTemp, int bloodPressure, float weight, float height, 
            String medicinePrescribed , String procedure , String diagnosis, Date encounterDate){
        super(bodyTemp, bloodPressure, weight, height, medicinePrescribed, procedure , diagnosis, encounterDate);
        this.encounterList = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public void addEncounter(Encounter newEncounter){
        encounterList.add(newEncounter);        
    }
    
    public void deleteEncounter(Encounter encount){
        encounterList.remove(encount);
    }
    
    // public ArrayList<Appointment> findAppointmentByCounsellor(String counsellorID, ArrayList<Appointment> listOfAppointments)
    
    public ArrayList<Encounter> findEncounterByDate(Date encounterDate, ArrayList<Encounter> encounterList){
        ArrayList<Encounter> encounterListByDate = new ArrayList<Encounter>();
        for (Encounter enc : encounterList)
        {
            if (enc.getEncounterDate().equals(encounterDate)){
                encounterListByDate.add(enc);
            }
        }
        return encounterListByDate;
    }
}
