package com.mycompany.bank.development;

import com.mycompany.bank.object.Account;

public class Accounts {

    public boolean deposit(Account account, float value) {
        float aux = account.getBalance() + value;
        account.setBalance(aux);
        return true;
    }

    public boolean withdraw(Account account, float value) {
        boolean transac = false; 
        if (value <= account.getBalance()){
            float aux = account.getBalance() - value;
            account.setBalance(aux);
            transac = true;
        }
        return transac;
    }

    private float calculateMontthlyInterest(Account account) {
        return account.getAnualInteres()/12;
    }

    public boolean montthlyStatement(Account account) {
        
        float monthlyInterest = calculateMontthlyInterest(account);
        float montoInteresmen = monthlyInterest*account.getMonthlyFee();
        float newBalance = (account.getBalance()-account.getMonthlyFee())- montoInteresmen;
        account.setBalance(newBalance);
        return true;
    }

    
    public String toString(Account account) {
        return  "Account{" + "balance=" + account.getBalance() + 
                "numberDeposits=" + account.getNumberDeposits() + 
                ", numberWithdrawals=" + account.getNumberWithdrawals() + 
                ", anualInteres=" + account.getAnualInteres() + 
                ", monthlyFee=" + account.getMonthlyFee() + '}';
    }

    

    

}
