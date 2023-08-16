package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import Utilitylayer.Utilsclass;

public class Loginpage extends Baseclass
{

	@FindBy(id="user-name")
	private WebElement username1;
	
	@FindBy(id="password")
	private WebElement password1;
	
	@FindBy(id="login-button")
	private WebElement loginbutton;
	
	
	public Loginpage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void loginfunctionality(String uname,String Passwrd)
	{
		Utilsclass.sendkeys(username1, uname);
		Utilsclass.sendkeys(password1, Passwrd);
		Utilsclass.click(loginbutton);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
