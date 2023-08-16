package Utilitylayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import Baselayer.Baseclass;

public class Utilsclass extends Baseclass
{

	public static void sendkeys(WebElement wb, String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.sendKeys(value);
		}
		
	}
	
	public static void click(WebElement wb)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.click();
		}
	}
	
	public static  String  gettext(WebElement wb,String value)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
			 wb.getText();
			 return value;
		}
		return null;
		
	}

	
}
	
	
