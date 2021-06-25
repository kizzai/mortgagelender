import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MortgageLenderTest {

    @Test
    public void getAvailableFunds() {
        MortgageLender mortgageLender = new MortgageLender();
        double expectedFunds = 0;
        double actual = mortgageLender.getFunds();
        assertEquals(expectedFunds,actual, "Should equal expected to actual available funds from the bank");
    }

    @Test
    public void addingLenderMoney() {
        MortgageLender mortgageLender = new MortgageLender();
        mortgageLender.addFunds(500);
        assertTrue(mortgageLender.getFunds() > 0 );
    }
    @Test
    public void shouldApproveOrDenyLoan(){
      MortgageLender mortgageLender = new MortgageLender();
      double loanAmount = 125000;
    //  assertTrue(loanAmount <mortgageLender.getFunds());
      Borrower borrower = new Borrower(loanAmount);
      mortgageLender.validateLoanAmount(borrower);
    }
};