/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author adity
 */
public class Checking {
    private String checkingBankName;
    private String checkingRoutingNumber;
    private String checkingAccountNumber;
    private String checkingAccountBalance;
    private String checkingAccountType = "Checking";

    public String getCheckingAccountType() {
        return checkingAccountType;
    }

    public void setCheckingAccountType(String checkingAccountType) {
        this.checkingAccountType = checkingAccountType;
    }

    public String getCheckingBankName() {
        return checkingBankName;
    }

    public void setCheckingBankName(String checkingBankName) {
        this.checkingBankName = checkingBankName;
    }

    public String getCheckingRoutingNumber() {
        return checkingRoutingNumber;
    }

    public void setCheckingRoutingNumber(String checkingRoutingNumber) {
        this.checkingRoutingNumber = checkingRoutingNumber;
    }

    public String getCheckingAccountNumber() {
        return checkingAccountNumber;
    }

    public void setCheckingAccountNumber(String checkingAccountNumber) {
        this.checkingAccountNumber = checkingAccountNumber;
    }

    public String getCheckingAccountBalance() {
        return checkingAccountBalance;
    }

    public void setCheckingAccountBalance(String checkingAccountBalance) {
        this.checkingAccountBalance = checkingAccountBalance;
    }

   
}
