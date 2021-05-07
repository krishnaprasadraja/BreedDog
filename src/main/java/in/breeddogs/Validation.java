package in.breeddogs;
import java.util.regex.Pattern; 

public class Validation {


/**
		 * This method validate the mail format
		 * @param email
		 * @return
		 */
		
		public static boolean isEmailValid(String email)
		{
			boolean check=false;
			if (email != null) {
				String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,3}$";
				Pattern pat = Pattern.compile(emailRegex);   
		        check= pat.matcher(email).matches();
		        return check;

			}
			else {
				return false; 
			}
	    } 
		
		/**
		 * Method to check whether the given mail id & password in the list
		 * 
		 * @param userEmail
		 * @param password
		 * return
		 */
		
		
		public static boolean searchDetails(String userEmail)
		{
			
			boolean validUserId = false;
			if(UserDetails.userList.containsKey(userEmail)) {
				validUserId = true;
			}

			return validUserId;
		}
		

		/**
		 * Method is used to check given mail and password is valid or not for login
		 * @param email
		 * @param passWord
		 * @return
		 */
		
		public static boolean userloginValidation(String email,String passWord) 
		{
			
			//Login 
			
			boolean result=false;
			{
			if (UserDetails.userList.containsKey(email)) 
			{
				String psw=UserDetails.userList.get(email);
				if(psw.equals(passWord)) {
					result=true;
				}
				
			}

			return result;
		}
		}

		
		
	}

