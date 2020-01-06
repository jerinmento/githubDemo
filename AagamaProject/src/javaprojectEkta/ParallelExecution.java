package javaprojectEkta;

import org.testng.annotations.Test;

public class ParallelExecution {
	@Test(priority = 2)
	  public void testCase1() {
		  System.out.println("TestCase 1");
	  }
	  @Test(priority = 4)
	  public void testCase2() {
		  System.out.println("TestCase 2");
	  }
	  @Test(priority = 1)
	  public void testCase3() {
		  System.out.println("TestCase 3");
	  }
	  @Test(priority = 3)
	  public void testCase4() {
		  System.out.println("TestCase 4");
	  }
}
