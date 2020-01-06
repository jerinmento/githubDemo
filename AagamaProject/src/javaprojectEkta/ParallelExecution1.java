package javaprojectEkta;

import org.testng.annotations.Test;

public class ParallelExecution1 {
	@Test(priority = 2)
	  public void testCase5() {
		  System.out.println("TestCase 5");
	  }
	  @Test(priority = 4)
	  public void testCase6() {
		  System.out.println("TestCase 6");
	  }
	  @Test(priority = 1)
	  public void testCase7() {
		  System.out.println("TestCase 7");
	  }
	  @Test(priority = 3)
	  public void testCase8() {
		  System.out.println("TestCase 8");
	  }
}
