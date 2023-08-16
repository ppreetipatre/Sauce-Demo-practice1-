	package Utilitylayer;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Baselayer.Baseclass;

	public class Selectclass extends Baseclass
	{
		public static void selectbyvisibleText(WebElement wb, String value)
		{
			Select sel = new Select(wb);
				sel.selectByVisibleText(value);	
		}
	
		public static void selectbyIndex(WebElement wb, int index)
		{
			Select sel = new Select(wb);
			sel.selectByIndex(index);
		}
	
	}
