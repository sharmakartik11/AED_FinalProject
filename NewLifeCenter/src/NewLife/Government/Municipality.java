/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Government;

import NewLife.UserAccount.UserAccount;

/**
 *
 * @author shivanidatar
 */
public class Municipality extends UserAccount{
    private String governmentName;
    private String orderId;

    public String getName() {
        return governmentName;
    }

    public void setName(String governmentName) {
        this.governmentName = governmentName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return governmentName;
    }
}
