package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import Utilitylayer.Utilsclass;

public class Checkoutinfopage extends Baseclass
{

	
	@FindBy(id="checkout")
	private WebElement chkout;
	@FindBy(id="first-name")
	private WebElement firstname;
	@FindBy(id="last-name")
	private WebElement lastname;
	@FindBy(id="postal-code")
	private WebElement postalcode;
	@FindBy(id="continue")
	private WebElement Continue;
	
	
	public Checkoutinfopage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void continue1()
	{
		Utilsclass.click(chkout);
	}
	
	
	public void chkoutinfo(String fname,String lname,String pincode)
	{
		Utilsclass.sendkeys(firstname, fname);
		Utilsclass.sendkeys(lastname, lname);
		Utilsclass.sendkeys(postalcode, pincode);
	}
	
	public void cntinue()
	{
		Utilsclass.click(Continue);
	}
	
	
	
}
