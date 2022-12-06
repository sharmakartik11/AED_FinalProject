/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.LabAssistant;

import java.util.ArrayList;

/**
 *
 * @author kartik
 */
public class LabAssistantDirectory {
    ArrayList<LabAssistant> labAssistantList;

    public LabAssistantDirectory() {
        labAssistantList = new ArrayList<>();
    }

    public ArrayList<LabAssistant> getLabAssistantList() {
        return labAssistantList;
    }
    
    public ArrayList<LabAssistant> addLabAssistant(LabAssistant labAssistant){
        
        labAssistantList.add(labAssistant);
        return labAssistantList;
    }
    public void deleteLabAssistant(LabAssistant labAssistant){
        labAssistantList.remove(labAssistant);
    }
    
}
