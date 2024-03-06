package com.learn.basics.design.pattern.solid.singlerespsibility.sbad;

public interface BadAccountOperation {

    void addAccount();
    void updateAccount();
    void editAccount();

    // ye dono transaction ka part hai -- ye isme naho hona chahiye --
    void deposit();
    void withdraw();

}
