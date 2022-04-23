package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@AfterTest
	public void SecondTestCase()
	{
		System.out.println("I will execute last");
	}
	@BeforeTest
	public void prequiste()
	{
		System.out.println("I will execute first");
	}
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I will execute before suite");
	}
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I will execute after suite");
	}
	
	
	
	

}
