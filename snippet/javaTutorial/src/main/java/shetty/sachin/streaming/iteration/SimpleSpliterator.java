package shetty.sachin.streaming.iteration;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SimpleSpliterator {

	public void getSimplIterator() {

		List<String> myList= new ArrayList<>();
		myList.add("alpha");
		myList.add("beta");
		myList.add("gamma");
		myList.add("delta");
		myList.add("phi");
		
		Stream<String> myStream= myList.stream();
		
		Spliterator<String> myIterator= myStream.spliterator();
		
		while(myIterator.tryAdvance((n) -> System.out.println(n)));
		
		
	}

}
