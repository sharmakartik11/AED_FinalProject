/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Pharmaceutical;

import NewLife.Porter.Porter;
import NewLife.Role.PorterRole;
import NewLife.Role.SysAdminRole;
import NewLife.UserAccount.UserAccount;

/**
 *
 * @author kartik
 */
public class Pharmaceutical extends UserAccount{
    private String orderId;
    private SysAdminRole systemAdmin;
    private Porter deliveryMan;
    private String pharmaceuticalName;
    private Inventory inventory;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SysAdminRole getSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(SysAdminRole systemAdmin) {
        this.systemAdmin = systemAdmin;
    }

    public Porter getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(Porter deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getPharmaceuticalName() {
        return pharmaceuticalName;
    }

    public void setPharmaceuticalName(String pharmaceuticalName) {
        this.pharmaceuticalName = pharmaceuticalName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public String toString() {
        return pharmaceuticalName;
    }
}
