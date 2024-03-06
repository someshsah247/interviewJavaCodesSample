package com.learn.basics.design.pattern.solid.singlerespsibility.sbad;

public class BadAccountOperationImpl implements BadAccountOperation{
    @Override
    public void addAccount() {
        System.out.println("addAccount");
    }

    @Override
    public void updateAccount() {
        System.out.println("updateAccount");
    }

    @Override
    public void editAccount() {
        System.out.println("editAccount");
    }

    @Override
    public void deposit() {
        System.out.println("deposit");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw");
    }
}
