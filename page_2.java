package test_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_page.base_page_driver;

public class page_2  extends base_page_driver{

	
	@FindBy(xpath = "//div[@data-cy='title-recipe']")
	private WebElement name;
	
	
	public page_2(WebDriver gojo)
	{
		super(gojo);
		
	}
	public void name()
	{
		name.click();
	}
		
	
	
	
	
	
	
	
	
	
}










//@FindBy(xpath = "//div[@data-cy='title-recipe' and contains(.,'iPhone 17 Pro 256 GB: 15.93 cm (6.3″) Display with Promotion up to 120Hz, A19 Pro Chip, Breakthrough Battery Life, Pro Fusion Camera System with Center Stage Front Camera; Cosmic Orange')]")