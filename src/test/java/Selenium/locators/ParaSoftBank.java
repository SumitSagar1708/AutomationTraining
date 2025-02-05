package Selenium.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaSoftBank {

	public static void main(String[] args) {
//      1. Launch the Browser window (Browser = Chrome)
		WebDriver driver = new ChromeDriver();

//		2. Maximize the browser window  
		driver.manage().window().maximize();

//		3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)  
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		
		
		
		// Find all elements with a specific tag, e.g., div
        List<WebElement> allDivs = driver.findElements(By.tagName("div"));

        // Print the number of div elements found
        System.out.println("Number of div elements: " + allDivs.size());

        // Iterate through the list and print the text of each element
        for (WebElement div : allDivs) {
            System.out.println(div.getText());
        }

        // Close the browser
        driver.quit();

	}

}
