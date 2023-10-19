package Barikoi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_06CheckAutoCorrection  extends DriverSetup{
	
	public static String url="https://barikoi.com/search";
	
	@Test
	public static void Barikoi() throws InterruptedException {
		
		//Launch the web application.
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		//Locate the search bar element then enter a valid search query.
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("myBarikoi");
		Thread.sleep(5000);
		
		// Check the auto-correction
        WebElement searchValue = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]")); 

        // Check if the auto-corrected in the search value
        String displayedValue = searchValue.getText();
        if (displayedValue.equals("Barikoi HQ (Barikoi.com)")) {
            System.out.println("Auto-correction worked");
        } else {
            System.out.println("Auto-correction did not work");
        }
		
		
	}
}

