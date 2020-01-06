package javaprojectEkta;
import org.testng.annotations.Test;

public class NewTestNGGroup {
  @Test(groups= {"Functional test","Smoke Testing"})
  public void testCase1() {
	  System.out.println("Test Case 1");
  }
  
  @Test(groups= {"Sanity test","Smoke Testing"})
  public void testCase2() {
	  System.out.println("Test Case 2");
  }
  
  @Test(groups= {"Regression test","Smoke Testing"})
  public void testCase3() {
	  System.out.println("Test Case 3");
  }
  
  
  @Test(groups= {"Regression test","Sanity Testing"})
  public void testCase4() {
	  System.out.println("Test Case 4");
  }
}
