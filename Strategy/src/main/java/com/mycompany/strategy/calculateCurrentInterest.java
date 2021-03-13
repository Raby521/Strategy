package com.mycompany.strategy;

public class calculateCurrentInterest implements InterestCalculation {

    @Override
    public double calculateInterest(double accountBalance) {
        return accountBalance * (0.02 / 12);
    }
}
