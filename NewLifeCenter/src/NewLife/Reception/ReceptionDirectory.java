/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Reception;

import java.util.ArrayList;

/**
 *
 * @author shivanidatar
 */
public class ReceptionDirectory {
    private ArrayList<Reception> receptionlist;
    
    public ReceptionDirectory(){
        receptionlist = new ArrayList<Reception>();
    }
    public ArrayList<Reception> getReceptionList() {
        return receptionlist;
        
    }
    
    public ArrayList<Reception> addReception(Reception c){
       
        receptionlist.add(c);
        return receptionlist;
    }
     public ArrayList<Reception> removeReception(Reception c){
       
        receptionlist.remove(c);
        return receptionlist;
    }
}
