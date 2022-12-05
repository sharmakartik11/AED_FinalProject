/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Encounters;

/**
 *
 * @author shivaniguglani
 */
public class VitalSigns {
    
    private float bodyTemp;
    private int bloodPressure;
    private float weight;
    private float height;

    public VitalSigns(float bodyTemp, int bloodPressure, float weight, float height) {
        this.bodyTemp = bodyTemp;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.height = height;
    }

    public float getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    
}
