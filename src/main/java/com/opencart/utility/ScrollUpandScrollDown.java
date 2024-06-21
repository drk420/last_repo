package com.opencart.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.opencart.testbase.Testbase;

public class ScrollUpandScrollDown extends Testbase{

	
	public static void Javascrptexecutoruptowebelement(WebElement name) {
		
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].scrollIntoView(true)",name);
	
	}
	
	
	public static void Javascrptexecutor(WebElement name) {
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
}
