package crickbuzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class main_1 {
	@Test
	public void main() throws InterruptedException
	{
		WebDriver gojo =new FirefoxDriver();
		
				start_1 s1 =new start_1(gojo);
				start_2 s2 =new start_2(gojo);
				start_3 s3 =new start_3(gojo);
				
				s1.aro();
				Thread.sleep(3000);
				s1.cup();
				Thread.sleep(3000);
				s2.sclick();
				Thread.sleep(3000);
				s3.tablesome();
				 
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
