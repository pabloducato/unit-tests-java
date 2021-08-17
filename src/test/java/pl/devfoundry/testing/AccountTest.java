package pl.devfoundry.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AccountTest {

    @Test
    void myTest1() {
        //given
        //when
        final Account account = new Account();
        //then
        assertFalse(account.isActive());
    }

    @Test
    void myTest2() {
        //given
        final Account account = new Account();
        //when
        account.activate();
        //then
        assertTrue(account.isActive());
    }

    @Test
    void myTest3() {
        //given
        //when
        final Account account = new Account();
        assertFalse(account.isActive(), "Check if new account is not active.");
    }

    @Test
    void myTest4() {
        //given
        final Account account = new Account();
        //when
        account.activate();
        //then
        assertTrue(account.isActive(), "Check if new account was set to active.");
    }

}
