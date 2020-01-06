import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excellogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

FileInputStream fil=new FileInputStream(new File("C:\\Users\\jerin\\Desktop\\TestExl1.xlsx"));
XSSFWorkbook workbook =new XSSFWorkbook(fil);
//creating sheet reference and get sheet method will get menn
XSSFSheet sheet=workbook.getSheet("Sheet1");
int count=sheet.getLastRowNum();
System.out.println(count);
for(int i=0;i<=count;i++) {
	XSSFRow row=sheet.getRow(i);
	XSSFCell cell =row.getCell(0);
	String un =cell.getStringCellValue();
	XSSFCell cell1 =row.getCell(1);
	String pwd =cell1.getStringCellValue();
	System.setProperty("webdriver.chrome.driver", "C:/Users/jerin/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	driver.get("https://facebook.com");
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(pwd);
	driver.findElement(By.id("u_0_2")).click();
	driver.close();
	workbook.close();
	
}
	}

}
