/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.WorkList;

import NewLife.Pharmacy.PharmacyMedicine;

/**
 *
 * @author shivanidatar
 */
public class ProductQuantity {
    PharmacyMedicine item;
    
    
    int quantity;

    public ProductQuantity(PharmacyMedicine item, int quantilty) {
        this.item = item;
        this.quantity = quantilty;
    }
    

    public PharmacyMedicine getItem() {
        return item;
    }

    public void setItem(PharmacyMedicine item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantilty(int quantilty) {
        this.quantity = quantilty;
    }
    
    public String toString(){
        if(item != null){
            return item.getName();
        }
        return null;
    }
    
}
