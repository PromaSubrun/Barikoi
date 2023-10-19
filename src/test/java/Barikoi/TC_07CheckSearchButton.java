package Barikoi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_07CheckSearchButton extends DriverSetup {
    
    public static String url = "https://barikoi.com/search";

    @Test
    public static void Barikoi() throws InterruptedException {

    	//Launch the web application.
    			driver.get(url);
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    			driver.manage().window().maximize();
    			Thread.sleep(8000);

        // Verify search button is displayed.
        WebElement searchValue = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/button[1]")); // Adjust the locator as needed
        if (searchValue.isDisplayed()) {
            System.out.println("Search button is displayed");
        } else {
            System.out.println("Search button is not displayed");
        }
}
}
