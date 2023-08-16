package com.preeti;
import org.testng.annotations.Test;


import Baselayer.Baseclass;
import Pagelayer.Checkoutinfopage;
@Test(groups= {"Checkoutinfotest","EndtoEndTesting"},dependsOnGroups= {"Cartpagetest"} )

public class Checkoutinfotest extends Baseclass
{
	private Checkoutinfopage checkoutinfopage;
	@Test
	public void validatechkoutinfo() {
		
		checkoutinfopage = new Checkoutinfopage();
		checkoutinfopage.continue1();
		checkoutinfopage.chkoutinfo("preeti", "patre", "432515");
		checkoutinfopage.cntinue();
		
		
	}
}
