package com.Creatio;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreatioLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.creatio.com/login/alm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Deny']")).click();

		// enter email and password and click on login button

		driver.findElement(By.xpath("//input[@aria-label='Business email']")).sendKeys("abc@example.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type ='button']")).click();

		// Validate error message

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions
				.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Invalid email or password']"), 0));

		WebElement messageElement = driver.findElement(By.xpath("//span[text()='Invalid email or password']"));
		String actualMessage = messageElement.getText();
		Assert.assertEquals(actualMessage, "Invalid email or password", "Error message does not match!");

		// validate all social media link

		// LinkedIN
		driver.findElement(By.xpath("//img[@class ='icon-LinkedIn']")).click();
		driver.navigate().back();
		// Google
		driver.findElement(By.xpath("//img[@class ='icon-google']")).click();
		driver.navigate().back();
		// Facebook
		driver.findElement(By.xpath("//img[@class='icon-facebook']")).click();
		driver.navigate().back();

		driver.quit();

	}

}
