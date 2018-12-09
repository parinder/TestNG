package Annotations_After_Before;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class Test_Car_Loan {
	
	@Test
	public void Car_Web_Login() {
		System.out.println("Car web login Successful");
		
	}
	@BeforeTest
	public void Car_Mobile_Login() {
		System.out.println("Car mobile login Successful");
		
	}
	@AfterTest
	public void Car_Api_Login() {
		System.out.println("Car Api login Successful");
		
	}


}
