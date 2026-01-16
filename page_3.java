package test_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_page.base_page_driver;

public class page_3 extends base_page_driver {

	
	@FindBy(xpath = "(//input[@name='submit.add-to-cart'])[1]")
	private WebElement cart;
	
	
	public page_3(WebDriver gojo)
	{
		super(gojo);
		
	}
	
	public void  cart()
	{
		cart.click();
		
		
	}
	
	
	
	
	
}
