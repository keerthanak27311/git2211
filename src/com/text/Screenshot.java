package com.text;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\Selenium\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement down = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		down.sendKeys("hp laptops");
		WebElement a = driver.findElement(By.xpath("//span[text()='Search']"));
		
		a.click();
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File desc=new File("C:\\workspace\\Selenium1\\screenshot\\hp.png");
		FileUtils.copyFile(src, desc);
		
	}
}
