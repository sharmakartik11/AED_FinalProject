/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Role;

import NewLife.UserAccount.UserAccount;
import NewLifeCenter.NewLife;
import UI.Doctor.DoctorAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author shivanidatar
 */
public class DoctorRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, NewLife business) {
        return new DoctorAreaPanel(userProcessContainer,account,business);
    }
    
}
