package com.demoqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {
	static WebDriver driver;

	public static void main(String[] args) {

//      1. Launch browser window(Chrome)

		driver = new ChromeDriver();

//      2. Maximize the browser window

		driver.manage().window().maximize();

//      3. Delete all the cookies

		driver.manage().deleteAllCookies();

//      4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)

		driver.get("https://demoqa.com/automation-practice-form");

//      5. Wait for Page-load

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@src='/images/Toolsqa.jpg']"), 0));

//      6. Enter First name and Last name

		WebElement Firstname = driver.findElement(By.xpath("//input[@id ='firstName']"));
		WebElement Lastname = driver.findElement(By.xpath("//input[@id ='lastName']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", Firstname);
		Firstname.clear();
		Firstname.sendKeys("Automation");
		Lastname.clear();
		Lastname.sendKeys("Testing");

//      7. Enter Email

		WebElement Email = driver.findElement(By.xpath("//input[@id ='userEmail']"));
		Email.clear();
		Email.sendKeys("automation@testing.com");

//      8. Select Gender (Female)
		selectgender("Male");

//      9. Enter mobile number
		WebElement MobileNumber = driver.findElement(By.xpath("//input[@id ='userNumber']"));
		js.executeScript("arguments[0].scrollIntoView()", MobileNumber);
		MobileNumber.clear();
		MobileNumber.sendKeys("9999999999");

//      10.Select DOB (1-Feb-1991)
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();

		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		yearDropdown.click();
		driver.findElement(By.xpath("//option[text()='1995']")).click();

		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		monthDropdown.click();
		driver.findElement(By.xpath("//option[text()='February']")).click();

		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--001']")).click();

//      11.Search and Select Computer Science

		WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		subjectInput.sendKeys("Computer Science");
		subjectInput.sendKeys("\n");

//      12.Select Hobbies as Sports and Reading

		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		System.out.println("till now code is working");

//      13.Upload photo
		
		WebElement uploadButton = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadButton.click();
		uploadButton.sendKeys("C:\\Users\\HP\\download.jpg");

//      14. Wait till window open to upload the file

//      15. Upload file

//      16. Wait till file upload

//      17.Submit Details
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].click();", submitButton);
		

//      18. Close browser window
		driver.quit();

	}

	public static void selectgender(String option) {
		WebElement gender = driver.findElement(By.xpath("//label[text()='" + option + "']"));
		gender.click();
	}
}
