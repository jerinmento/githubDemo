import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import okhttp3.internal.connection.RouteSelector.Selection;

public class makemytripChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/jerin/Downloads/chromedriver_win32/chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.navigate().to("https://makemytrip.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//*[@id=\'SW\']/div[2]/div[2]/div/div/nav/ul/li[1]/a/span[1]")).click();
                                   
driver.findElement(By.cssSelector("#SW > div.landingContainer > div.headerOuter > div > div > nav > ul > li:nth-child(1)")).click();
driver.findElement(By.id("fromCity")).sendKeys("Bangalore");

Actions act=new Actions(driver);
WebElement a =driver.findElement(By.xpath("//*[@id=\'react-autowhatever-1-section-0-item-0\']/div/div[1]/p[1]"));
act.moveToElement(a).click().perform();

WebElement tocity = driver.findElement(By.id("toCity"));
act.moveToElement(tocity).click();//.perform();
tocity.sendKeys("chennai");
Thread.sleep(1000);
WebElement suggestToCity =driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']/div/div[1]/p[1]"));
act.moveToElement(suggestToCity).click().perform();

WebElement dDate=driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[2]/div/p[1]"));
Thread.sleep(1000);
act.moveToElement(dDate).click().perform();

	
	//WebDriverWait wait =new WebDriverWait(driver,20);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
	
	/**Select from =new Select(driver.findElement(By.xpath("//*[@id='fromCity']")));
	List<WebElement> fromList = from.getOptions();
	fromList.get(1).click();**/
	}

}
