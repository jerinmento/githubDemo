import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 2)
  public void testCase1() {
	  System.out.println("TestCase 1");
  }
  @Test(priority = 4,invocationCount=3,invocationTimeOut=20,description="This test case is about search functionality")
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
