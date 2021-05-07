package in.breeddogs;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginValidationTest {

	@Test
		// with correct mail and password
	
		public void validMailAndPassword() {
			
			UserDetails.addUser("kpraja956@gmail.com", "kpraja12");
			boolean loginStatus=UserDetails.loginValidation("kpraja956@gmail.com", "kpraja12");
			assertTrue(loginStatus);
			
		}
	
	@Test
	//Invalid Mail not in user list
	
		public void inValidMail() {
			
			UserDetails.addUser("kpraja956@gmail.com", "kpraja12");
			boolean loginStatus=UserDetails.loginValidation("invalidMail@gmail.com", "kpraja123");
			assertFalse(loginStatus);
			
		}
		
	@Test
		//Incorrect Mail format
	
		public void inCorrectMail() {
			
		    UserDetails.addUser("kpraja956@gmail.com", "kpraja12");
			boolean loginStatus=UserDetails.loginValidation("kpraja@956.gmail.com", "kpraja");
			assertFalse(loginStatus);
			
		}
	
	@Test
	//Valid Mail with wrong password
	
		public void inValidPassword() {
			
	        UserDetails.addUser("kpraja956@gmail.com", "kpraja12");
			boolean loginStatus=UserDetails.loginValidation("kpraja956@gmail.com", "kpr");
			assertFalse(loginStatus);
			
		}
	
	
	
}
