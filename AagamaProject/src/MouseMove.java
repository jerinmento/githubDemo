import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerin\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.hdfcbank.com");
Actions act=new Actions(driver);

//WebElement a = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[13]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[5]/a"));

WebElement a =driver.findElement(By.xpath("//*[@title='menuHeader' and class= ' ']"));
WebElement b= driver.findElement(By.xpath("//*[@id=\'main\']/div/div[13]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/ul/li[2]/a/span"));
act.moveToElement(a);
act.moveToElement(b).click().build().perform();
	
	
	}

}
