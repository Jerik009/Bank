
package com.mycompany.bank.access;

import com.mycompany.bank.object.CheckingAccount;

public interface InterfaceCheckingAccounts {
    
    public float deposit(float value);

    
    public boolean withdraw(CheckingAccount checkingAccount, float value);

    
    public boolean montthlyStatement(CheckingAccount checkingAccount);

    
    public String show();
    
}
