package shetty.sachin.streaming.reduction;

import java.util.List;
import java.util.Optional;

public class SimpleReduction {

	public void execute(List<Integer> myList) {
		
		Optional<Integer> productObj = myList.stream().reduce((a,b) -> a*b);
		
		if(productObj.isPresent())
		{
			System.out.println("Reduction :ProductObj:"+ productObj.get());
		}
		
		int identityVal =1;
		Integer product1 = myList.stream().reduce(identityVal, (a,b)-> a*b);
		System.out.println("Reduction :Product int :" + identityVal + " :"+ product1 );
		
		
		identityVal =2;
		Integer product2 = myList.stream().reduce(identityVal, (a,b)-> a*b);
		System.out.println("Reduction :Product int :"+ identityVal + " :"+ product2);
		
	}

}
