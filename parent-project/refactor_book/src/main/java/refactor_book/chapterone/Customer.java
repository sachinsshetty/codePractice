package refactor_book.chapterone;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name;
	private Vector _rentals = new Vector();

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public Vector get_rentals() {
		return _rentals;
	}

	public void set_rentals(Vector _rentals) {
		this._rentals = _rentals;
	}

	public Customer(String _name, Vector _rentals) {
		super();
		this._name = _name;
		this._rentals = _rentals;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental record for " + get_name() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();
			// determine amount for each line
			switch (each.get_movie().get_priceCode()) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (each.get_daysRented() > 2)
					thisAmount += (each.get_daysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				thisAmount += each.get_daysRented() * 3;
				break;
			case Movie.CHILDREN:
				thisAmount += 1.5;
				if (each.get_daysRented() > 3)
					thisAmount += (each.get_daysRented() - 3) * 1.5;
				break;
			}
			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release
			if (each.get_movie().get_priceCode() == Movie.NEW_RELEASE && each.get_daysRented() > 1)
				frequentRenterPoints++;

			// Show figure for rental
			result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		// Add footer lines

		result += "Amount owed is" + String.valueOf(totalAmount) + "\n";
		return result;
	}

}
