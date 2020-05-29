package com.assignment.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.assignment.qa.base.TestBase;

public class WalletHubReviewValidationPage extends TestBase {

	
	
		public WalletHubReviewValidationPage() {
		
		
		PageFactory.initElements(driver, this);
		
	}
		
		
		public void reviewValidation (String text) {
			
			
			Assert.assertEquals(driver.getPageSource().contains(text), "Review is not visible");
			
			
		}
		
		
		
	
}
