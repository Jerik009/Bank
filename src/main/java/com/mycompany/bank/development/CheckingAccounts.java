
package com.mycompany.bank.development;

import com.mycompany.bank.access.InterfaceCheckingAccounts;
import com.mycompany.bank.object.CheckingAccount;

public class CheckingAccounts extends Accounts implements InterfaceCheckingAccounts{
    
    
    @Override
    public boolean withdraw (CheckingAccount checkingAccount, float value) {
        if (value <= checkingAccount.getBalance()) {
            super.withdraw(checkingAccount, value);
        } else {
            float debt = value - checkingAccount.getBalance();
            checkingAccount.setOverdraf(checkingAccount.getOverdraf() + debt);
            checkingAccount.setBalance(0.0f);
        }
        checkingAccount.setNumberWithdrawals(1+checkingAccount.getNumberWithdrawals());
        return true;
        
    }

    @Override
    public boolean deposit (CheckingAccount checkingAccount, float value) {
        float remainder = value;
        
        if (checkingAccount.getOverdraf() > 0) {
            if (value >= checkingAccount.getOverdraf()) {
                remainder = value - checkingAccount.getOverdraf();
                checkingAccount.setOverdraf(0.0f);
            } else {
                checkingAccount.setOverdraf(checkingAccount.getOverdraf() - value);
                remainder = 0.0f;
            }
        }
        boolean resp = super.deposit(checkingAccount, remainder);
        checkingAccount.setNumberDeposits(1+checkingAccount.getNumberDeposits());
        return resp;
    }

    @Override
    public boolean montthlyStatement(CheckingAccount checkingAccount) {
        
        return super.montthlyStatement(checkingAccount);
    }

    @Override
    public String show(CheckingAccount checkingAccount) {
        return "Account"+ 
                "\n Balance= " + checkingAccount.getBalance() +
                ",\n MonthlyFee= " + checkingAccount.getMonthlyFee() + 
                ", \n Transactions= " + (checkingAccount.getNumberDeposits() + checkingAccount.getNumberWithdrawals()) + 
                ", \n Overdraf= " + checkingAccount.getOverdraf();
    }
    
}
