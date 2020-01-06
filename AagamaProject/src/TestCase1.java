import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	//actual script
  @Test
  public void testCas1() {
	  System.out.println("testCas1");
	  	   }
  @Test
  public void testCas2() {
	  System.out.println("testCas2");
	  	   }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Beforeamethod");
  }
//close browser
  @AfterMethod //launch browser
  public void afterMethod() {
	  System.out.println("After method");
	  
  }
//testdata ready
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

  @BeforeTest //smoketesting
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
	  
  }
//open db connection
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
System.out.println("After suite");
  }

}
