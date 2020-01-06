import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/jerin/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("testing");
		//keyboard is use actions class
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("hello").perform();
		
		//click submit button we can return or enter both will work
		//action.sendkeys(keys.Return).perform();
		action.sendKeys(Keys.ENTER).perform();
		
	}

}
