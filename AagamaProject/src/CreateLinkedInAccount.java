import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CreateLinkedInAccount {
	 WebDriver driver;
  @Test
  public void createAccount() {
	  driver.findElement(By.xpath("/html/body/nav/a[2]")).click();
	  
  }
  @Test
  public void userPass() {
	  driver.findElement(By.xpath("/html/body/nav/a[2]")).click();
	  driver.findElement(By.id("join-email")).sendKeys("frank@gmail.com");
	  driver.findElement(By.id("join-password")).sendKeys("password");
	  driver.findElement(By.id("submit-join-form-text")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/jerin/Downloads/chromedriver_win32/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https:\\linkedin.com");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  //Thread.sleep(1000);
	 driver.close();
  }

}
