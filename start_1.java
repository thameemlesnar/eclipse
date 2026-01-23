package crickbuzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class start_1 {

	@FindBy(xpath = "//div[@title='Irani Cup • Irani Cup 2025']")
	private WebElement mat;
	@FindBy(xpath = "//img[@class='cb-view-all-ga']")
	private WebElement arrow;
	
	public start_1(WebDriver gojo)
	{
		PageFactory.initElements(gojo,this);
		
	}
	public void aro()
	{
		arrow.click();
		
	}
	public void cup()
	{
		mat.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
