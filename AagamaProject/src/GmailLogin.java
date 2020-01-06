import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello i am here");
//System.setProperty("webdriver.ie.driver", "C:\\Users\\jerin\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
System.setProperty("webdriver.ie.driver", "C:\\Users\\jerin\\Downloads\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
driver.get("https://accounts.google.com/signin");

	//WebDriverWait wait = new WebDriverWait(driver,20); 
	//wait.until(ExpectedConditions.titleContains("sign-in google accounts/"));
	//WebDriverWait wait =new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
	//System.out.println("hello i am here");

System.out.println("The title of the driver is "+ driver.getTitle() );

driver.findElement(By.id("identifierId")).sendKeys("jerincaroline@gmail.com");

driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
WebDriverWait wait =new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierNext")));
driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
//driver.findElement(By.id("identifierNext")).click();
//WebDriverWait await =new WebDriverWait(driver, 10);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='password']")));

driver.findElement(By.cssSelector("input[type='password']")).sendKeys("**********");
driver.findElement(By.xpath("//*[@id=\'passwordNext\']/span/span")).click();
	}
}