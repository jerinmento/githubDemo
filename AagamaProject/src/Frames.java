import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/jerin/Downloads/chromedriver_win32/chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.navigate().to("https://jqueryui.com/draggable/");
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Droppable")).click();

	}
}
