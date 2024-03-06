package com.learn.basics.design.pattern.solid.liskov.lgood;

import com.learn.basics.design.pattern.solid.liskov.lbad.CreditCard;
import com.learn.basics.design.pattern.solid.liskov.lbad.HomeLoan;
import com.learn.basics.design.pattern.solid.liskov.lbad.LoanInterface;

public class TestClass {
    public static void main(String[] args) {
        LoanInterface li = new HomeLoan();
        LoanInterface li2 = new CreditCard();

    }
}
