package shetty.sachin.streaming.reduction;

import java.util.List;

public class BasicExample {

	public void execute(List<Integer> myList) {
	
		Integer product =1;
		
		for(Integer ival:myList)
		{
			product *=ival;
		}
		
		System.out.println("Product: " + product);

		int factor =2;
		
		product = factor * product;
		
		System.out.println("Product: " + product + " Factor:" + factor);

		
	}

}
