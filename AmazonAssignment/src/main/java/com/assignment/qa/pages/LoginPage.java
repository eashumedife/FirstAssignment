package com.assignment.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	@FindBy(name = "email")
	
	WebElement username;
	
	@FindBy (xpath = "//span[contains(text(),'Account & Lists') and @class='nav-line-2 ']")
	WebElement accountClick;
	
	@FindBy(xpath = "//input[@id = 'continue']")
	
	WebElement next;
	
	@FindBy(xpath = "//input[@name = 'password']")
	
	WebElement password;
	
	@FindBy(xpath = "//input[@id = 'signInSubmit']")
	
	WebElement login;

	
	
	
	public LoginPage () {
		
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void validateLoginPage() {
		
	
	
		
	}
	public HomePage signin(String un, String pwd) {
		
		//String title = driver.getTitle();
		
		//System.out.println(title);
		
		//if (title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			
			//Actions actions = new Actions(driver);
			//WebElement mainMenu = 
			//driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2 ']")).click();
			
		//}
		//driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2 ']")).click();
		
		accountClick.click();
		
		username.sendKeys(un);
		
		next.click();
		
		password.sendKeys(pwd);
		
		login.click();
		
		return new HomePage();
		
	}
}
