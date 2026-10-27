package com.mycompany.bank.development;

import com.mycompany.bank.access.InterfaceSavingAccounts;
import com.mycompany.bank.object.SavingAccount;

public class SavingAccounts extends Accounts implements InterfaceSavingAccounts {

    @Override
    public boolean deposit(SavingAccount savingAccount, float value) {
        boolean resp = false;
        
        if (getState(savingAccount)) {
            resp = super.deposit(savingAccount, value);
            savingAccount.setNumberDeposits(1+savingAccount.getNumberDeposits());
        }
        return resp;
    }

    @Override
    public boolean withdraw(SavingAccount savingAccount, float value) {
        boolean resp = false;
        if ((value <= savingAccount.getBalance() ) & (getState(savingAccount))) {
            resp = super.withdraw(savingAccount, value);
            savingAccount.setNumberWithdrawals(1+savingAccount.getNumberWithdrawals());
        }
        return resp;
    }

    @Override
    public boolean montthlyStatement(SavingAccount savingAccount) {
        boolean aux = false;
        if (savingAccount.getNumberWithdrawals()>4){
            savingAccount.setMonthlyFee(1000+savingAccount.getMonthlyFee());
            aux = true;
        }
        return aux;
    }

    @Override
    public String show(SavingAccount savingAccount) {
        return "Account"+ 
                "\n Balance= " + savingAccount.getBalance() +
                ",\n NumberDeposits= " + savingAccount.getNumberDeposits() + 
                ", \n NumberWithdrawals= " + savingAccount.getNumberWithdrawals() + 
                ", \n AnualInteres= " + savingAccount.getAnualInteres() + 
                ",\n MonthlyFee= " + savingAccount.getMonthlyFee();
    }

    private boolean getState(SavingAccount savingaccount) {
        
        if (savingaccount.getBalance() >= 10000) {
            savingaccount.setState(true);
        }
        return savingaccount.isState();
    }

}
