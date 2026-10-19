
package com.mycompany.bank.development;

import com.mycompany.bank.access.InterfaceCheckingAccounts;

public class CheckingAccount extends Accounts implements InterfaceCheckingAccounts{
    
    
    @Override
    public float deposit(float value) {
        return 0.0f; }

    @Override
    public float withdraw(float value) {
        return 0.0f; }

    @Override
    public float montthlyStatement() {
        return 0.0f; }

    @Override
    public String show() {
        return ""; }
    
}