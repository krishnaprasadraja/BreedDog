package in.breeddogs;

import java.util.ArrayList;

public class AvailableDogs {


	public static ArrayList<DogDetails> dogList = new ArrayList<DogDetails>();

//public static ArrayList<String> age = new ArrayList<String>();
//public static ArrayList<String> gender = new ArrayList<String>();

	/**
	 * this method is used to add the product in the ArrayList
	 * 
	 * @param DogDetails
	 */

//public static void addList1(String age1, String gender1) {
//	age.add(age1);
//	gender.add(gender1);
//}

	public static void addlist(DogDetails details) {
		dogList.add(details);
	}

	public static int display() {
		System.out.println("-------------");
		for (DogDetails allDogs : dogList) {
			System.out.println("all details" + " " + allDogs);
		}
		return 1;
	}

	
	public static boolean buyDogs(int dogno)
	{
		DogDetails index=dogList.get(dogno);
		dogList.remove(index);
		return true;
	}
	
	
	
	
	
	
	
	
	public static void filterDetailsByCategory(String search, String search2) {
		// ArrayList<DogDetails> searchResults = new ArrayList<DogDetails>();
		for (DogDetails DogDetails : dogList) {
			if (DogDetails.gender.equalsIgnoreCase(search)) {
				System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
						"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
				// searchResults.add(DogDetails);
			}
		}
		// return searchResults;

	}

	public static void filterAllDetails(String name  ) {
		for (DogDetails DogDetails : dogList) {
			if (DogDetails.dogname.equalsIgnoreCase(name)) {
				System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
						"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
				// searchResults.add(DogDetails);
			}
		}
	}

		
		
		public static void filterAllDetails2(String name) {
			for (DogDetails DogDetails : dogList) {
				if (DogDetails.place.equalsIgnoreCase(name)) {
					System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
							"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
					// searchResults.add(DogDetails);
				}
			}
	}

		
		
		public static void filterAllDetails3(String name) {
			for (DogDetails DogDetails : dogList) {
				if (DogDetails.color.equalsIgnoreCase(name)) {
					System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
							"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
					// searchResults.add(DogDetails);
				}
			}
	}
		
		
		
		
		
		
		public static void filterAllDetails4(String name) {
			for (DogDetails DogDetails : dogList) {
				if (DogDetails.insurance.equalsIgnoreCase(name)) {
					System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
							"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
					// searchResults.add(DogDetails);
				}
			}
		}

		public static void filterDetailsByCategory1(String search, String search2) {
			// ArrayList<DogDetails> searchResults = new ArrayList<DogDetails>();
			for (DogDetails DogDetails : dogList) {
				if (DogDetails.gender.equalsIgnoreCase(search) && DogDetails.place.equalsIgnoreCase(search2)) {
					System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
							"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
					// searchResults.add(DogDetails);
				}
			}
			
		}
		
		public static void filterDetailsByCategory2(String search, String search2) {
			// ArrayList<DogDetails> searchResults = new ArrayList<DogDetails>();
			for (DogDetails DogDetails : dogList) {
				if (DogDetails.gender.equalsIgnoreCase(search) && DogDetails.place.equalsIgnoreCase(search2)) {
					System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
							"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
					// searchResults.add(DogDetails);
				}
			}
			
		}
		
		
}
