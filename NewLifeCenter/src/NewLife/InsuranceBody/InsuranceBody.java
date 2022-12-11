/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.InsuranceBody;

import NewLife.UserAccount.UserAccount;

/**
 *
 * @author shivanidatar
 */
public class InsuranceBody extends UserAccount{
    private String insuranceProviderName;
    private String claimId;

    public String getInsuranceProviderName() {
        return insuranceProviderName;
    }

    public void setInsuranceProviderName(String insuranceProviderName) {
        this.insuranceProviderName = insuranceProviderName;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }
    
    @Override
    public String toString() {
        return insuranceProviderName;
    }
    
}
