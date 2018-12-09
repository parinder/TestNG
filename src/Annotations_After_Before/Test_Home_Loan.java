package Annotations_After_Before;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class Test_Home_Loan {
	
	@Test
	public void Home_Web_Login() {
		System.out.println("Home web login Successful");
		
	}
	@BeforeTest
	public void Home_Mobile_Login() {
		System.out.println("Home mobile login Successful");
		
	}
	
	@AfterTest
	public void Home_Api_Login() {
		System.out.println("Home Api login Successful");
		
	}


}
