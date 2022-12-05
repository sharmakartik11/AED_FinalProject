/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Pharmaceutical;

import java.util.ArrayList;

/**
 *
 * @author kartik
 */
public class PharmaceuticalDirectory {
    private ArrayList<Pharmaceutical> pharmaceuticalList;

    public PharmaceuticalDirectory() {
        pharmaceuticalList = new ArrayList();
    }

    public ArrayList<Pharmaceutical> getPharmaceuticalList() {
        return pharmaceuticalList;
    }

    public void setPharmaceuticalList(ArrayList<Pharmaceutical> pharmaceuticalList) {
        this.pharmaceuticalList = pharmaceuticalList;
    }
    
    public void addPharmaceutical(Pharmaceutical pharma){
        pharmaceuticalList.add(pharma);
    }
    public void deletePharmaceutical(Pharmaceutical pharma){
        pharmaceuticalList.remove(pharma);
    }
    
}
