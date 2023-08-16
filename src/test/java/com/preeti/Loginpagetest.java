package com.preeti;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baselayer.Baseclass;
import Pagelayer.Loginpage;
@Test(priority=1,groups= {"Loginpage","EndtoEndTesting"} )
public class Loginpagetest extends Baseclass
{
	
	private Loginpage Loginpage;
	@Parameters({"browsername"})
	@BeforeTest()
	
	public void setup(String browsername) 
	{
		Baseclass.initialization(browsername);
	}
	
	@Test()
	
	public void validateloginfunctionality()
	{
		Loginpage=new Loginpage();
		Loginpage.loginfunctionality("standard_user", "secret_sauce");
	}
	
	@AfterTest
	public void teardown()
	{
		//getDriver().quit();
	}
	
	
}
