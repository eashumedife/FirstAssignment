package com.assignment.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.qa.base.TestBase;

public class WalletHubReviewPage  extends TestBase{

	
	@FindBy (xpath = "//*[contains(@class,'wh-rating rating_4')]")
	WebElement nStar;
	
	@FindBy(xpath = "//*[contains(@class,'wh-rating-choices-holder')]/a[4]")
     WebElement star;
	
	@FindBy(css = ".dropdown-list-new")
	   WebElement policy_list;

	@FindBy(css = "[data-target='Health']")
	 WebElement health_policy;


	 @FindBy(xpath = "//*[@id=\"reviews-section\"]/modal-dialog/div/div/write-review/div/div[1]/textarea")
	    WebElement review_write;

	 @FindBy(xpath = "//*[@id=\"reviews-section\"]/modal-dialog/div/div/write-review/sub-navigation/div/div[2]")
	     WebElement review_submit;
	   
	 @FindBy (xpath = "file:///*[@id=%22scroller%22]/main/div/div/div[2]/div/div[2]/p/text()")
		
		WebElement sub_review_text;
	
	public WalletHubReviewPage() {
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Actions builder=new Actions(driver);
	public WalletHubReviewValidationPage WalletHubProfilePage(String randomtext) {
			
		Actions action = new Actions(driver);
		
		action.moveToElement(nStar).moveToElement(star).click().perform();
		
		policy_list.click();
		
		health_policy.click();
		
		review_write.click();
		
		review_submit.sendKeys(randomtext);
		
		
		driver.navigate().to(prop.getProperty("review_url"));
		
		return new WalletHubReviewValidationPage();
		
		
		
		
	}
}
