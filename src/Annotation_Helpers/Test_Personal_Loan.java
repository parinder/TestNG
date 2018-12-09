package Annotation_Helpers;

import org.testng.annotations.Test;


public class Test_Personal_Loan {
	
	@Test
	public void Personal_Web_Login() {
		System.out.println("Personal web login Successful");
		
	}
	@Test
	public void Personal_Mobile_Login () {
		System.out.println("Personal mobile login Successful");
		
	}
	@Test(dependsOnMethods= {"Personal_Mobile_Login"})
	public void Personal_Api_Login() {
		System.out.println("Personal Api login Successful");
		
	}


}
