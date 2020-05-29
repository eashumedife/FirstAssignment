package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.utils.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/appl/eclipse-workspace/FreeCrmTest/src/main/java/com/crm/qa/config/config.properties");
			prop.load(ip);
			
		} catch(FileNotFoundException e) {
		
			e.printStackTrace();
			
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void initializaion() {
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/appl/Downloads/chromedriver");
			driver = new ChromeDriver();
		}else if(browserName.equals("ff")){
			System.setProperty("webdriver.chrome.driver", "Users/appl/Downloads/gekodriver");
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
		
	}
	
	
}
