import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNgFile {
  @Test
  public void verifyHomePageTitle() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/jerin/Downloads/chromedriver_win32/chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.get("http://www.newtours.demoaut.com/");
	 String expectedTitle = "Welcome: Mercury Tours";
	 String actualTitle = driver.getTitle();
	 Assert.assertEquals(actualTitle, expectedTitle);
	 driver.close();
  }
}
