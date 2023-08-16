package com.preeti;
import org.testng.annotations.Test;

import Baselayer.Baseclass;
import Pagelayer.Cartpage;
@Test(groups= {"Cartpagetest","EndtoEndTesting"},dependsOnGroups= {"Productpage"} )
public class Cartpagetest extends Baseclass
{
	private Cartpage cartpage;
	@Test
	public void validateaddtocart()
	{
		cartpage = new Cartpage();
		cartpage.addToCart();
		cartpage.quantity();
	}
	
}
