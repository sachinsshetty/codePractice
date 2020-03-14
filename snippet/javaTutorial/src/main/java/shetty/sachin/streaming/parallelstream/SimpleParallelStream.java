package shetty.sachin.streaming.parallelstream;

import java.util.List;
import java.util.stream.Stream;

public class SimpleParallelStream {

	public void execute(List<Integer> myList) {
		
		Stream<Double> sqrtStream= myList.stream().map((a) -> Math.sqrt(a));
		
		double productOfSqrt = sqrtStream.reduce(1.0, (a,b)-> a*b);
		
		System.out.println("Parallel:" + productOfSqrt );
	}
}
