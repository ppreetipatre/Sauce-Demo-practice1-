package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import Utilitylayer.Utilsclass;

public class Checkoutcompletepage extends Baseclass
{

	
	@FindBy(id= "finish")
	private WebElement finish;
	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	private WebElement thanks;
	@FindBy(id="back-to-products")
	private WebElement home;
	
	public Checkoutcompletepage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void finish() {
		Utilsclass.click(finish);
	}
	public String thankyou()
	{
		
		return Utilsclass.gettext(thanks, thanks.getText());
	}
	
	public void home()
	{
		Utilsclass.click(home);
	}
}
