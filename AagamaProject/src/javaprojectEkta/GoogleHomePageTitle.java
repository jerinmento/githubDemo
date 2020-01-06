package javaprojectEkta;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class GoogleHomePageTitle {
	WebDriver driver;
	
	@BeforeClass
	  public void systemSetup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/jerin/Downloads/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http:google.com");
		driver.manage().window().maximize();
	  }
	
  @Test
  public void verifyGooglePageTitle() {
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle, "Google");
  }
  

  @AfterClass
  public void tearDown() {
	  driver.close();
  }

}

