package in.breeddogs;

import org.junit.Test;

public class TestBreedDetails {


	@Test
	public void testBreedDetails() {
		AvailableDogs.display();
		AvailableDogs.buyDogs(1);
		AvailableDogs.display();
	}
		
		
	@Test
	public void testFilterDetails() {
		AvailableDogs.display();
		AvailableDogs.filterDetailsByCategory("male","Chennai");
		AvailableDogs.buyDogs(3);
		AvailableDogs.display();
	}

	@Test
	public void testfilter() {
		AvailableDogs.filterAllDetails("Labrador");
		AvailableDogs.display();
		AvailableDogs.buyDogs(1);
		AvailableDogs.display();
		

	}
	
@Test
public void testfilter1() {
	AvailableDogs.filterAllDetails2("Madurai");
}



@Test
public void testfilter3() {
	
	AvailableDogs.filterAllDetails3("black");	
	
}

@Test
public void testfilter4() {
	
	AvailableDogs.filterAllDetails4("yes");
}

@Test
public void testFilterDetails5() {
	
	AvailableDogs.filterDetailsByCategory1("male","Chennai");
}


@Test
public void testFilterDetails6() {
	
AvailableDogs.filterDetailsByCategory2("GreatDane","Chennai");

}
}
