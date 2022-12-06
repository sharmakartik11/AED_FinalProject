/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Doctors;

import NewLife.Patient.Person;
import NewLife.UserAccount.UserAccount;

/**
 *
 * @author shivaniguglani
 */
public class Doctor extends UserAccount{
    
    private String docName;
    private String time;
    private String type;
    private String docType;

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    private String orderId;

    public String getName() {
        return docName;
    }

    public void setName(String customerName) {
        this.docName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return docName;
    }
    
}
