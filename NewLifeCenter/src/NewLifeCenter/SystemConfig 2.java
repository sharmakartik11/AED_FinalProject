/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLifeCenter;

import NewLife.Employee.Employee;
import NewLife.Role.SysAdminRole;
import NewLife.UserAccount.UserAccount;

/**
 *
 * @author shivaniguglani
 */

public class SystemConfig {
    public static NewLife configure(){
        
        NewLife system = NewLife.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
       Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SysAdminRole());
        
        return system;
    }
    
}
