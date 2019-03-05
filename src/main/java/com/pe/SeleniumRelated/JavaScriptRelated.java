package com.pe.SeleniumRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class JavaScriptRelated {

	public WebDriver driver ;
	
	
	@FindBy(xpath="webElement")
	WebElement webElement ;
	
	@FindBy(xpath="webElement")
	WebElement sourceWebElement ;
	
	@FindBy(xpath="webElement")
	WebElement targetWebElement ;
	
	@FindBy(xpath="webElement")
	WebElement frameElement ;
	
	int index = 0 ;
	String value = "value";
	String text = "text " ;
	
	int xOffset = 100 ;
	int yOffset = 100 ;
	int pause = 1000 ;
	
	
	/*
	 * Ways to execute Javascript
	 */
	public void JavaScriptExecution() {
		
		//Method 1 :

		EventFiringWebDriver dr = new EventFiringWebDriver(driver);
		dr.executeScript("javascript command", "args");
		

		//Method 2 :

		JavascriptExecutor jse = (JavascriptExecutor)driver ;
		jse.executeScript("javascript command", "args");
	}
	
	
	public void JavaSCriptCommands() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver ;
		
		//evaluate xpath using JavaScript
		jse.executeScript("return document.evaluate(xpath,contextNode,nameSpaceResolver,resultType,result)");
		
		//finding element By ID
		jse.executeScript("return document.getElementById('top_nav')");
		
		
		//Finding elements By NAME,TAGNAME,ClassName
		jse.executeScript("return document.getElementsByName('top_nav')");
		jse.executeScript("return document.getElementsByTagName('top_nav')");
		jse.executeScript("return document.getElementsByClassName('top_nav')");
		
		//Getting element attributes
		jse.executeScript("return document.getElementById('top_nav').getAttribute('value') ;");
		
		//Getting total number of frames
		jse.executeScript("return window.frames.length ;");
		
		//Size of the Window
		jse.executeScript("return window.innerHeight ; ");
		jse.executeScript("return window.innerWidth ; ");
		
		//Navigate to different page
		jse.executeScript("return window.location='www.bidare.com' ;");
		
		//Create an alert
		jse.executeScript("alert('Hello Bidare') ;");
		
		//Click on a WebElement
		jse.executeScript("arguments[0].click();", webElement);
		
		//Get Inner Text
		jse.executeScript("return document.documentElement.innerText ;") ;
		
		//Return title
		jse.executeScript("return document.title ;");
		
	}


	/*
	 * using JavaScript wait 
	 */
	
	public void JavaScriptReadyState() {
		ExpectedCondition<Boolean> javaScriptWait = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				JavascriptExecutor jse = (JavascriptExecutor) driver ;
				return jse.executeScript("return document.readyState").equals("complete");
			}
		};
		
		javaScriptWait.apply(driver);
	}
	
	
	/*
	 * JavaScript Functions for Selenium Object Locations
	 */
	
	public void JavaSCriptFunctions() {
		
		//  following-sibling
		driver.findElement(By.xpath("/tr/td/following-sibling::td[1]"));  // so this returns td[2]. next element of td[1]
		
		//Preceeding-sibling
		driver.findElement(By.xpath("/tr/td/preceeding-sibling::td[2]"));  // so this returns td[1]. previous element of td[2]
		
		//starts-with()
		driver.findElement(By.xpath("//*[starts-with(@id,'notify')]"));
		
		//ends-with()
		driver.findElement(By.xpath("//*[ends-with(@id,'notify')]"));
	}
	
	
	/*
	 * Page Scrolling
	 */
	
	public void PageScrolling() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver ;
		
		
		//Scroll down Page to end
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight) ;");
		
		//Scroll Up Page to top
		jse.executeScript("window.scrollTo(0, - document.body.scrollHeight)") ;
		
		//Scroll Horizontally right
		jse.executeScript("window.scrollTo(0,document.body.scrollWidth)");
		
		//Scroll Horizontally Left
		jse.executeScript("window.scrollTo(0, - document.body.scrollWidth)");
		
		//Scroll By Specified Size
		jse.executeScript("window.scrollBy(0,1500) ;");
		jse.executeScript("window.scrollBy(0,-1500) ;");
		
		
		//Scroll To Specified Object
		jse.executeScript("arguments[0].scrollIntoView(true)", webElement);
	}
	
	
	
	
}
