package com.mycompany.bank.object;

public class Account {
    protected float balance;
    protected  int numberDeposits = 0;
    protected int numberWithdrawals = 0;
    protected float anualInteres;
    protected float monthlyFee = 0.0f;

    public Account(float balance, float anualInteres) {
        this.balance = balance;
        this.anualInteres = anualInteres;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumberDeposits() {
        return numberDeposits;
    }

    public void setNumberDeposits(int numberDeposits) {
        this.numberDeposits = numberDeposits;
    }

    public int getNumberWithdrawals() {
        return numberWithdrawals;
    }

    public void setNumberWithdrawals(int numberWithdrawals) {
        this.numberWithdrawals = numberWithdrawals;
    }

    public float getAnualInteres() {
        return anualInteres;
    }

    public void setAnualInteres(float anualInteres) {
        this.anualInteres = anualInteres;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    
    
    
}
