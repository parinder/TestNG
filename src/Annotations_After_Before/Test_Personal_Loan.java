package Annotations_After_Before;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class Test_Personal_Loan {
	
	@Test
	public void Personal_Web_Login() {
		System.out.println("Personal web login Successful");
		
	}
	@BeforeTest
	public void Personal_Mobile_Login() {
		System.out.println("Personal mobile login Successful");
		
	}
	@AfterTest
	public void Personal_Api_Login() {
		System.out.println("Personal Api login Successful");
		
	}


}
