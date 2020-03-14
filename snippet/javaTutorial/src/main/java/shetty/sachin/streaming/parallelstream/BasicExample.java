package shetty.sachin.streaming.parallelstream;

import java.util.List;

public class BasicExample {

	public void execute(List<Integer> myList) {
	
		double product =1;
		
		for(Integer ival:myList)
		{
			product *=Math.sqrt(ival);
		}
		
		System.out.println("Product: " + product);

	}

}
