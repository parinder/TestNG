package Annotations_method_after_before;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test_Car_Loan {
	
	@Test
	public void Car_Web_Login() {
		System.out.println("Car web login Successful");
		
	}
	@BeforeMethod
	public void Car_Mobile_Login() {
		System.out.println("Car mobile login Successful");
		
	}
	@Test
	public void Car_Api_Login() {
		System.out.println("Car Api login Successful");
		
	}


}
