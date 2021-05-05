package in.breeddogs;

import static org.junit.Assert.*;

import org.junit.Test;

import in.breeddogs.AvailableDogs;
import in.breeddogs.DogDetails;

public class TestBreedDetails {

//	private static final Object Labrador = null;

	@Test
	public void testBreedDetails() {

		DogDetails details0 = new DogDetails();
		details0.dogno=0;
		details0.dogname = "Labrador";
		details0.age = "29days";
		details0.gender = "male";
		details0.color = "black";
		details0.place = "Madurai";
		details0.price = 14000;
		details0.insurance = "yes";

		DogDetails details1 = new DogDetails();
		details1.dogno=1;

		details1.dogname = "bulldog";
		details1.age = "29days";
		details1.gender = "male";
		details1.color = "white";
		details1.place = "chennai";
		details1.price = 24000;
		details1.insurance = "no";

		DogDetails details2 = new DogDetails();
		details2.dogno=2;

		details2.dogname = "GreatDane";
		details2.age = "39days";
		details2.gender = "female";
		details2.color = "fawn";
		details2.place = "sivakasi";
		details2.price = 17000;
		details2.insurance = "yes";

		DogDetails details3 = new DogDetails();
		details3.dogno=3;

		details3.dogname = "Labrador";
		details3.age = "29days";
		details3.gender = "male";
		details3.color = "white";
		details3.place = "Madurai";
		details3.price = 12000;
		details3.insurance = "no";

		DogDetails details4 = new DogDetails();
		details4.dogno=4;

		details4.dogname = "Labrador";
		details4.age = "30days";
		details4.gender = "male";
		details4.color = "black";
		details4.place = "chennai";
		details4.price = 10000;
		details4.insurance = "yes";

		DogDetails details5 = new DogDetails();
		details5.dogno=5;

		details5.dogname = "GreatDane";
		details5.age = "29days";
		details5.gender = "male";
		details5.color = "black";
		details5.place = "Madurai";
		details5.price = 15000;
		details5.insurance = "yes";

		AvailableDogs.addlist(details0);
		AvailableDogs.addlist(details1);
		AvailableDogs.addlist(details2);
		AvailableDogs.addlist(details3);
		AvailableDogs.addlist(details4);
		AvailableDogs.addlist(details5);
		
		
		
		
		
		AvailableDogs.display();
		AvailableDogs.buyDogs(5);
		AvailableDogs.display();
		

		
		
		
		
		
		
		
		
//
//		String searchDogName = "GreatDane";
//		DogDetails searchDetails = null;
//		int i = 0;
//		for (DogDetails u : AvailableDogs.dogList) {
//			if (u.dogname.equals(searchDogName)) {
//				searchDetails = u;
//				
//
//			}
//			i++;
//		}
//
//		System.out.println(searchDetails.dogname + ",i=" + i);
//		DogDetails checkdetails = AvailableDogs.dogList.get(0);
//
//		assertEquals("Labrador", checkdetails.dogname);
////	        assertEquals("29days",AvailableDogs.age.get(0));
	}

	@Test
	public void testFilterDetails() {
		
		
		
		DogDetails details0 = new DogDetails();
		details0.dogno=0;

		details0.dogname = "Labrador";
		details0.age = "29days";
		details0.gender = "male";
		details0.color = "black";
		details0.place = "Madurai";
		details0.price = 14000;
		details0.insurance = "yes";

		DogDetails details1 = new DogDetails();
		details1.dogno=1;
	
		details1.dogname = "bulldog";
		details1.age = "29days";
		details1.gender = "male";
		details1.color = "white";
		details1.place = "chennai";
		details1.price = 24000;
		details1.insurance = "no";

		DogDetails details2 = new DogDetails();
		details2.dogno=2;

		details2.dogname = "GreatDane";
		details2.age = "39days";
		details2.gender = "female";
		details2.color = "fawn";
		details2.place = "sivakasi";
		details2.price = 17000;
		details2.insurance = "yes";

		DogDetails details3 = new DogDetails();
		details3.dogno=3;

		details3.dogname = "Labrador";
		details3.age = "29days";
		details3.gender = "male";
		details3.color = "white";
		details3.place = "Madurai";
		details3.price = 12000;
		details3.insurance = "no";

		DogDetails details4 = new DogDetails();
		details4.dogno=4;

		details4.dogname = "Labrador";
		details4.age = "30days";
		details4.gender = "male";
		details4.color = "black";
		details4.place = "chennai";
		details4.price = 10000;
		details4.insurance = "yes";

		DogDetails details5 = new DogDetails();
		details5.dogno=5;

		details5.dogname = "GreatDane";
		details5.age = "29days";
		details5.gender = "male";
		details5.color = "black";
		details5.place = "Madurai";
		details5.price = 15000;
		details5.insurance = "yes";

		AvailableDogs.addlist(details0);
		AvailableDogs.addlist(details1);
		AvailableDogs.addlist(details2);
		AvailableDogs.addlist(details3);
		AvailableDogs.addlist(details4);
		AvailableDogs.addlist(details5);
		
		
		AvailableDogs.filterDetailsByCategory("male","Chennai");
		
	
	}

