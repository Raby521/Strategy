package com.mycompany.strategy;

public class calculateLoanInterest implements InterestCalculation {

    @Override
    public double calculateInterest(double accountBalance) {
        return accountBalance * (0.1 / 12);
    }
}
