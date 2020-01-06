import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class login {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:/Users/jerin/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");

	System.out.println("Driver title is "+ driver.getTitle());
	
	
	//for maximizing the browser
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	
		
	/**driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("password");
	driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();**/
	
	
	/**Select select=new Select(driver.findElement(By.id("day")));
	List<WebElement> values =select.getOptions();
	values.get(4).click();
	
	Select mselect=new Select(driver.findElement(By.id("month")));
	List<WebElement> mvalues = mselect.getOptions();
	mvalues.get(3).click();
	
	Select yselect=new Select(driver.findElement(By.id("year")));
	List<WebElement> yvalues = yselect.getOptions();
yvalues.get(1).click();**/
	
	Select day =new Select(driver.findElement(By.id("day")));
	day.selectByIndex(5);
	
	Select month =new Select(driver.findElement(By.id("month")));
	month.selectByValue("1");
	
	Select year =new Select(driver.findElement(By.id("year")));
	year.selectByVisibleText("2019");
	
	driver.close();    //will close current tab
	//driver.quit();  will close all tab in the browser
	
	

	
	
	
}
}