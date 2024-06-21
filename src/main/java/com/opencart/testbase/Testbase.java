package com.opencart.testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Testbase {
	
	public static WebDriver driver;
	public static Logger logger;
	@BeforeTest
	public void start() {
		logger=logger.getLogger("opencart framework");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("framework execution started");
	}
	
	@AfterTest
	public void end() {
		logger.info("framework execution stopped");
		
	}
	@BeforeMethod
	public void SetUp() {
		
		String Browser = "chrome";
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			logger.info("Browser is launched and url");
		}
		else if(Browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		}
		else if(Browser.equalsIgnoreCase("edge")) {
			
			driver=new EdgeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		}
		else {
			
			System.out.println("enter correct browser");
		}}
		
	    @AfterMethod
		public void TearDown() {
			
			driver.quit();
			logger.info("browser closed");
		}
		
		
	
	
	
	
	
	
	
	
	

}
