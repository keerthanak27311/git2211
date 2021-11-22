package org.testone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Murl {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\workspace\\Selenium1\\mozilladriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.get(" http://greenstech.in/selenium-course-content.html\r\n");

}}