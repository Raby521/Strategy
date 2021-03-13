package com.mycompany.strategy;

public class Calculator {
   private InterestCalculation strategy;

   public Calculator(InterestCalculation strategy){
      this.strategy = strategy;
   }

   //accessing the calculateInterest method
   public double executeStrategy(double balance){
      return strategy.calculateInterest(balance);
   }
   
   //counting the interest amount by month or quarter or year
   public double amountInterest(String period, double interest) {
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
