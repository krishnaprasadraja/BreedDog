package in.breeddogs;
import org.junit.Test;

public class DisplayAllUserTest {

	/**
	 * To add with valid mail and password and Display
	 */
	@Test
	public void ValidUserEmailAndPassword() {
		
		UserDetails.addUser("kpraja956@gmail.com", "kpraja12");
		UserDetails.addUser("madhan123@gmail.com", "madhan12");
		UserDetails.addUser("maha8976@gmail.com", "mahamaha");
		UserDetails.displayAllUsers();
	}
	
}
