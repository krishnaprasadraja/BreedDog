package in.breeddogs;


import static org.junit.Assert.*;

import org.junit.Test;

public class AddUserTest {
	
	/**
	 * To check valid mail and password
	 */
	@Test
	public void ValidUserEmail() {
		
		String email="kpraja9536@gmail.com";
		String Password="12345678";
		boolean registerStatus=UserDetails.addUser(email, Password);
		assertTrue(registerStatus);
		
	}
	
	/**
	 * To Check invalid mail and valid password
	 */
	@Test
	
	public void InValidUserEmail() {
		
		String email="@kpraja.gmail.com";
		String Password="kpraja123";
		boolean registerStatus=UserDetails.addUser(email, Password);
		assertFalse(registerStatus);
		
	}
	
	/**
	 * To check valid mail and password length less than 8
	 */
	
	@Test
		
		public void InValidPassword() {
			
			String email="kpraja956@gmail.com";
			String Password="kpr";
			boolean registerStatus=UserDetails.addUser(email, Password);
			assertFalse(registerStatus);
			
		}

}