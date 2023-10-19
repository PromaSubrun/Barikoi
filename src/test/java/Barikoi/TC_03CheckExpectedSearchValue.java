package Barikoi;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_03CheckExpectedSearchValue extends DriverSetup {
    
    public static String url = "https://barikoi.com/search";

    @Test
    public static void Barikoi() throws InterruptedException {

    	//Launch the web application.
    			driver.get(url);
    			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    			driver.manage().window().maximize();
    			Thread.sleep(8000);
        
        // Locate the search bar element and enter a valid search query.
        WebElement searchBox = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
        searchBox.sendKeys("Barikoi HQ (Barikoi.com)");
        Thread.sleep(4000);
        
        // Click on the "Search" button.
        WebElement searchButton = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/button[1]"));
        searchButton.click();
        Thread.sleep(4000);

        // Verify that the expected search value is displayed.
        WebElement searchValue = driver.findElement(By.xpath("//body/div[@id='app-container']/div[@id='content-container']/div[@id='QA0Szd']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h1[1]"));
        if (searchValue.isDisplayed()) {
            System.out.println("Search value are displayed");
        } else {
            System.out.println("Search value are not displayed");
        }
}
}