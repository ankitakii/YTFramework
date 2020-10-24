package org.testing.assertions;

public class Assert {

	public static  void Assertion(String expected , String acutal) {

		if(expected.equals(acutal)) {
			System.out.println("Assertion pass");
		} 
		else {
			System.out.println("Assertion fail");
		}
	}
}
