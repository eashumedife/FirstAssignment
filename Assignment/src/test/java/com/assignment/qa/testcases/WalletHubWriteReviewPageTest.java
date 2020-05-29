package com.assignment.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.qa.base.TestBase;
import com.assignment.qa.pages.WalletHubLogin;
import com.assignment.qa.pages.WalletHubReviewPage;
import com.assignment.qa.pages.WalletHubReviewValidationPage;


public class WalletHubWriteReviewPageTest extends TestBase{


	WalletHubLogin wallethubloginpage;
	WalletHubReviewPage wallethubreviewpage;
	WalletHubReviewValidationPage wallethubreviewvalidationpage;
	
public WalletHubWriteReviewPageTest() {
		
		super();
	}
	
	@BeforeMethod
	
	public void setUp() {
		
		
		initializaion();
		
		driver.get(prop.getProperty("whub_url2"));
		 wallethubloginpage = new WalletHubLogin();
		wallethubreviewpage = wallethubloginpage.signin(prop.getProperty("husername"), prop.getProperty("hpassword"));
		
		
	}
	
	
	@Test
		public void WalletHubReviewValidationPageTest(){
        
		wallethubreviewvalidationpage.reviewValidation(prop.getProperty("write_review"));
       
    }
	
	@AfterMethod 
	
		public void tearDown() {
		
			driver.quit();
		}
	
	
}
