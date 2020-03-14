package shetty.sachin.streaming.simple;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class SimpleStream {

 
    private static final Logger logger = Logger.getLogger("SimpleStream");

    public long execute(List<Double> myList) {
		
        long startTime= System.nanoTime();
        //Minimum value
	Optional<Double> minVal = getMinimunValues(myList); 
	if(minVal.isPresent())
	{
            logger.log(Level.INFO, "Stream : MinVal:" + minVal.get());
        }
		
	//Maximum value
	Optional<Double> maxVal = getMaximumValues(myList);
	if(maxVal.isPresent())
	{
            logger.log(Level.INFO, "Stream : MaxVal:" + maxVal.get());
	}
		
	//Sorting
	Stream<Double> sortedStream = getSortedStream(myList); 
		//sortedStream.forEach( (n)-> System.out.println(n));
			//oddValue
		
	Stream<Double> oddValue = getOddNumbers(myList);
	//	oddValue.forEach( (n)-> System.out.println(n));
			
	return System.nanoTime() - startTime;
	}

    public Optional<Double> getMinimunValues(List<Double> myList) {
        Stream<Double> myStream =  myList.stream();
		
        return myStream.min(Double::compare);
		
     }

    public Optional<Double> getMaximumValues(List<Double> myList) {
        Stream<Double> myStream =  myList.stream();
		
        return myStream.max(Double::compare);
    }

    public Stream<Double> getSortedStream(List<Double> myList) {
        Stream<Double> myStream =  myList.stream();
	return myStream.sorted();
      }

    public Stream<Double> getOddNumbers(List<Double> myList) {
        Stream<Double> myStream =  myList.stream();
                
        return  myStream.filter(n->(n%2)==1);
    }
        

}
