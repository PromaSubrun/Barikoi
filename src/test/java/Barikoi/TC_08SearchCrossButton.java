package Barikoi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_08SearchCrossButton extends DriverSetup{
	
	public static String url="https://barikoi.com/search";
	
	@Test
	public static void Barikoi() throws InterruptedException {
		
		//Launch the web application.
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		//Locate the search bar element then enter a Invalid search query.
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Barikoi");
		Thread.sleep(5000);
		
		// Click on the "Cross" button.
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/svg[1]/path[1]")).click();
		Thread.sleep(5000);
		
		
	}
}

