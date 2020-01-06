import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test
  public void login() {
	  System.out.println("log in");
  }
  
  @Test(dependsOnMethods= {"login"})
  public void search() {
	  Assert.assertEquals("abc", "xyz");
  }
  
  @Test(dependsOnMethods= {"search"},alwaysRun=true)
  public void logout() {
	  System.out.println("log out");
  }
}
