/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Pharmaceutical;

/**
 *
 * @author kartik
 */
public class Medicines {
    private String medicineName;
    private double medicinePrice;

    public Medicines(String medicineName, double medicinePrice) {
        this.medicineName = medicineName;
        this.medicinePrice = medicinePrice;
    }
    
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public double getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
    
    @Override
    public String toString() {
        return this.medicineName;
    }
}
