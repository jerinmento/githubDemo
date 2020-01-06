import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleLinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/jerin/Downloads/chromedriver_win32/chromedriver.exe ");
WebDriver driver=new ChromeDriver();
driver.get("https:\\google.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
searchBox.sendKeys("how to find the no.of links in selenium");

//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
WebDriverWait wait =new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b")));
Actions act=new Actions(driver);
WebElement googleSearch = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b"));
//Thread.sleep(1000);

act.moveToElement(googleSearch).click().perform();

List<WebElement> links=driver.findElements(By.xpath("//a"));
int linkcount=links.size();
System.out.println("The number of link is " + linkcount);
 

	}
}
