package com.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\Selenium\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get(" https://retail.onlinesbi.com/retail/login.htm");
		WebElement a = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		a.click();
	
		
	}

}
