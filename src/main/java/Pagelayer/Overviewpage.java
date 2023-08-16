package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import Utilitylayer.Utilsclass;

public class Overviewpage extends Baseclass
{

	@FindBy(xpath="(//div[@class='summary_value_label'])[1]")
	private static WebElement paymentinfo; 
	
	@FindBy(xpath="(//div[@class='summary_value_label'])[2]")
	private static WebElement shippinginfo; 
	
	@FindBy(xpath="//div[@class='summary_info_label summary_total_label']")
	private static WebElement total;
	
	@FindBy(id="finish")
	private WebElement Finish;
	
	public Overviewpage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public static  void getinfo()
	{
		String payinfo =Utilsclass.gettext(paymentinfo,"value");
		String shipinfo = Utilsclass.gettext(shippinginfo,"value");
		String total1 = Utilsclass.gettext(total,"value");
	}
	
	public void total()
	{
		Utilsclass.click(Finish);
	}
	
	
	
	
	
	
	
	
	
	
}
