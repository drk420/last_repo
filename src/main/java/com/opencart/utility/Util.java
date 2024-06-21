package com.opencart.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.opencart.testbase.Testbase;

public class Util extends Testbase {

	
	
	public static void CaptureScreeenshot (String filename) {
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = "D:\\Eclipse_2023-06\\Naveenautomationlabs\\ScreenShot\\";
		
		File des = new File(path+filename+".png");
	
			FileHandler.copy(src, des);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
