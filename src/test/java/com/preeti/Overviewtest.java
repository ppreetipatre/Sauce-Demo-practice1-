package com.preeti;
import org.testng.annotations.Test;

import Baselayer.Baseclass;
import Pagelayer.Overviewpage;

@Test(groups= {"Overviewpage","EndtoEndTesting"},dependsOnGroups= {"Checkoutcompletetest"} )
public class Overviewtest extends Baseclass
{
	private Overviewpage overviewpage;
	
	@Test
	public void validategetinfo()
	{
		
		overviewpage = new Overviewpage();
		overviewpage.getinfo();
		overviewpage.total();
		
		
	}
	
	 
}

