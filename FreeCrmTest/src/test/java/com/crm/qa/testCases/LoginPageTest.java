package com.crm.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	
	LoginPage loginpage ;
	HomePage homepgae;
	public LoginPageTest() {
		
		super();
		
	}
	
	
	@BeforeMethod
	
	public void setUp() {
		
		initializaion();
		
		loginpage = new LoginPage();
	}
	@Test(priority = 1)
	public void loginTest() {
		
		homepgae =loginpage.LoginValidation(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
}
