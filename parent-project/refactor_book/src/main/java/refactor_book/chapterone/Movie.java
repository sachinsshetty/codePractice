package refactor_book.chapterone;

public class Movie {
	public static final int REGULAR =0;
	public static final int NEW_RELEASE =1;
	public static final int CHILDREN =2;
	
	private String _title;
	private int _priceCode;
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public int get_priceCode() {
		return _priceCode;
	}
	public void set_priceCode(int _priceCode) {
		this._priceCode = _priceCode;
	}
	public Movie(String _title, int _priceCode) {
		super();
		this._title = _title;
		this._priceCode = _priceCode;
	}
	
	

}
