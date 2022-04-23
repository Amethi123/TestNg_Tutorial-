package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Test(groups=("Smoke"))
	public void Demo()
	{
		System.out.println("Hello");
	}
	@Parameters({"Common URL","Speacific URl for day1 and day2"})
	@Test
	public void SecondTestCase(String h,String b)
	{
		System.out.println(h);
		System.out.println(b);
	}

}
