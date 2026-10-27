
package com.mycompany.bank.access;

import com.mycompany.bank.object.SavingAccount;

public interface InterfaceSavingAccounts {
    
    public boolean deposit(SavingAccount savingAccount, float value);

    
    public boolean withdraw(SavingAccount savingAccount, float value);

    
    public boolean montthlyStatement(SavingAccount savingAccount);

    
    public String show(SavingAccount savingAccount);
    
    
}
