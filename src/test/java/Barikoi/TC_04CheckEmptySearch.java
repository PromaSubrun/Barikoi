package Barikoi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_04CheckEmptySearch extends DriverSetup{
	public static String url="https://barikoi.com/search";
	
	@Test
	public static void Barikoi() throws InterruptedException {
		
		//Launch the web application.
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		//Locate the search bar element then keep search bar empty.
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).click();
		Thread.sleep(9000);
		
		// Click on the "Search" button.
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		
		
	}
}
