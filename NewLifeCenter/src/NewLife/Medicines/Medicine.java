/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Medicines;

/**
 *
 * @author shivaniguglani
 */
public class Medicine {
    
    private int medID;
    private String medicineName;
    private String medManufacturer;
    private int medPower;
    private int quantity;
    private String medicineType;
    private int medicineCost;

    public Medicine(String medicineName, String medManufacturer, int medPower, int quantity, String medicineType, int medicineCost) {
        this.medicineName = medicineName;
        this.medManufacturer = medManufacturer;
        this.medPower = medPower;
        this.quantity = quantity;
        this.medicineType = medicineType;
        this.medicineCost = medicineCost;
        this.medID = medID;
    }

    public int getMedID() {
        return medID;
    }

    public void setMedID(int medID) {
        this.medID = medID;
    }
    
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedManufacturer() {
        return medManufacturer;
    }

    public void setMedManufacturer(String medManufacturer) {
        this.medManufacturer = medManufacturer;
    }

    public int getMedPower() {
        return medPower;
    }

    public void setMedPower(int medPower) {
        this.medPower = medPower;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public int getMedicineCost() {
        return medicineCost;
    }

    public void setMedicineCost(int medicineCost) {
        this.medicineCost = medicineCost;
    }
    
    public enum medicineType{
        Injection,
        Tablet,
        MultiVitamins,
        AntiDepressants,
        LactationAids,
        NewBornFormula,
        Hormones,
        SanitartMaterials;
    }
    
}
