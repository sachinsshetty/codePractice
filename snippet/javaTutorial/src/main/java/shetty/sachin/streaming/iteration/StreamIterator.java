package shetty.sachin.streaming.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIterator {

	public void getSimpleIterator() {

		List<String> myList= new ArrayList<>();
		myList.add("alpha");
		myList.add("beta");
		myList.add("gamma");
		myList.add("delta");
		myList.add("phi");
		
		Stream<String> myStream= myList.stream();
		
		Iterator<String> myIterator= myStream.iterator();
		
		while(myIterator.hasNext())
		{
			System.out.println(myIterator.next());
		}
	}

}
