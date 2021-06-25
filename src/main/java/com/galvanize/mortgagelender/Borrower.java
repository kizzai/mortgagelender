package com.galvanize.mortgagelender;

public class Borrower {
    private double loanAmount=0;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
    public Borrower(double loanAmount) {
       this.loanAmount = loanAmount;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}
