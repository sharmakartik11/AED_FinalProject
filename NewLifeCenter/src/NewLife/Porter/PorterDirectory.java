/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Porter;

import java.util.ArrayList;

/**
 *
 * @author shivanidatar
 */
public class PorterDirectory {
    ArrayList<Porter> deliveryManList;
    
    public PorterDirectory(){
        deliveryManList = new ArrayList<>();
    }

    public ArrayList<Porter> getDeliveryManList() {
        return deliveryManList;
    }
    
    public ArrayList<Porter> addDeliveryMan(Porter deliveryMan){
        
        deliveryManList.add(deliveryMan);
        return deliveryManList;
    }
    public void deleteDeliveryMan(Porter deliveryMan){
        deliveryManList.remove(deliveryMan);
    }
}
