package refactor_book.chapterone;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	public Rental(Movie _movie, int _daysRented) {
		super();
		this._movie = _movie;
		this._daysRented = _daysRented;
	}
	public Movie get_movie() {
		return _movie;
	}
	public void set_movie(Movie _movie) {
		this._movie = _movie;
	}
	public int get_daysRented() {
		return _daysRented;
	}
	public void set_daysRented(int _daysRented) {
		this._daysRented = _daysRented;
	}
	
	int getFrequentRenterPoints(){
		// add bonus for a two day new release
		if (get_movie().get_priceCode() == Movie.NEW_RELEASE && get_daysRented() > 1)
			return 2;
		else
			return 1;
	}
	double getCharge()
	{
		double result = 0;
		// determine amount for each line
		switch (get_movie().get_priceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (get_daysRented() > 2)
				result += (get_daysRented() - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += get_daysRented() * 3;
			break;
		case Movie.CHILDREN:
			result += 1.5;
			if (get_daysRented() > 3)
				result += (get_daysRented() - 3) * 1.5;
			break;
		}
		return result;
	}

}
