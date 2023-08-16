package com.preeti;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselayer.Baseclass;
import Pagelayer.Productpage;

@Test(groups= {"Productpage","EndtoEndTesting"},dependsOnGroups= {"Loginpage"} )

public class Productpagetest extends Baseclass
{
	private Productpage productPage;
	
	@BeforeTest
	public void setup() {
		productPage=new Productpage();
	}
	@Test()
	public void validateprodorder()
	{
		
		productPage.displayorderbyindex(3);
	}
	
	@Test
	public void addToCart() {
		productPage.addToCart(3);
	}
	
}
