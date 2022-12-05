/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

import java.util.ArrayList;

/**
 *
 * @author shivaniguglani
 */
public class AccountDirectory {
    
    ArrayList<Account> accountList;
    
    public AccountDirectory(){
        accountList = new ArrayList<>();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }
    
    public ArrayList<Account> addAccount(Account account){
        
        accountList.add(account);
        return accountList;
    }
    public void removeAccount(Account account){
        accountList.remove(account);
    }
    
}