	@Test
	public void testfilter() {
		
		DogDetails details0 = new DogDetails();
		
		details0.dogno=0;

		details0.dogname = "Labrador";
		details0.age = "29days";
		details0.gender = "male";
		details0.color = "black";
		details0.place = "Madurai";
		details0.price = 14000;
		details0.insurance = "yes";

		DogDetails details1 = new DogDetails();
		
		details1.dogno=1;

		details1.dogname = "bulldog";
		details1.age = "29days";
		details1.gender = "male";
		details1.color = "white";
		details1.place = "chennai";
		details1.price = 24000;
		details1.insurance = "no";

		DogDetails details2 = new DogDetails();
		details2.dogno=2;

		details2.dogname = "GreatDane";
		details2.age = "39days";
		details2.gender = "female";
		details2.color = "fawn";
		details2.place = "sivakasi";
		details2.price = 17000;
		details2.insurance = "yes";

		DogDetails details3 = new DogDetails();
		details3.dogno=3;

		details3.dogname = "Labrador";
		details3.age = "29days";
		details3.gender = "male";
		details3.color = "white";
		details3.place = "Madurai";
		details3.price = 12000;
		details3.insurance = "no";

		DogDetails details4 = new DogDetails();
		details4.dogno=4;

		details4.dogname = "Labrador";
		details4.age = "30days";
		details4.gender = "male";
		details4.color = "black";
		details4.place = "chennai";
		details4.price = 10000;
		details4.insurance = "yes";

		DogDetails details5 = new DogDetails();
		
		details5.dogno=5;

		details5.dogname = "GreatDane";
		details5.age = "29days";
		details5.gender = "male";
		details5.color = "black";
		details5.place = "Madurai";
		details5.price = 15000;
		details5.insurance = "yes";

		AvailableDogs.addlist(details0);
		AvailableDogs.addlist(details1);
		AvailableDogs.addlist(details2);
		AvailableDogs.addlist(details3);
		AvailableDogs.addlist(details4);
		AvailableDogs.addlist(details5);

		AvailableDogs.filterAllDetails("Labrador");
		AvailableDogs.display();
		AvailableDogs.buyDogs(1);
		AvailableDogs.display();
		

	}
//	@Test
//	public void display() {
//		AvailableDogs.display();
//		
//	}




@Test
public void testfilter1() {
	
	DogDetails details0 = new DogDetails();
	details0.dogno=0;

	details0.dogname = "Labrador";
	details0.age = "29days";
	details0.gender = "male";
	details0.color = "black";
	details0.place = "Madurai";
	details0.price = 14000;
	details0.insurance = "yes";

	DogDetails details1 = new DogDetails();
	details1.dogno=1;

	details1.dogname = "bulldog";
	details1.age = "29days";
	details1.gender = "male";
	details1.color = "white";
	details1.place = "chennai";
	details1.price = 24000;
	details1.insurance = "no";

	DogDetails details2 = new DogDetails();
	details2.dogno=2;

	details2.dogname = "GreatDane";
	details2.age = "39days";
	details2.gender = "female";
	details2.color = "fawn";
	details2.place = "sivakasi";
	details2.price = 17000;
	details2.insurance = "yes";

	DogDetails details3 = new DogDetails();
	details3.dogno=3;

	details3.dogname = "Labrador";
	details3.age = "29days";
	details3.gender = "male";
	details3.color = "white";
	details3.place = "Madurai";
	details3.price = 12000;
	details3.insurance = "no";

	DogDetails details4 = new DogDetails();
	details4.dogno=4;

	details4.dogname = "Labrador";
	details4.age = "30days";
	details4.gender = "male";
	details4.color = "black";
	details4.place = "chennai";
	details4.price = 10000;
	details4.insurance = "yes";

	DogDetails details5 = new DogDetails();
	details5.dogno=5;

	details5.dogname = "GreatDane";
	details5.age = "29days";
	details5.gender = "male";
	details5.color = "black";
	details5.place = "Madurai";
	details5.price = 15000;
	details5.insurance = "yes";

	AvailableDogs.addlist(details0);
	AvailableDogs.addlist(details1);
	AvailableDogs.addlist(details2);
	AvailableDogs.addlist(details3);
	AvailableDogs.addlist(details4);
	AvailableDogs.addlist(details5);

	AvailableDogs.filterAllDetails2("Madurai");
}






@Test
public void testfilter3() {
	
	DogDetails details0 = new DogDetails();
	details0.dogno=0;
	details0.dogname = "Labrador";
	details0.age = "29days";
	details0.gender = "male";
	details0.color = "black";
	details0.place = "Madurai";
	details0.price = 14000;
	details0.insurance = "yes";

	DogDetails details1 = new DogDetails();
	details1.dogno=1;
	details1.dogname = "bulldog";
	details1.age = "29days";
	details1.gender = "male";
	details1.color = "white";
	details1.place = "chennai";
	details1.price = 24000;
	details1.insurance = "no";

	DogDetails details2 = new DogDetails();
	details2.dogno=2;
	details2.dogname = "GreatDane";
	details2.age = "39days";
	details2.gender = "female";
	details2.color = "fawn";
	details2.place = "sivakasi";
	details2.price = 17000;
	details2.insurance = "yes";

	DogDetails details3 = new DogDetails();
	details3.dogno=3;
	details3.dogname = "Labrador";
	details3.age = "29days";
	details3.gender = "male";
	details3.color = "white";
	details3.place = "Madurai";
	details3.price = 12000;
	details3.insurance = "no";

	DogDetails details4 = new DogDetails();
	details4.dogno=4;
	details4.dogname = "Labrador";
	details4.age = "30days";
	details4.gender = "male";
	details4.color = "black";
	details4.place = "chennai";
	details4.price = 10000;
	details4.insurance = "yes";

	DogDetails details5 = new DogDetails();
	details5.dogno=5;
	details5.dogname = "GreatDane";
	details5.age = "29days";
	details5.gender = "male";
	details5.color = "black";
	details5.place = "Madurai";
	details5.price = 15000;
	details5.insurance = "yes";

	AvailableDogs.addlist(details0);
	AvailableDogs.addlist(details1);
	AvailableDogs.addlist(details2);
	AvailableDogs.addlist(details3);
	AvailableDogs.addlist(details4);
	AvailableDogs.addlist(details5);

	AvailableDogs.filterAllDetails3("black");
	
	
	
}




@Test
public void testfilter4() {
	
	DogDetails details0 = new DogDetails();
	details0.dogno=0;
	details0.dogname = "Labrador";
	details0.age = "29days";
	details0.gender = "male";
	details0.color = "black";
	details0.place = "Madurai";
	details0.price = 14000;
	details0.insurance = "yes";

	DogDetails details1 = new DogDetails();
	details1.dogno=1;
	details1.dogname = "bulldog";
	details1.age = "29days";
	details1.gender = "male";
	details1.color = "white";
	details1.place = "chennai";
	details1.price = 24000;
	details1.insurance = "no";

	DogDetails details2 = new DogDetails();
	details2.dogno=2;
	details2.dogname = "GreatDane";
	details2.age = "39days";
	details2.gender = "female";
	details2.color = "fawn";
	details2.place = "sivakasi";
	details2.price = 17000;
	details2.insurance = "yes";

	DogDetails details3 = new DogDetails();
	details3.dogno=3;
	details3.dogname = "Labrador";
	details3.age = "29days";
	details3.gender = "male";
	details3.color = "white";
	details3.place = "Madurai";
	details3.price = 12000;
	details3.insurance = "no";

	DogDetails details4 = new DogDetails();
	details4.dogno=4;
	details4.dogname = "Labrador";
	details4.age = "30days";
	details4.gender = "male";
	details4.color = "black";
	details4.place = "chennai";
	details4.price = 10000;
	details4.insurance = "yes";

	DogDetails details5 = new DogDetails();
	details5.dogno=5;
	details5.dogname = "GreatDane";
	details5.age = "29days";
	details5.gender = "male";
	details5.color = "black";
	details5.place = "Madurai";
	details5.price = 15000;
	details5.insurance = "yes";

	AvailableDogs.addlist(details0);
	AvailableDogs.addlist(details1);
	AvailableDogs.addlist(details2);
	AvailableDogs.addlist(details3);
	AvailableDogs.addlist(details4);
	AvailableDogs.addlist(details5);

	AvailableDogs.filterAllDetails4("yes");
}




@Test
public void testFilterDetails5() {
	
	
	
	DogDetails details0 = new DogDetails();
	details0.dogno=0;
	details0.dogname = "Labrador";
	details0.age = "29days";
	details0.gender = "male";
	details0.color = "black";
	details0.place = "Madurai";
	details0.price = 14000;
	details0.insurance = "yes";

	DogDetails details1 = new DogDetails();
	details1.dogno=1;
	details1.dogname = "bulldog";
	details1.age = "29days";
	details1.gender = "male";
	details1.color = "white";
	details1.place = "chennai";
	details1.price = 24000;
	details1.insurance = "no";

	DogDetails details2 = new DogDetails();
	details2.dogno=2;
	details2.dogname = "GreatDane";
	details2.age = "39days";
	details2.gender = "female";
	details2.color = "fawn";
	details2.place = "sivakasi";
	details2.price = 17000;
	details2.insurance = "yes";

	DogDetails details3 = new DogDetails();
	details3.dogno=3;
	details3.dogname = "Labrador";
	details3.age = "29days";
	details3.gender = "male";
	details3.color = "white";
	details3.place = "Madurai";
	details3.price = 12000;
	details3.insurance = "no";

	DogDetails details4 = new DogDetails();
	details4.dogno=4;
	details4.dogname = "Labrador";
	details4.age = "30days";
	details4.gender = "male";
	details4.color = "black";
	details4.place = "chennai";
	details4.price = 10000;
	details4.insurance = "yes";

	DogDetails details5 = new DogDetails();
	details5.dogno=5;
	details5.dogname = "GreatDane";
	details5.age = "29days";
	details5.gender = "male";
	details5.color = "black";
	details5.place = "Madurai";
	details5.price = 15000;
	details5.insurance = "yes";

	AvailableDogs.addlist(details0);
	AvailableDogs.addlist(details1);
	AvailableDogs.addlist(details2);
	AvailableDogs.addlist(details3);
	AvailableDogs.addlist(details4);
	AvailableDogs.addlist(details5);
	
	AvailableDogs.filterDetailsByCategory1("male","Chennai");
}



@Test
public void testFilterDetails6() {
	
	
	
	DogDetails details0 = new DogDetails();
	details0.dogno=0;
	details0.dogname = "Labrador";
	details0.age = "29days";
	details0.gender = "male";
	details0.color = "black";
	details0.place = "Madurai";
	details0.price = 14000;
	details0.insurance = "yes";

	DogDetails details1 = new DogDetails();
	details1.dogno=1;
	details1.dogname = "bulldog";
	details1.age = "29days";
	details1.gender = "male";
	details1.color = "white";
	details1.place = "chennai";
	details1.price = 24000;
	details1.insurance = "no";

	DogDetails details2 = new DogDetails();
	details2.dogno=2;
	details2.dogname = "GreatDane";
	details2.age = "39days";
	details2.gender = "female";
	details2.color = "fawn";
	details2.place = "sivakasi";
	details2.price = 17000;
	details2.insurance = "yes";

	DogDetails details3 = new DogDetails();
	details3.dogno=3;
	details3.dogname = "Labrador";
	details3.age = "29days";
	details3.gender = "male";
	details3.color = "white";
	details3.place = "Madurai";
	details3.price = 12000;
	details3.insurance = "no";

	DogDetails details4 = new DogDetails();
	details4.dogno=4;
	details4.dogname = "Labrador";
	details4.age = "30days";
	details4.gender = "male";
	details4.color = "black";
	details4.place = "chennai";
	details4.price = 10000;
	details4.insurance = "yes";

	DogDetails details5 = new DogDetails();
	details5.dogno=5;
	details5.dogname = "GreatDane";
	details5.age = "29days";
	details5.gender = "male";
	details5.color = "black";
	details5.place = "Madurai";
	details5.price = 15000;
	details5.insurance = "yes";

	AvailableDogs.addlist(details0);
	AvailableDogs.addlist(details1);
	AvailableDogs.addlist(details2);
	AvailableDogs.addlist(details3);
	AvailableDogs.addlist(details4);
	AvailableDogs.addlist(details5);
AvailableDogs.filterDetailsByCategory2("GreatDane","Chennai");

}
}


//Replace ctrl+f
//shift + alt +R name change
