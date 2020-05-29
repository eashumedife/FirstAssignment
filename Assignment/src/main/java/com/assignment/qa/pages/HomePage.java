package com.assignment.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.qa.base.TestBase;

public class HomePage extends TestBase{

	
	
	@FindBy(name = "xhpc_message")
    WebElement status;
 
    @FindBy (xpath = "//button[contains(.,'Post')]")
    WebElement postButton;
    
    public HomePage() {
		
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	
		}
	
    public void postStatus(String textStatus){
        status.click();
        status.sendKeys(textStatus);
        postButton.click();
    }
}
