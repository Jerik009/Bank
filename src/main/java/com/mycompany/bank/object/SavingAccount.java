package com.mycompany.bank.object;

public class SavingAccount extends Account{
    protected boolean state;

    public SavingAccount(boolean state, float balance, float anualInteres) {
        super(balance, anualInteres);
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
    
    
}
