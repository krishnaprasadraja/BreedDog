package in.breeddogs;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginValidationTest {

	@Test
		// with correct mail and password
	
		public void validMailAndPassword() {
			
			String email="kpraja956@gmail.com";
			String Password="kpraja";
			boolean loginStatus=UserDetails.loginValidation(email, Password);
			assertTrue(loginStatus);
			
		}
	
	@Test
	//Invalid Mail not in user list
	
		public void inValidMail() {
			
			String email="invalidMail@gmail.com";
			String Password="kpraja123";
			boolean loginStatus=UserDetails.loginValidation(email, Password);
			assertFalse(loginStatus);
			
		}
		
	@Test
		//Incorrect Mail format
	
		public void inCorrectMail() {
			
			String email="kpraja@956.gmail.com";
			String Password="kpraja";
			boolean loginStatus=UserDetails.loginValidation(email, Password);
			assertFalse(loginStatus);
			
		}
	
	@Test
	//Valid Mail with wrong password
	
		public void inValidPassword() {
			
			String email="kpraja956@gmail.com";
			String Password="kpr";
			boolean loginStatus=UserDetails.loginValidation(email, Password);
			assertFalse(loginStatus);
			
		}
	
	
	
}
