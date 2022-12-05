/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.AmbulanceDriver;

import java.util.ArrayList;

/**
 *
 * @author kartik
 */
public class AmbulanceDriverDirectory {
    ArrayList<AmbulanceDriver> ambulanceDriverList;

    public AmbulanceDriverDirectory() {
        ambulanceDriverList = new ArrayList<>();
    }

    public ArrayList<AmbulanceDriver> getAmbulanceDriverList() {
        return ambulanceDriverList;
    }

    public void setAmbulanceDriverList(ArrayList<AmbulanceDriver> ambulanceDriverList) {
        this.ambulanceDriverList = ambulanceDriverList;
    }
    
    public ArrayList<AmbulanceDriver> addAmbulanceDriver(AmbulanceDriver ambulanceDriver){
        
        ambulanceDriverList.add(ambulanceDriver);
        return ambulanceDriverList;
    }
    public void removeAmbulanceDriver(AmbulanceDriver ambulanceDriver){
        ambulanceDriverList.remove(ambulanceDriver);
    }
}
