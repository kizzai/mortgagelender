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
           borrower.status =
        }
    }
}
