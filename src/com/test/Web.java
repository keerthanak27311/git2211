package com.test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\workspace\\Selenium1\\mozilladriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		String a = driver.getTitle();
		System.out.println(a);
		String b = driver.getCurrentUrl();
		System.out.println(b);
		//driver.close();
		WebElement c = driver.findElement(By.id("identifierId"));
		c.sendKeys("anand");
		//WebElement d = driver.findElement(By.class("VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b"));
		WebElement d = driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']") );
		d.click();
		
		
		
	}

}
