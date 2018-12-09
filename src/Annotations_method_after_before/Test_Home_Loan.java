package Annotations_method_after_before;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test_Home_Loan {
	
	@Test
	public void Home_Web_Login() {
		System.out.println("Home web login Successful");
		
	}
	@BeforeMethod
	public void Home_Mobile_Login() {
		System.out.println("Home mobile login Successful");
		
	}
	
	@Test
	public void Home_Api_Login() {
		System.out.println("Home Api login Successful");
		
	}


}
