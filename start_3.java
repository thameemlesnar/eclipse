package crickbuzz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class start_3 {

	@FindBy(xpath = "//div[@class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray']/../..//div[@class='cb-col cb-col-100 cb-scrd-itms']")
	private List<WebElement> table;
	
	public start_3(WebDriver gojo)
	{
		PageFactory.initElements(gojo,this);
		
	}
	public void tablesome() throws InterruptedException
	{int ll = table.size();
	System.out.println(ll);
	
	for(int i=0;i<table.size();i++)
	{
		WebElement row = table.get(i);
			
		List<WebElement> gg = row.findElements(By.tagName("div"));
		Thread.sleep(5000);
		if(gg.size()>=5)
		{
			System.out.println(gg.get(0).getText());
			System.out.println(gg.get(2).getText());
			System.out.println(gg.get(3).getText());
			
			
		}
	
	}
	
	
	}
	
	
	
	
	
	
	
	
	
}
