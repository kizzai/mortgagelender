package com.galvanize.mortgagelender;

import com.galvanize.mortgagelender.Borrower;
import com.galvanize.mortgagelender.MortgageLender;
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
      Borrower borrower = new Borrower(loanAmount);
      mortgageLender.validateLoanAmount(borrower);
      assertEquals(borrower.getStatus(), "denied","should deny the loan amount" + loanAmount);
    }

    @Test
    public void shouldApproveLoan(){
        MortgageLender mortgageLender = new MortgageLender();
        double loanAmount = 125000;
        mortgageLender.addFunds(200000);
        Borrower borrower = new Borrower(loanAmount);
        mortgageLender.validateLoanAmount(borrower);
        assertEquals(borrower.getStatus(), "approve","should approve the loan amount " + loanAmount);
    }

    @Test
    public void qualifyLoans() {
        MortgageLender mortgageLender = new MortgageLender();
        Borrower borrower1 = new Borrower(250000,21,700,100000);
        Borrower borrower2 = new Borrower(250000,37,700,100000);
        Borrower borrower3 = new Borrower(250000,30,600,100000);
        Borrower borrower4 = new Borrower(250000,30,700,20000);
        List<Borrower> borrowerList = new ArrayList<Borrower>();
        borrowerList.add(borrower1);
        borrowerList.add(borrower2);
        borrowerList.add(borrower3);
        borrowerList.add(borrower4);
        mortgageLender.qualifyLoans(borrowerList);

    }


};