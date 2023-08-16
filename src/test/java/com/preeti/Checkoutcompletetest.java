package com.preeti;
import org.testng.annotations.Test;

import Baselayer.Baseclass;
import Pagelayer.Checkoutcompletepage;

@Test(groups= {"Checkoutcompletetest","EndtoEndTesting"},dependsOnGroups= {"Checkoutinfotest"} )
public class Checkoutcompletetest extends Baseclass
{
	private Checkoutcompletepage checkoutcompletepage;
	@Test
	public void validatechkout()
	{
		checkoutcompletepage = new Checkoutcompletepage();
		checkoutcompletepage.finish();
		String str = checkoutcompletepage.thankyou();
		System.out.println(str);
		checkoutcompletepage.home();
		
		
	}
	
	
	
}
