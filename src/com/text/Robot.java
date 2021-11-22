package com.text;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Robot {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\workspace\\Selenium\\ChromeDriver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	WebElement b= driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
	Actions a=new Actions(driver);
	a.moveToElement(b).perform();
    
}
}
