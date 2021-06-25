package com.galvanize.mortgagelender;

public class Borrower {
    private int dti =0;
    private int creditScore =0;
    private int savings =0;
    //initialized to false so all borrowers are assumed to be not qualified.
    private boolean isQualified = false;
    private double loanAmount=0;
    private String name = "";

    public Borrower(String name, double loanAmount, int dti, int creditScore, int savings) {
        this.loanAmount = loanAmount;
        this.dti = dti;
        this.creditScore = creditScore;
        this.savings = savings;
        this.name = name;
    }

    public Borrower(String name, double loanAmount) {
        this(name, loanAmount, 0, 0, 0);
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

    public int getDti() {
        return dti;
    }

    public void setDti(int dti) {
        this.dti = dti;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getSavings() {
        return savings;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }

    public boolean isQualified() {
        return isQualified;
    }

    public void setQualified(boolean qualified) {
        isQualified = qualified;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String toString() {
        return this.name + " with loan amount " + this.loanAmount + " isQualified " + this.isQualified + " loan status " + this.status;
    }
}
