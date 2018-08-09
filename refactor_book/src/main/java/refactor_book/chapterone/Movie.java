package refactor_book.chapterone;

public class Movie {
	public static final int REGULAR =0;
	public static final int NEW_RELEASE =1;
	public static final int CHILDREN =2;
	
	private String _title;
	private Price _price;
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public int get_priceCode() {
		return _price.getPriceCode();
	}
	
	public void set_priceCode(int args) {
		
		switch(args){
		case REGULAR:
			_price = new RegularPrice();
			break;
		case CHILDREN:
			_price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasesPrice();
			break;
		default :
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}
	public Movie(String _title, int _priceCode) {
		super();
		this._title = _title;
		set_priceCode(_priceCode);
	}
	
	public double getCharge(int daysRented)
	{
		return _price.getCharge(daysRented);
	}

	int getFrequentRenterPoints(int daysRented){
		
		return _price.getFrequentRenterPoints(daysRented);
	}
}
