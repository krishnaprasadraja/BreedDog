package in.breeddogs;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailValidationTest {

	/**
	 * This method is used to check the valid Email
	 */
	
	@Test
	
	public void ValidEmail() {
		
		String email="kpraja956@gmail.com";
		boolean result=Validation.isEmailValid(email);
		assertTrue(result);
	}

	/*
	 * This Method is used to check the Invalid Email
	 */
	
	@Test
		
		public void InValidEmail() {
			
			String email="@kpraja.gmail.com";
			boolean result=Validation.isEmailValid(email);
			assertFalse(result);
		}
}

