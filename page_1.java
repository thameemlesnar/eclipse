package test_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_page.base_page_driver;

public class page_1 extends base_page_driver {

	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement search;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement button;
	
	public page_1(WebDriver gojo)
	{
		super(gojo);
		
	}
	
	public void search(String one)
	{
		search.sendKeys(one);
		
	}
	
	public void button()
	{
		button.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
