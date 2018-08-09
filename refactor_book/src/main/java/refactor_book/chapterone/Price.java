package refactor_book.chapterone;

abstract class Price {
	abstract int getPriceCode();
	
	abstract double getCharge(int daysRented);
	
	int getFrequentRenterPoints(int daysRented){
		return 1;
	}
}



class ChildrensPrice extends Price{
	int getPriceCode(){
		return Movie.CHILDREN;
	}

	public double getCharge(int daysRented) {
		double result = 0;
		// determine amount for each line
		result += 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;

	}

}

class NewReleasesPrice extends Price{
	int getPriceCode(){
		return Movie.NEW_RELEASE;
	}
	
	public double getCharge(int daysRented) {
		double result = 0;
		// determine amount for each line
		
		result += daysRented * 3;
		
		return result;

	}
	
	
	int getFrequentRenterPoints(int daysRented){
	// add bonus for a two day new release
	if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1)
		return 2;
	else
		return 1;
	}
}


class RegularPrice extends Price{
	int getPriceCode(){
		return Movie.REGULAR;
	}
	
	public double getCharge(int daysRented) {
		double result = 0;
		// determine amount for each line
		result += 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		
		return result;

	}
}