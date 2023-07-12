import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Sarah", "OConnor", "14/01/2002", 12345);
    }

    @Test
    public void canGetFirstName() {
        String actual = bankAccount.getFirstName();
        String expected = "Sarah";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetLastName() {
        String actual = bankAccount.getLastName();
        String expected = "OConnor";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetDateOfBirth() {
        String actual = bankAccount.getDateOfBirth();
        String expected = "14/01/2002";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetAccountNumber() {
        int actual = bankAccount.getAccountNumber();
        int expected = 12345;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetBalance() {
        double actual = bankAccount.getBalance();
        double expected = 0.0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName() {
        bankAccount.setFirstName("John");
        String actual = bankAccount.getFirstName();
        String expected = "John";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetLastName() {
        bankAccount.setLastName("Smith");
        String actual = bankAccount.getLastName();
        String expected = "Smith";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth() {
        bankAccount.setDateOfBirth("01/01/2001");
        String actual = bankAccount.getDateOfBirth();
        String expected = "01/01/2001";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber() {
        bankAccount.setAccountNumber(678910);
        int actual = bankAccount.getAccountNumber();
        int expected = 678910;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetBalance() {
        bankAccount.setBalance(200.5);
        double actual = bankAccount.getBalance();
        double expected = 200.5;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canDeposit() {
        bankAccount.deposit(123.4);
        double actual = bankAccount.getBalance();
        double expected = 123.4;
        assertThat(actual).isEqualTo(expected);
    }


    @Test
    public void canWithdraw() {
        bankAccount.withdrawal(123.4);
        double actual = bankAccount.getBalance();
        double expected = -123.4;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canPayInterest() {
        bankAccount.deposit(100);
        bankAccount.payInterest(2.5);
        double actual = bankAccount.getBalance();
        double expected = 102.5;
        assertThat(actual).isEqualTo(expected);
    }

}
