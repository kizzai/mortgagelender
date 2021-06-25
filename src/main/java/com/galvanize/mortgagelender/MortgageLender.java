package com.galvanize.mortgagelender;

import java.util.List;

public class MortgageLender {
    private double funds;

    public MortgageLender() {
        funds = 0;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void addFunds(double fund) {
        this.funds += fund;
    }

    public void validateLoanAmount(Borrower borrower) {
        if(borrower.getLoanAmount()<funds){
           borrower.setStatus("approve") ;
        } else{
            borrower.setStatus("denied");
        }
    }


    public void qualifyLoans(List<Borrower> borrowerList) {
        for (Borrower b : borrowerList) {
            qualifyLoan(b);
        }
    }

    public void qualifyLoan(Borrower b) {
        double savingsToLoanRatio = b.getSavings()/b.getLoanAmount();
        if (b.getDti() < 36 && b.getCreditScore() > 620 && savingsToLoanRatio > 0.25 ) {
            b.setQualified(true);
        }
    }
}
