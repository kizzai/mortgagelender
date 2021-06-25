package com.galvanize.mortgagelender;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void shouldDenyLoan(){
      MortgageLender mortgageLender = new MortgageLender();
      double loanAmount = 125000;
      mortgageLender.addFunds(100000);
      Borrower borrower = new Borrower("Borrower1", loanAmount);
      mortgageLender.validateLoanAmount(borrower);
      assertEquals(borrower.getStatus(), "denied","should deny the loan amount" + loanAmount);
    }

    @Test
    public void shouldApproveLoan(){
        MortgageLender mortgageLender = new MortgageLender();
        double loanAmount = 125000;
        mortgageLender.addFunds(200000);
        Borrower borrower = new Borrower("Borrower1", loanAmount);
        mortgageLender.validateLoanAmount(borrower);
        assertEquals(borrower.getStatus(), "approve","should approve the loan amount " + loanAmount);
    }

    @Test
    public void qualifyLoans() {
        MortgageLender mortgageLender = new MortgageLender();
        Borrower borrower1 = new Borrower("Borrower1", 250000, 21, 700, 100000);
        Borrower borrower2 = new Borrower("Borrower2", 250000, 37, 700, 100000);
        Borrower borrower3 = new Borrower("Borrower3", 250000, 30, 600, 100000);
        Borrower borrower4 = new Borrower("Borrower4", 250000, 30, 700, 20000);
        List<Borrower> borrowerList = new ArrayList<Borrower>();
        borrowerList.add(borrower1);
        borrowerList.add(borrower2);
        borrowerList.add(borrower3);
        borrowerList.add(borrower4);
        mortgageLender.qualifyLoans(borrowerList);
        assertTrue(borrower1.isQualified(), "Borrower1 must qualify");
        assertFalse(borrower2.isQualified(), "Borrower2 must not qualify");
        assertFalse(borrower3.isQualified(), "Borrower3 must not qualify");
        assertFalse(borrower4.isQualified(), "Borrower4 must not qualify");
    }


};