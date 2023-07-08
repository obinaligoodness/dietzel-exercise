package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AccountTest {
    @Test
    public void depositMoneyTest(){
        //given that malik has an account
        Account malikAcccount =new Account();
        //when malik deposits 23
        malikAcccount.deposit(23);
        //check that the balance is  23
        int balance = malikAcccount.getBalance();
        assertEquals(23,balance);
    }
    @Test
    public void depositTwiceTest(){
        //given malik has an account;
        Account malikAccount = new Account();
        //given there is 300 in the account
        malikAccount.deposit(300);
        int balance = malikAccount.getBalance();
        assertEquals(300,balance);

        //when i try to deposit 200;
        malikAccount.deposit(200);

        //check that balance is 500;
        balance = malikAccount.getBalance();
        assertEquals(500,balance);
    }
     @Test
    public void negativeAmountTest(){
        //given that malik has an account
         Account malikAccount = new Account();
         //when malik tries to deposit a negative amount
         malikAccount.deposit(-2300);
         //check that balance is zero
         int balance = malikAccount.getBalance();
         assertEquals(0,balance);
         }
      @Test
    public void withdrawMoneyTest(){
        //given that malik has an account
          Account malikAccount = new Account();
          //given that malik has 3000 in the account
          malikAccount.deposit(3000);
          //when he tries to withdraw an amount
          malikAccount.withdraw(-2000);
          //check that balance is 1000
          int balance = malikAccount.getBalance();
          assertEquals(3000,balance);
     }
     @Test
    public void withdrawNegativeAmount(){
        //given that malik has an account
         Account malikAccount = new Account ();
         //given that malik has 3000 in the account
         malikAccount.deposit(3000);
         //when he tries to withdraw a negative
         malikAccount.withdraw(300);
         //check that balance is 3000
         int balance = malikAccount.getBalance();
         assertEquals(2700,balance);
     }

}

