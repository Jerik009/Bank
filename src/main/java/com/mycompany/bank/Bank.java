package com.mycompany.bank;

import com.mycompany.bank.access.InterfaceCheckingAccounts;
import com.mycompany.bank.access.InterfaceSavingAccounts;
import com.mycompany.bank.development.CheckingAccounts;
import com.mycompany.bank.development.SavingAccounts;
import com.mycompany.bank.object.CheckingAccount;
import com.mycompany.bank.object.SavingAccount;

public class Bank {

    public static void main(String[] args) {
        InterfaceSavingAccounts savingAccounts = new SavingAccounts();
        SavingAccount savingAccount = new SavingAccount(true, 20000f, 12f);
        
        System.out.println(savingAccounts.show(savingAccount));
           
        InterfaceCheckingAccounts checkingAccounts = new CheckingAccounts();
        CheckingAccount checkingAccount = new CheckingAccount(10000f, 4f);
        
        checkingAccounts.withdraw(checkingAccount, 12000f);
        
        System.out.println(checkingAccounts.show(checkingAccount));
    }
}
