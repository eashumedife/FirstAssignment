package com.assignment.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.qa.base.TestBase;
import com.assignment.qa.pages.HomePage;
import com.assignment.qa.pages.LoginPage;
import com.assignment.qa.pages.WalletHubLogin;
import com.assignment.qa.pages.WalletHubReviewPage;

public class WalletHubReviewPageTest extends TestBase {


	WalletHubLogin wallethubloginpage;
	WalletHubReviewPage wallethubreviewpage;
	
	public WalletHubReviewPageTest() {
		
		super();
	}
	
	@BeforeMethod
	
	public void setUp() {
		
		
		initializaion();
		
		driver.get(prop.getProperty("whub_url2"));
		 wallethubloginpage = new WalletHubLogin();
		wallethubreviewpage = wallethubloginpage.signin(prop.getProperty("husername"), prop.getProperty("hpassword"));
		 
	}
	

	@Test(priority =1)
	
	public void WalletHubWriteReviewPage(){
        
		wallethubreviewpage.WalletHubProfilePage(prop.getProperty("write_review"));
		
       
    }
	
	
	@AfterMethod 
		
		public void tearDown() {
			
			driver.quit();
		}
}
