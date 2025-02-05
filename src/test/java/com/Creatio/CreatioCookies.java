package com.Creatio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatioCookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.creatio.com/login/alm");
		driver.manage().window().maximize();
		
		//cookies Action
		driver.findElement(By.xpath("//button[text()='Deny']"));
		driver.findElement(By.xpath("//button[text()='Allow selection']"));
		driver.findElement(By.xpath("//button[text()='Allow all']"));
		//Footer button
		driver.findElement(By.xpath("//input[@id ='CybotCookiebotDialogBodyLevelButtonPreferences']"));
		driver.findElement(By.xpath("//input[@id ='CybotCookiebotDialogBodyLevelButtonStatistics']"));
		driver.findElement(By.xpath("//input[@id ='CybotCookiebotDialogBodyEdgeMoreDetailsLink']"));
		

	}

}
