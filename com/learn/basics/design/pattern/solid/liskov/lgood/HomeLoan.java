package com.learn.basics.design.pattern.solid.liskov.lgood;

public class HomeLoan implements LoanInterface,SecureLoan {
    @Override
    public void takeLoan() {

    }

    @Override
    public void doPayment() {

    }

    @Override
    public void doForeCloser() {

    }
}
