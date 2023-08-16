package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import Utilitylayer.Utilsclass;

public class Cartpage extends Baseclass
{

	@FindBy(id="shopping_cart_container")
	private WebElement addcart;
	@FindBy(xpath="//div[@class='cart_quantity']")
	private WebElement quantity;
	

	public Cartpage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void addToCart()
	{
		Utilsclass.click(addcart);
	}
	
	public String quantity()
	{
	return Utilsclass.gettext(quantity,"value");
	}
	
	
	
	
}