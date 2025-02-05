package com.Creatio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatioSignup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.creatio.com/login/alm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Deny']")).click();
		
		//click on signup button
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[contains(@class, 'contained mat-primary button')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@aria-label='Business email']")).sendKeys("abc@example.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abc@example123");
		driver.findElement(By.xpath("//span[contains (@class, 'btn-reversible-content button')]")).click();
		
		//Create a free account
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("SUMIT");
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("SAGAR");
		driver.findElement(By.xpath("//input[@aria-label='Company']")).sendKeys("FISERV");
		driver.findElement(By.xpath("//input[@aria-label='Website']")).sendKeys("https://www.fiserv.com/");
		driver.findElement(By.xpath("//input[@aria-label='Country']")).sendKeys("INDIA");
		driver.findElement(By.xpath("//input[@aria-label='Phone']")).sendKeys("999999999");
		driver.findElement(By.xpath("//div[@class='sign-form-button']//button[@type='button'}")).click();
		

	}

}
