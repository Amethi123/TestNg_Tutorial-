package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Test(groups=("Smoke"))
	public void Demo()
	{
		System.out.println("Hello");
		System.out.println("Doing Changes in the code to check whether it updated in GIt hub or not");
	}
	@Parameters({"Common URL","Speacific URl for day1 and day2"})
	@Test
	public void SecondTestCase(String h,String b)
	{
		System.out.println(h);
		System.out.println(b);
	}

}
