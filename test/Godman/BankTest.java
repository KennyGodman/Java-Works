package Godman;

import com.Godman.Godman.Account;
import com.Godman.Godman.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {

    private Bank wemaBank;

    @BeforeEach
    public void setUp() {
        wemaBank = new Bank();
    }

    @Test
    public void bankExistsTest() {
        Bank wemaBank = new Bank();
        assertNotNull(wemaBank);
    }

    @Test
    public void accountCanBeCreatedTest() {
        //given that there is a bank
        // when i create an account
        // check that number of account created is 1
        wemaBank.createAccountFor("Godman Daniels", "1234");
        assertEquals(1, wemaBank.getNumberOfCustomers());
    }

    @Test
    public void createAccount_findAccountByAccountNumberTest() {
        wemaBank.createAccountFor("Godman Daniels", "1234");
        assertEquals(1, wemaBank.getNumberOfCustomers());
        Account account = wemaBank.findAccount("1");
        assertEquals("Godman Daniels", account.getName());
    }

    @Test
    public void customerCanDepositInHisAccountTest() {
        wemaBank.createAccountFor("Godman Daniels", "1234");
        wemaBank.deposit(2000, "1");
        Account godmanAccount = wemaBank.findAccount("1");
        assertEquals(2000, godmanAccount.getBalance("1234"));
    }

    @Test
    public void customerCanWithdraw() {
        wemaBank.createAccountFor("Godman Daniels", "1234");
        wemaBank.deposit(2000, "1");
        Account godmanAccount = wemaBank.withdraw(1500, "1");
        assertEquals(500, godmanAccount.getBalance("1234"));

    }

    @Test
    public void customerCanNotWithdrawMoreThanBalance() {
        wemaBank.createAccountFor("Godman Daniels", "1234");
        wemaBank.deposit(2000, "1");
        Account godmanAccount = wemaBank.withdraw(3000, "1");
        assertEquals(2000, godmanAccount.getBalance("1234"));

    }
    @Test
    public void customerCanNotWithdrawNegativeBalance() {
        wemaBank.createAccountFor("Godman Daniels", "1234");
        wemaBank.deposit(2000, "1");
        Account godmanAccount = wemaBank.withdraw(-1500, "1");
        assertEquals(2000, godmanAccount.getBalance("1234"));
    }

       @Test
       public void bankCanTransferFundsTest(){
        //we have a bank(done)
        //we have 2 accts
        wemaBank.createAccountFor("Hadiza Roll-on", "needle");
        wemaBank.createAccountFor("Hopeson Roll-on", "thread");

        //acct 1 has money
        wemaBank.deposit(5000,"1");
        assertEquals(5000, wemaBank.findAccount("1").getBalance("needle"));


        //wen we tf  x from acct to acct2
        wemaBank.transfer("1", "2", 4900, "needle");


        //check acct 1 has been debited with x and acct2 has been credited with x
        assertEquals(100, wemaBank.findAccount("1").getBalance("needle"));
        assertEquals(4900, wemaBank.findAccount("2").getBalance("thread"));
    }

}
