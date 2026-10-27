
package com.mycompany.bank.development;

import com.mycompany.bank.access.InterfaceCheckingAccounts;
import com.mycompany.bank.object.CheckingAccount;

public class CheckingAccounts extends Accounts implements InterfaceCheckingAccounts{
    
    
    @Override
    public boolean withdraw (CheckingAccount checkingAccount, float value) {
        float aux = checkingAccount.getBalance() - value;
        checkingAccount.setBalance(aux);
        return true;
        
    }

    @Override
    public float deposit (float value) {
        return 0.0f; }

    @Override
    public boolean montthlyStatement(CheckingAccount checkingAccount) {
        
        return super.montthlyStatement(checkingAccount);
    }

    @Override
    public String show() {
        return ""; }
    
}