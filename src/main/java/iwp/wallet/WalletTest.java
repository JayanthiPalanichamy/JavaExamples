package main.java.iwp.wallet;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class WalletTest {
    Wallet wallet;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        wallet = new Wallet(100);
    }

    @Test
    public void validatesNegativeCashInitialization() {
        expectedException.expect(IllegalArgumentException.class);
        wallet = new Wallet(-20);
    }

    @Test
    public void returnsFalseWhenNegativeValueOfMoneyIsAdded() {
        boolean result = wallet.add(-10);

        assertFalse(result);
    }

    @Test
    public void returnsTrueWhenPositiveValueOfMoneyIsAdded() {
        boolean result = wallet.add(10);

        assertTrue(result);
    }

    @Test
    public void returnsFalseWhenWalletHasLessMoneyThanToBeSpent() {
        boolean result = wallet.spend(200);

        assertFalse(result);
    }

    @Test
    public void returnsTrueWhenWalletHasEnoughMoneyToBeSpent() {
        boolean result = wallet.spend(100);

        assertTrue(result);
    }
}
