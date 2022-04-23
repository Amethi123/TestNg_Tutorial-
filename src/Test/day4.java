package Test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan");
		Assert.
		assertTrue(false);
	}
	@Parameters({"Common URL","Speacific URl for day3 and day4"})
	@Test 
	public void MobileLoginCarLoan4(String a ,String b)
	{
		System.out.println("MobileLoginCarLoan in day 4");
		System.out.println("a");
		System.out.println("b");
	}
	@Test(groups=("Smoke"))
	public void ApiLoginCarLoan()
	{
		System.out.println("ApiLoginHomeLoan");
	}

}
