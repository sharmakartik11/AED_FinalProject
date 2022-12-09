/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Pharmacy to edit this template
 */
package NewLife.Pharmacy;

import NewLife.Porter.Porter;
import NewLife.Role.SysAdminRole;

/**
 *
 * @author kartik
 */
public class Pharmacy {
    private String orderId;
    private SysAdminRole systemAdmin;
    private Porter deliveryMan;
    private String pharmacyName;
    private PharmacyInventory menu;
    private String address;

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

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public PharmacyInventory getMenu() {
        return menu;
    }

    public void setMenu(PharmacyInventory menu) {
        this.menu = menu;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
