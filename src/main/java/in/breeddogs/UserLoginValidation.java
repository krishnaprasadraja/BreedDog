package in.breeddogs;

public class UserLoginValidation {
	
	
		/**
		 * Metho to check given mail and password is valid or not for login
		 * @param email
		 * @param passWord
		 * @return
		 */
		
		public static boolean userloginValidation(String email,String passWord) 
		{
			
			//Login 
			
			boolean result=false;
			{
			if (UserDetails.searchDetails(email,passWord)==true) 
			{
				result=true;
				
			}

			return result;
		}
		}

		
	

}
