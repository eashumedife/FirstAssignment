package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	
	public HomePageTest() {
		
		super();
	
	}
	
	
	@BeforeMethod
	public void setup() {
		
		initializaion();
		contactspage = new ContactsPage();
		loginpage = new LoginPage();
		homepage = loginpage.LoginValidation(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority =1)
	public void verifyhomepagetitletest() {
		
		String HomePagetitle = homepage.verifyhomepagetitle();
		
		Assert.assertEquals(HomePagetitle, "Zoho CRM - Home Page");
	}
	
	@Test(priority = 2)
	
	public void verifyUserTitleTest() {
		
		Assert.assertEquals(homepage.usertitle(), true);
		Assert.assertTrue(homepage.usertitle(), "Title exist");
	
	}
	
	@Test(priority =3)
	public void verifycontactpagetest() {
		
		contactspage =homepage.clickoncontactstab();
		

	}

	@AfterMethod
	public void browserclosing() {
		
	driver.quit();
	}
	
	
}
