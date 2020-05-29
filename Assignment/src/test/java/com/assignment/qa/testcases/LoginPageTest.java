package com.assignment.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.qa.base.TestBase;
import com.assignment.qa.pages.HomePage;
import com.assignment.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		
		super();
		
	}
	
	
	@BeforeMethod
	
	public void setUp() {
		
		
		initializaion();
		driver.get(prop.getProperty("fb_url"));
		
		 loginpage = new LoginPage();
	}
	

	@Test(priority =1)
	
	public void loginTest() {
		
		homepage = loginpage.signin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod 
	
	public void tearDown() {
		
		driver.quit();
	}

}
