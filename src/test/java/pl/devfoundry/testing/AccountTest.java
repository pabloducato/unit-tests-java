package pl.devfoundry.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AccountTest {

    @Test
    void myTest1() {
        final Account account = new Account();
        assertFalse(account.isActive());
    }

    @Test
    void myTest2() {
        final Account account = new Account();
        account.activate();
        assertTrue(account.isActive());
    }

    @Test
    void myTest3() {
        final Account account = new Account();
        assertFalse(account.isActive(), "Check if new account is not active.");
    }

    @Test
    void myTest4() {
        final Account account = new Account();
        account.activate();
        assertTrue(account.isActive(), "Check if new account was set to active.");
    }

}
