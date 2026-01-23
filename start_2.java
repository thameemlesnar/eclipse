package crickbuzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class start_2 {

	@FindBy(xpath = "//a[contains(.,'Scorecard')]")
	private WebElement score;
	
	public start_2(WebDriver gojo)
	{
		PageFactory.initElements(gojo,this);
		
	}
	public void sclick()
	{
		score.click();
		
	}	
	
	
	
	
	
	
	
}
