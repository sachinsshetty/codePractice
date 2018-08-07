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
	

	public String HTMLStatement() {
		
		Enumeration rentals = _rentals.elements();
		String result = "<H1>Rental record for <EM>" + get_name() + "</EM></H1>\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// Show figure for rental
			result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		// Add footer lines

		result += "<P>You owe <EM>" + String.valueOf(getTotalRecharge()) + "</EM><P>\n";
		
		result += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM> frequent renter points";
		return result;
	}


	public String statement() {
	
		Enumeration rentals = _rentals.elements();
		String result = "Rental record for " + get_name() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// Show figure for rental
			result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		// Add footer lines

		result += "Amount owed is " + String.valueOf(getTotalRecharge()) + "\n";
		
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	private double getTotalRecharge() {

		double result = 0;
		Enumeration<Rental> rentals= _rentals.elements();
		while(rentals.hasMoreElements())
		{
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}


	private int getTotalFrequentRenterPoints() {

		int result = 0;
		Enumeration<Rental> rentals= _rentals.elements();
		while(rentals.hasMoreElements())
		{
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	
}
