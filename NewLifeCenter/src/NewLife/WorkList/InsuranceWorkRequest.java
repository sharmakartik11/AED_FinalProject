/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.WorkList;

import java.util.UUID;

/**
 *
 * @author shivanidatar
 */
public class InsuranceWorkRequest extends WorkRequest{
    private String patientName;
    private String id;
    private int claimAmount;
    private String treatment;

    public InsuranceWorkRequest() {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }
    
    

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(int claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    
    
}
