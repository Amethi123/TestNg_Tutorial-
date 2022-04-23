package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day3 {
	@BeforeClass
	public void befoclass()
	{
		System.out.println("Before executing any method in any class");
	}
	@Test(groups=("Smoke"))
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCarLoan");
	}
	@Parameters({"Common URL","Speacific URl for day3 and day4"})
	@Test 
	public void MobileLoginCarLoan3(String c,String d)
	{
		System.out.println("MobileLoginCarLoan in day3 ");
		System.out.println(c);
		System.out.println(d);
	}
	@Test(dataProvider="getData") 
	public void ApiLoginCarLoan(String USRname,String PWD)
	{
		System.out.println("ApiLoginCarLoan");
		System.out.println(USRname);
		System.out.println(PWD);
		
	}
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("I will execute before any method in day2 class");
	}
	@DataProvider
	public Object getData()
	{
		Object[][]data=new Object[3][2];
		
		//first set of data
		data[0][0]="1setofusrname";
		data[0][1]="1setofpwd";
		//second set of data
		data[1][0]="2setofusrname";
		data[1][1]="2setofpwd";
		//Third set of data
		data[2][0]="3setofusrname";
		data[2][1]="3setofpwd";
		return data;
		
	}
	
	
	

}
