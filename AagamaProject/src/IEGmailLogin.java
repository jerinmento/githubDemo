import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IEGmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.ie.driver", "C:\\Users\\jerin\\Downloads\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
driver.get("https://accounts.google.com/signin");
System.out.println("The title of the driver is "+ driver.getTitle() );

driver.findElement(By.id("identifierId")).sendKeys("jerincaroline@gmail.com");

driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
	}

}
