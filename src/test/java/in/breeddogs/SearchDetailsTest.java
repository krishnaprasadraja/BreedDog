package in.breeddogs;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchDetailsTest {

	/*
	 * To add and search a particular mail and password present in the list
	 */
	
	@Test
	
	public void SearchValidMailAndPassword()
	{
		
		String email="kpraja956@gmail.com";
		String password="kpraja12";
		UserDetails.addUser(email, password);
		boolean isContain=Validation.searchDetails(email );
		assertTrue(isContain);
		
	}
	
	/*
	 * To Search a Mail and Password without adding to list
	 */
	
	@Test
		
		public void SearchInValidMailAndPassword()
		{
			
			String email="kpraja@gmail.com";
			boolean isContain=Validation.searchDetails(email );
			assertFalse(isContain);
			
		}

}