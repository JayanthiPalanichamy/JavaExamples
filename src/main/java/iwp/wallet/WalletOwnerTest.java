package main.java.iwp.wallet;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class WalletOwnerTest {
    WalletOwner walletOwner;
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Before
    public void setUp() {
        walletOwner = new WalletOwner(100);
    }
    @Ignore
    @Test
    public void validatesNegativeCashInitialization() {
        expectedException.expect(IllegalArgumentException.class);
        walletOwner = new WalletOwner(-20);
    }

    @Test
    public void returnsFalseWhenNegativeValueOfMoneyIsAdded() {
        boolean result = walletOwner.putMoney(-10);

        assertFalse(result);
    }

    @Test
    public void returnsTrueWhenPositiveValueOfMoneyIsAdded() {
        boolean result = walletOwner.putMoney(10);

        assertTrue(result);
    }

    @Test
    public void returnsFalseWhenWalletHasLessMoneyThanToBeSpent() {
        boolean result = walletOwner.buyThing(200);

        assertFalse(result);
    }

    @Test
    public void returnsTrueWhenWalletHasEnoughMoneyToBeSpent() {
        boolean result = walletOwner.buyThing(100);

        assertTrue(result);
    }
}
