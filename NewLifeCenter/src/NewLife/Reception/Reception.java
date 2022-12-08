/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Reception;

/**
 *
 * @author shivanidatar
 */
public class Reception {
    private String receptionName;
    private String orderId;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return receptionName;
    }

    public void setName(String receptionName) {
        this.receptionName = receptionName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return receptionName;
    }
    
}
