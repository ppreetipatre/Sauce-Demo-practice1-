package Pagelayer;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import Utilitylayer.Selectclass;
import Utilitylayer.Utilsclass;

public class Productpage extends Baseclass {
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement backpack;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement bikelight;
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement tshirt;
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement jacket;
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	private WebElement onesie;
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement tred;
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement productsort;
	@FindBy(id = "shopping_cart_container")
	private WebElement shoppingcartcontainer;

	@FindBy(id = "react-burger-menu-btn")
	private WebElement menubutton;

	@FindBy(id = "inventory_sidebar_link")
	private WebElement Allitems;

	@FindBy(id = "about_sidebar_link")
	private WebElement About;

	@FindBy(id = "logout_sidebar_link")
	private WebElement logout;

	@FindBy(id = "reset_sidebar_link")
	private WebElement resetappstate;

	@FindBy(xpath = "//button[text()='Add to cart']")
	private List<WebElement> btnList;

	public Productpage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void displayorderbytext(String order) {
		Selectclass.selectbyvisibleText(productsort, order);
	}

	public void displayorderbyindex(int index) {
		Selectclass.selectbyIndex(productsort, index);
	}

	public void clickbackpack() {
		Utilsclass.click(backpack);
	}

	public void clickblacklight() {
		Utilsclass.click(bikelight);
	}

	public void clickbolttshirt() {
		Utilsclass.click(tshirt);
	}

	public void clickjacket() {
		Utilsclass.click(jacket);
	}

	public void clickonesie() {
		Utilsclass.click(onesie);
	}

	public void clickredT() {
		Utilsclass.click(tred);
	}

	
	  public void addToCart(int quantity) {
		  for(int i=0; i<quantity; i++) {
			  btnList.get(i).click(); 
	  } }
	 

}
