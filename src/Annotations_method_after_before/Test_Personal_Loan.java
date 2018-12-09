package Annotations_method_after_before;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test_Personal_Loan {
	
	@Test
	public void Personal_Web_Login() {
		System.out.println("Personal web login Successful");
		
	}
	@BeforeMethod
	public void Personal_Mobile_Login() {
		System.out.println("Personal mobile login Successful");
		
	}
	@Test
	public void Personal_Api_Login() {
		System.out.println("Personal Api login Successful");
		
	}


}
