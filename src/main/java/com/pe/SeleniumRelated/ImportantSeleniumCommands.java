package com.pe.SeleniumRelated;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ImportantSeleniumCommands {
	
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
	
	public WebDriver driver ;
	

	/*
	 * Using Select class for Dropdowns
	 */
	public void SelectClass() {
		Select select = new Select(webElement) ;
		select.deselectAll();  //clears all the selected entries
		select.deselectByIndex(index);
		select.deselectByValue(value);      //
		select.deselectByVisibleText(text); //deselects an option based on the visible String text
		select.selectByIndex(index);      //selects an option based on the index 
		select.selectByValue(value);      //selects an option based on the String value
		select.selectByVisibleText(text); //selects an option based on the String text
		select.getAllSelectedOptions();   //gets all the selected options from the dropdown
		select.getFirstSelectedOption();  // gets first selected option from the dropdown
		select.getOptions();   // gets all options whether it is selected or not selected 
	}
	
	
	public void frames() {
		driver.findElements(By.tagName("iframe")).size();
		
		driver.switchTo().frame(index);
		driver.switchTo().frame(text); // text = name
		driver.switchTo().frame(frameElement);  //frameElement = webelement
	}
	
	
	
	/*
	 * handle web based pop -ups
	 */
	
	public void AlertInterface() {
		Alert alert = driver.switchTo().alert();
		alert.accept();                  // clicks on Ok button in the pop up
		alert.dismiss();                 // clicks on Cancel button in the pop up
		alert.getText();              	 // gets the text from the pop up
		alert.sendKeys(text);            // enters the data if input field is present 
		
		}
	
	
	/*
	 * Handle Windows based pop up or Window Handles
	 */
	public void WindowHandles() {
		String currentWindow = driver.getWindowHandle();
		Set<String> listOfAllWindows = driver.getWindowHandles();
		for(String str : listOfAllWindows) {
			if(! currentWindow.equalsIgnoreCase(str)) {
				driver.switchTo().window(str);
			}
		}
	}
	
	/*
	 * Get Window ID on run time
	 */
	public void getWindowID() {
		Set<String> windowNames = driver.getWindowHandles();
		Iterator<String> itr = windowNames.iterator();
		
		ArrayList<String> ids = new ArrayList<String>();
		
		while(itr.hasNext()) {
			ids.add(itr.next());
		}
		
		driver.switchTo().window(ids.get(3));
	}
	
	/*
	 * Get Coordinates of Window
	 */
	
	public void getCordinatesOfWindow() {
		Point position = driver.manage().window().getPosition();
		position.getX();
		position.getY();
	}
	
	/*
	 * Mouse Actions
	 */
	public void ActionsClass() {
		Actions actions = new Actions(driver);
		actions.build();             //Generates a composite action containing all actions so far, ready to be performed
		actions.build().perform();   //Performs the action which is build
		
		actions.click();             //Clicks at the current mouse location.
		actions.click(webElement);   //Clicks at the Web Element location.
		actions.clickAndHold();      //Clicks (without releasing) at the current mouse location.
		actions.clickAndHold(webElement);  //Clicks (without releasing) in the middle of the given element
		actions.contextClick();    //Performs a context-click[Right Click] at the current mouse location.
		actions.contextClick(webElement);  //Performs a context-click[Right Click] in the middle of the given element
		actions.doubleClick();
		actions.doubleClick(webElement);
		actions.dragAndDrop(sourceWebElement, targetWebElement);
		actions.dragAndDropBy(sourceWebElement, xOffset, yOffset); // A convenience method that performs click-and-hold at the location of the source element,
														 //	moves by a given offset, then releases the mouse.
		actions.keyDown(Keys.ALT);    //Performs a modifier key press. Does not release the modifier key - subsequent interactions may assume it's kept pressed.
		actions.keyDown(targetWebElement, Keys.ALT); //Performs a modifier key press after focusing on an element. Equivalent to: Actions.click(element).sendKeys(theKey);
		actions.keyUp(Keys.ALT);      //Performs a modifier key release.
		actions.keyUp(webElement, Keys.ALT); //Performs a modifier key release after focusing on an element.
		actions.moveByOffset(xOffset, yOffset);  //Moves the mouse from its current position (or 0,0) by the given offset. If the coordinates provided 
												//are outside the viewport (the mouse will end up outside the browser window) then the viewport 
												//is scrolled to match
		
		actions.moveToElement(webElement);  //Moves the mouse to the middle of the element. 
		actions.moveToElement(targetWebElement, xOffset, yOffset);   //Moves the mouse to an offset from the top-left corner of the element
		actions.pause(pause);   // performs a pause 
		actions.release();   //Releases the depressed left mouse button at the current mouse location.
		actions.release(webElement);  //Releases the depressed left mouse button, in the middle of the given element.
		actions.sendKeys(webElement, Keys.ALT);

	}
	
	
	/*
	 * Different ways to do Drag and Drop
	 */
	public void DragAndDrop() {
		Actions actions = new Actions(driver);
		
		//method 1 :
		actions.dragAndDrop(sourceWebElement, targetWebElement);
		
		//method 2 :
		actions.clickAndHold(sourceWebElement).moveToElement(targetWebElement).release();
		
		//method 3 :
		
		actions.moveToElement(sourceWebElement)
		       .keyDown(Keys.CONTROL)
		       .moveToElement(targetWebElement)
		       .keyUp(Keys.CONTROL)
		       .build().perform();
		
		//method 4 :
		
		actions.dragAndDropBy(sourceWebElement, xOffset, yOffset);
		
	}
	
	
	/* load property file */
	public void loadFile() throws IOException {
		Properties OR = new Properties();
		File file = new File(System.getProperty("user.dir")+"locationPathOfTheFile") ;
		FileInputStream fis = new FileInputStream(file);
		OR.load(fis);
	}
	
	
	/*
	 * JavaScript Commands
	 */
	
	
	
	
	
	
}
