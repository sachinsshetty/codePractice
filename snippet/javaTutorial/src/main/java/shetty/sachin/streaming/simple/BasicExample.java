package shetty.sachin.streaming.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BasicExample {

	public void execute (List<Double> myList) {
		
		//Sorting
		Collections.sort(myList);
		
		//Minimum value
		double minVal = myList.get(0);
		
		System.out.println("Bse : MinVal:" + minVal);
		
		
		//Maximum value
		
		double maxVal = myList.get(myList.size()-1);
		System.out.println("Bse : MaxVal:" + maxVal);
		
		
		//Sorting 
		
		 
		//oddValue
		List<Double> oddList= new ArrayList<>();
		for(Double i:myList)
		{
			if(i%2 ==1)
				oddList.add(i);
		}
		
		//oddValue_5
		List<Double> oddList5= new ArrayList<>();
		for(Double i:myList)
		{
			if(i%2 ==1 && i>5)
				oddList5.add(i);
		}
		
	}

}
