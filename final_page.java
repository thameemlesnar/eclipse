package test_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class final_page {

	@Test
	public void add() throws InterruptedException
	{
		
		WebDriver gojo = new ChromeDriver();
		
	
		gojo.get("https://www.amazon.in/");
		
		gojo.manage().window().maximize();
		
		page_1 pg = new page_1(gojo);
		
	page_2 pg2 = new page_2(gojo);
		
		page_3 pg3 = new page_3(gojo);
		
		Thread.sleep(3000);
		pg.search("iphone 17");
		Thread.sleep(3000);
		pg.button();
		Thread.sleep(3000);
		pg2.name();
		Thread.sleep(3000);
		
		//pg3.cart();
		Thread.sleep(3000);
		
		gojo.quit();
		
		
	}
	
	
	
	
	
	
}
