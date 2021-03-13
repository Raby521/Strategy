package com.mycompany.strategy;

public class Calculator_bkup {
    //Strategies for calculating interest.
    private final InterestCalculation currentInterestCalculation = new calculateCurrentInterest();
    private final InterestCalculation savingsInterestCalculation = new calculateSavingsInterest();
    private final InterestCalculation loanInterestCalculation = new calculateLoanInterest();


    public double calculateInterest(String accountType, double balance) {
        switch (accountType) {
            case "CURRENT": 
                return currentInterestCalculation.calculateInterest(balance);
            case "SAVINGS": 
                return savingsInterestCalculation.calculateInterest(balance);
            case "LOAN": 
                return loanInterestCalculation.calculateInterest(balance);
            default:
                return 0;
        }
    }
    
    public static double amountInterest(String period, double interest) {
        switch (period) {
            case "month":
                return interest;
            
            case "quarter": 
                return interest * 4;

            case "year": 
                return interest * 12;

            default:
                return 0;
        }
    }
}
