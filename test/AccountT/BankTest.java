package AccountT;

import BankApp.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank gtBank;
    @BeforeEach
    public void start(){
        gtBank = new Bank("Guaranteed Trust Bank");
        gtBank.createAccountFor("kinzy boy","pin");
    }

    @Test
    public void createAccount(){
        assertEquals(1,gtBank.countNumberOfAccount());
    }

    @Test
    public void checkBalanceOfNewAccountIsZeroByDefaultTest(){
        assertEquals(0,gtBank.checkBalanceFor(1,"pin"));
    }

    @Test
    public void depositCheckBalance(){
        gtBank.deposit(5000,1);
        assertEquals(5000,gtBank.checkBalanceFor(1,"pin"));
    }

    @Test
    public void transferMoneyTest(){
        gtBank.createAccountFor("favour black","receiver pin");
        gtBank.deposit(4500,1);
        gtBank.transfer(2000,1,2,"pin");
        assertEquals(2500,gtBank.checkBalanceFor(1,"pin"));
        assertEquals(2000,gtBank.checkBalanceFor(2,"receiver pin"));
    }
    @Test
    public void withdrawMoneyTest(){
        gtBank.deposit(2000,1);
        gtBank.withdraw(1000,1,"pin");
        assertEquals(1000,gtBank.checkBalanceFor(1,"pin"));
    }
//    @Test
//    public void

}