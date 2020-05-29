package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath = "//span[contains(text(), ' Welcome Eashweshwarreddy')]")
	WebElement UserTitle;
	
	
	@FindBy (xpath = "//a[contains(text(), 'Contacts')]")
	WebElement contactstab;
	
	@FindBy (xpath = "//a[contains(text(), 'Deals)']")
	WebElement dealstab;
	
	@FindBy (xpath = "//a[contains(text(), 'Activities)']")
	WebElement activitiestab;
	
	@FindBy (xpath = "//a[contains(text(), 'Accounts)']")
	WebElement acountstab;
	
	
	public HomePage (){
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyhomepagetitle() {
		
		return driver.getTitle();
	}
	
	public boolean usertitle() {
		
		return UserTitle.isDisplayed();
	}
	
	public ContactsPage clickoncontactstab() {
		
		contactstab.click();
		
		return new ContactsPage();
	}
	public DealsPage clickondealstab() {
		
		dealstab.click();
		
		return new DealsPage();
		
	}
	
	public ActivitiesPage clickonactivitiestab() {
		
		activitiestab.click();
		
		return new ActivitiesPage();
		
	}
	
	public AccountsPage cliclonaccountstab() {
		
		acountstab.click();
		
		return new AccountsPage();
	}
}
