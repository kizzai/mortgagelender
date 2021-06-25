package com.galvanize.mortgagelender;

public class Borrower {
    private int dti =0;
    private int creditScore =0;
    private int savings =0;
    private double loanAmount=0;

    public Borrower(double loanAmount, int dti, int creditScore, int savings) {
        this.loanAmount = loanAmount;
        this.dti = dti;
        this.creditScore = creditScore;
        this.savings = savings;
    }

    public Borrower(double loanAmount) {
        this(loanAmount,0,0,0);
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public double getLoanAmount() {
        return loanAmount;
    }
}
