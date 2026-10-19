
package com.mycompany.bank.object;
public class CheckingAccount extends Account{
    protected float overdraf=0.0f;

    public CheckingAccount(float balance, float anualInteres) {
        super(balance, anualInteres);
    }

    public float getOverdraf() {
        return overdraf;
    }

    public void setOverdraf(float overdraf) {
        this.overdraf = overdraf;
    }
    
    
    
}
