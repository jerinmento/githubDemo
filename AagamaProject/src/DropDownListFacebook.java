import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Users/jerin/Downloads/chromedriver_win32/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https:\\facebook.com");
Select dropdown=new Select(driver.findElement(By.id("month")));
List<WebElement> dropdownlist=dropdown.getOptions();
int listcount=dropdownlist.size();
dropdownlist.get(1).click();
//List<WebElement> dropdownlist= driver.findElement(By.id("month"));
//dropdownlist

//WebElement month=driver.findElement(By.id("month"));

System.out.println(listcount);

	}

}
