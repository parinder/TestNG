package Group_Functionality;

import org.testng.annotations.Test;


public class Test_Home_Loan {
	
	@Test
	public void Home_Web_Login() {
		System.out.println("Home web login Successful");
		
	}
	@Test(groups= {"MobileTestingOnly"})
	public void Home_Mobile_Login() {
		System.out.println("Home mobile login Successful");
		
	}
	
	@Test
	public void Home_Api_Login() {
		System.out.println("Home Api login Successful");
		
	}


}
