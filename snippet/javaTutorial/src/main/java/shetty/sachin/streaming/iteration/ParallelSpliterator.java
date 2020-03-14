package shetty.sachin.streaming.iteration;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class ParallelSpliterator {

	public void parallelIterator() {

		List<String> myList= new ArrayList<>();
		myList.add("alpha");
		myList.add("beta");
		myList.add("gamma");
		myList.add("delta");
		myList.add("phi");
		
		Stream<String> myStream= myList.stream();
		
		Spliterator<String> myIterator= myStream.spliterator();
		
		Spliterator<String> myIterator2=myIterator.trySplit();
		
		if(myIterator2 !=null)
		{
			System.out.println("Split 2");
			myIterator2.forEachRemaining(n-> System.out.println(n));
		}
		
		System.out.println("Split 1");
		
		myIterator.forEachRemaining(n-> System.out.println(n));
		
		
		
	}

}
