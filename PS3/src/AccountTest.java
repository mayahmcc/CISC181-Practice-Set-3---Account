
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AccountTest {
	Account a;

	@Before
	public void setUp() throws Exception {

		a = new Account();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test(expected = InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		a.Setbalance(0);
		a.deposit(600.00);
		a.withdraw(900);
		assertEquals("$500 Expected, actual is $400", (long) a.Getbalance(), (long) 500.00);

	}

	@Test
	public void AccountTestz() throws InsufficientFundsException {
		a.Setid(1122);
		a.Setbalance(20000);
		a.SetannualInterestRate(.045);
		a.withdraw(2500);
		assertTrue(a.Getbalance() == 17500);

		a.deposit(3000);
		assertTrue(a.Getbalance() == 20500);

		System.out.println("Your balance is " + a.Getbalance());
		System.out.println("Your monthly interestRate is " + a.getMonthlyInterestRate());
		System.out.println("You created this account on " + a.GetdateCreated());
	}
}