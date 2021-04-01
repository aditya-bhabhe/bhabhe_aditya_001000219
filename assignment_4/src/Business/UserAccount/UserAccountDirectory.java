/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String name, String username, String password,String userAddress,String userPhone, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setUserAddress(userAddress);
        userAccount.setUserPhone(userPhone);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void updateUserAccount(UserAccount userAcc, String name, String userName, String password, String address, String phone){
        userAcc.setName(name);
        userAcc.setUsername(userName);
        userAcc.setPassword(password);
        userAcc.setUserAddress(address);
        userAcc.setUserPhone(phone);
    }
    
    public void deleteUserAccount(UserAccount userAcc){
        System.out.println("Didnt delte");
        userAccountList.remove(userAcc);
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
