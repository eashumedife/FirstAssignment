package com.assignment.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.qa.base.TestBase;

public class WalletHubLogin extends TestBase{


	
	@FindBy(xpath = "//*[@id=\"viewport\"]/header/div/nav[3]/div[2]/a[1]")
	WebElement loginlink;
	
	@FindBy (xpath = "//input[@type='text' and contains(@placeholder,'Email')]")
	WebElement walletusername;
	
	@FindBy (xpath = "//input[@type='password' and contains(@placeholder,'Password')]")
	WebElement walletpassword;
	
	
	@FindBy (xpath = "//button//span[contains(text(),'Login')]")
	WebElement loginbutton;
	
	
	
	
	public WalletHubLogin () {
		
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	
		}

	public WalletHubReviewPage signin(String un, String pwd) {
		
		loginlink.click();
		
		walletusername.sendKeys(un);
		
		walletpassword.sendKeys(pwd);
		
		loginbutton.click();
	
		driver.navigate().to(prop.getProperty("review_url"));
		
		return new WalletHubReviewPage();
		
	}
}
