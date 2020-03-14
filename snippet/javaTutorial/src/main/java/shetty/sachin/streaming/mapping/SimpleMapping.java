package shetty.sachin.streaming.mapping;

import java.util.List;

public class SimpleMapping {

	public void execute(List<Integer> myList) {
		
		double productOfSqrt = myList.stream().reduce(1.0,
				(a,b) -> a * Math.sqrt(b),
				(a,b) -> a*b);
		
		System.out.println("Parallel:" + productOfSqrt );
	}
}
