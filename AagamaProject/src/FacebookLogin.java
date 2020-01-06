import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/jerin/Downloads/chromedriver_win32/chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.navigate().to("https://facebook.com");
driver.findElement(By.xpath("//*[@type='text' and @name='firstname']")).sendKeys("jerin");
driver.findElement(By.xpath("//*[@type='text' and @name='lastname']")).sendKeys("sumathi");
driver.findElement(By.xpath("//input[starts-with(@id,'u_0_k')]")).sendKeys("8754783829");

					//		  *[contains(@name, 'reg_passwd__')]")).sendKeys("newpassword");
//driver.findElement(By.xpath("//*[contains(@name, 'reg_passwd__')]")).sendKeys("newpassword");

driver.findElement(By.xpath("//*[contains(@id,'u_0_p')]")).sendKeys("sertuhjk");

}
}
