/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.WorkList;

import MedicalInformation.MedicalInformation;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author shivanidatar
 */
public class LabWorkRequest {
    private String id;
    
    private List<ProductQuantity> itemsWithQuatityList = new ArrayList<ProductQuantity>();
    
    private List<PharmacyInventory> pharmaItemQuantitys = new ArrayList<>();
    
    private List<MedicalInformation> medInfoList = new ArrayList<>();
    
    private String customerFeedback;
    
    private String testResult;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public LabWorkRequest() {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }
    
    public String getId() {
        return id;
    }
    
    public PharmacyInventory addItem(PharmacyInventory pharmaItemQuantity){
        pharmaItemQuantitys.add(pharmaItemQuantity);
        return pharmaItemQuantity;
    }

    public List<PharmacyInventory> getPharmaItemQuantitys() {
        return pharmaItemQuantitys;
    }

    public void setPharmaItemQuantitys(List<PharmacyInventory> pharmaItemQuantitys) {
        this.pharmaItemQuantitys = pharmaItemQuantitys;
    }
    
    public ProductQuantity addItem(ProductQuantity itemWithQuantity){
        itemsWithQuatityList.add(itemWithQuantity);
        return itemWithQuantity;
    }
    
    public MedicalInformation addItem(MedicalInformation itemWithQuantity){
        medInfoList.add(itemWithQuantity);
        return itemWithQuantity;
    }

    public List<MedicalInformation> getMedInfoList() {
        return medInfoList;
    }

    public void setMedInfoList(List<MedicalInformation> medInfoList) {
        this.medInfoList = medInfoList;
    }

    public List<ProductQuantity> getItemsWithQuatityList() {
        return itemsWithQuatityList;
    }

    public void setItemsWithQuatityList(List<ProductQuantity> itemsWithQuatityList) {
        this.itemsWithQuatityList = itemsWithQuatityList;
    }

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }
}
