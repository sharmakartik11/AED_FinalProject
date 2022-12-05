/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewLife.UserAccount;

/**
 *
 * @author shivaniguglani
 */
public class UserAccount {
    private String username;
    private String password;
    private Role role;
    private WorkList workQueue;

    public UserAccount(String username, String password, Role role, WorkList workQueue) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.workQueue = workQueue;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkList getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkList workQueue) {
        this.workQueue = workQueue;
    }
    
    
}
