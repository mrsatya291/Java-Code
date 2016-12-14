package com.invoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeFire {
	
	public static void main(String[] arg){
		System.setProperty("webdriver.ie.driver","C:\\Users\\satya.f.prakash\\Documents\\Selenium\\IEDriverServer.exe" );
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.quit();
		
	}

}
