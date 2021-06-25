package com.galvanize.mortgagelender;

import com.galvanize.mortgagelender.Borrower;
import com.galvanize.mortgagelender.MortgageLender;
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
      mortgageLender.addFunds(100000);
      Borrower borrower = new Borrower(loanAmount);
      mortgageLender.validateLoanAmount(borrower);
      assertEquals(borrower.getStatus(), "denied");

    }
};