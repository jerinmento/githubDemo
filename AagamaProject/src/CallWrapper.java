import java.io.IOException;

import javaprojectEkta.WrapperMethods;

public class CallWrapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WrapperMethods wm=new WrapperMethods();
		wm.insertApp("https://www.facebook.com");
		wm.enterbyid("email", "frank22j@gmil.com");
		wm.enterbyid("pass", "frank");
		wm.clickbyxpath("//*[@id=\"u_0_b\"]");
		wm.takesnap("C:\\Users\\jerin\\Documents\\mydocuments\\facebook1.png");
		wm.closeapp();
	}

}
