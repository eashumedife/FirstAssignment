package com.assignment.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.qa.base.TestBase;

public class LoginPage extends TestBase{

	
	@FindBy(id = "email")
	
	WebElement username;
	
	@FindBy (id= "pass")
	
	WebElement password;
	
	@FindBy (id = "u_0_b")
	
	WebElement login;
	
	
	
	
		public LoginPage () {
		
			//PageFactory.initElements(driver, this);
			PageFactory.initElements(driver, this);
		
			}

		public HomePage signin(String un, String pwd) {
			
			
			username.sendKeys(un);
			
			password.sendKeys(pwd);
			
			login.click();
			
			return new HomePage();
			
		}


}
