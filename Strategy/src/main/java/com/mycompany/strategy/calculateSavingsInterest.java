package com.mycompany.strategy;

public class calculateSavingsInterest implements InterestCalculation {

    @Override
    public double calculateInterest(double accountBalance) {
        return accountBalance * (0.04 / 12);
    }
}
