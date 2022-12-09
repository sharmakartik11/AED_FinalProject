/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Government;

import java.util.ArrayList;

/**
 *
 * @author shivanidatar
 */
public class MunicipalityDirectory {
    private ArrayList<Municipality> governmentList;
    
    public MunicipalityDirectory(){
        governmentList = new ArrayList<Municipality>();
    }
    public ArrayList<Municipality> getGovernmentList() {
        return governmentList;
        
    }
    
    public ArrayList<Municipality> addGovernment(Municipality c){
       
        governmentList.add(c);
        return governmentList;
    }
     public ArrayList<Municipality> deleteGovernment(Municipality c){
       
        governmentList.remove(c);
        return governmentList;
    }
    
}
