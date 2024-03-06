package com.learn.basics.design.pattern.solid.liskov.lbad;

public class CreditCard implements LoanInterface{
    @Override
    public void takeLoan() {

    }

    @Override
    public void doPayment() {

    }

    @Override
    public void doForeCloser() {
        // in case of credit card -- it is not supported.
        throw new UnsupportedOperationException();
    }
}
