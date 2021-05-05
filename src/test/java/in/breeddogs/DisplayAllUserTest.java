package in.breeddogs;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class DisplayAllUserTest {

	/**
	 * To add with valid mail and password and Display
	 */
	@Test
	public void ValidUserEmailAndPassword() {
		
		String email="kpraja956@gmail.com";
		String Password="kpraja123";
		UserDetails.addUser(email, Password);
		UserDetails.displayAllUsers();
	}
	
	/**
	 * To add with invalid mail and password and display
	 */
	@Test
	public void InvalidUserEmailAndValidPassword() {
		
		String email="@kpraja.gmail.com";
		String Password="kpraja123";
		UserDetails.addUser(email, Password);
		UserDetails.displayAllUsers();
	}
	
	/**
	 * To add with invalid mail and password and display
	 */
	@Test
	public void ValidUserEmailAndInValidPassword() {
		
		String email="kpraja956@gmail.com";
		String Password="kpr";
		UserDetails.addUser(email, Password);
		UserDetails.displayAllUsers();
	}
}
