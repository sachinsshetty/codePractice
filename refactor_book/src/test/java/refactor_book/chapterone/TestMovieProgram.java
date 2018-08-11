package refactor_book.chapterone;

import java.util.Vector;

import org.junit.Test;

import junit.framework.Assert;

public class TestMovieProgram {

	@Test
	public void multiMovieStatementTest() {
		Movie topgun = new Movie("TopGun", Movie.NEW_RELEASE);
		Movie homeAlone = new Movie("HomeAlone", Movie.CHILDREN);
		Movie someMovie = new Movie("SomeMovie", Movie.REGULAR);
		Rental rent1 = new Rental(topgun, 1);
		Rental rent2 = new Rental(homeAlone, 3);
		Rental rent3 = new Rental(someMovie, 4);

		Vector rentals = new Vector<Rental>();
		rentals.add(rent1);
		rentals.add(rent2);
		rentals.add(rent3);

		Customer cm = new Customer("Sachin", rentals);

		StringBuilder expectedString = new StringBuilder();
		expectedString.append("Rental record for Sachin\n");
		expectedString.append("\tTopGun	3.0\n");
		expectedString.append("\tHomeAlone	1.5\n");
		expectedString.append("\tSomeMovie	5.0\n");
		expectedString.append("Amount owed is 9.5\n");
		expectedString.append("You earned 3 frequent renter points");
		Assert.assertEquals(expectedString.toString(), cm.statement());
	}

	@Test
	public void singleMovieStatementTest() {
		Movie topgun = new Movie("TopGun", Movie.NEW_RELEASE);
		Rental rent1 = new Rental(topgun, 1);

		Vector rentals = new Vector<Rental>();
		rentals.add(rent1);

		Customer cm = new Customer("Sachin", rentals);

		StringBuilder expectedString = new StringBuilder();
		expectedString.append("Rental record for Sachin\n");
		expectedString.append("\tTopGun	3.0\n");
		expectedString.append("Amount owed is 3.0\n");
		expectedString.append("You earned 1 frequent renter points");

		Assert.assertEquals(expectedString.toString(), cm.statement());
	}

	@Test
	public void singleMovieHTMLStatementTest() {
		Movie topgun = new Movie("TopGun", Movie.NEW_RELEASE);
		Rental rent1 = new Rental(topgun, 1);

		Vector rentals = new Vector<Rental>();
		rentals.add(rent1);

		Customer cm = new Customer("Sachin", rentals);

		StringBuilder expectedString = new StringBuilder();
		expectedString.append("<H1>Rental record for <EM>Sachin</EM></H1>\n");
		expectedString.append("\tTopGun	3.0\n");
		expectedString.append("<P>You owe <EM>3.0</EM><P>\n");
		expectedString.append("On this rental you earned <EM>1</EM> frequent renter points");

		Assert.assertEquals(expectedString.toString(), cm.HTMLStatement());
	}

}
