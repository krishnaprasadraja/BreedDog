package in.breeddogs;

public class AvailableDogs {
	
	public static int display() {
		System.out.println("-------------");
		for (DogDetails allDogs : Dogs.getDogs()) {
			System.out.println("all details" + " " + allDogs);
		}
		return 1;
	}

	
	public static boolean buyDogs(int dogno)
	{
		DogDetails index=Dogs.getDogs().get(dogno);
		Dogs.getDogs().remove(index);
		return true;
	}
	
	
	public static void filterDetailsByCategory(String search, String search2) {
		for (DogDetails DogDetails : Dogs.getDogs()) {
			if (DogDetails.gender.equalsIgnoreCase(search) && DogDetails.place.equalsIgnoreCase(search2)) {
				System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
						"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
			}
		}

	}

	public static void filterAllDetails(String name  ) {
		for (DogDetails DogDetails : Dogs.getDogs()) {
			if (DogDetails.dogname.equalsIgnoreCase(name)) {
				System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
						"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
			}
		}
	}	
		public static void filterAllDetails2(String name) {
			for (DogDetails DogDetails : Dogs.getDogs()) {
				if (DogDetails.place.equalsIgnoreCase(name)) {
					System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
							"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
				}
			}
	}	
		public static void filterAllDetails3(String name) {
			for (DogDetails DogDetails : Dogs.getDogs()) {
				if (DogDetails.color.equalsIgnoreCase(name)) {
					System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
							"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
					
				}
			}
	}
		public static void filterAllDetails4(String name) {
			for (DogDetails DogDetails : Dogs.getDogs()) {
				if (DogDetails.insurance.equalsIgnoreCase(name)) {
					System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
							"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
		
				}
			}
		}

		public static void filterDetailsByCategory1(String search, String search2) {
			for (DogDetails DogDetails : Dogs.getDogs()) {
				if (DogDetails.gender.equalsIgnoreCase(search) && DogDetails.place.equalsIgnoreCase(search2)) {
					System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
							"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);

				}
			}
			
		}
		
		public static void filterDetailsByCategory2(String search, String search2) {
			for (DogDetails DogDetails : Dogs.getDogs()) {
				if (DogDetails.gender.equalsIgnoreCase(search) && DogDetails.place.equalsIgnoreCase(search2)) {
					System.out.println("DogNo:"+" " +DogDetails.dogno+ " " +"Dogname: "+ " "+DogDetails.dogname + " " +"DogAge :"+ DogDetails.age + " " +"Dog Gender:"+" "+ DogDetails.gender + " "+
							"DogInsurance : "  + " " + DogDetails.insurance + " " +"Dog Place: "+ " "+ DogDetails.place + "DogColor:"+"  " +DogDetails.color + " "   +"DogPrice :"+ " " + DogDetails.price);
			
				}
			}
			
		}

		
		
		
}
