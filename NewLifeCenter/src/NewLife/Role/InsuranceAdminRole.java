/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Role;

import NewLife.UserAccount.UserAccount;
import NewLifeCenter.NewLife;
import UI.InsuranceAdminRole.InsuranceAdmin;
import javax.swing.JPanel;

/**
 *
 * @author shivanidatar
 */
public class InsuranceAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, NewLife business) {
        return new InsuranceAdmin(userProcessContainer,account,business);
    }
    
}
