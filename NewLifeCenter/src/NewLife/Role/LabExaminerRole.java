/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.Role;

import NewLife.UserAccount.UserAccount;
import NewLifeCenter.NewLife;
import javax.swing.JPanel;
import UI.LabAssistant.LabAssistantWorkArea;

/**
 *
 * @author shivanidatar
 */
public class LabExaminerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, NewLife business) {
        return new LabAssistantWorkArea(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }
    
}
