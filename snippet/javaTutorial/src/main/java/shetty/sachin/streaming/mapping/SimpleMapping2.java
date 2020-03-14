package shetty.sachin.streaming.mapping;

import java.util.List;
import java.util.stream.Stream;

public class SimpleMapping2 {

	public void execute(List<NamePhoneEmail> myList)
	{
		
		myList.stream().forEach( a ->{
			System.out.println(a.name + " : " + a.email + " : " + a.phoneNum);
		});
		
		
		Stream<NamePhone> namePhone = myList.stream().map((a) -> new NamePhone(a.name, a.phoneNum));
		namePhone.forEach( a ->{
			System.out.println(a.name + " : " + a.phoneNum);
		});
		
		
		System.out.println("Filter");
		//filter
		Stream<NamePhone> namePhoneFilter = myList.stream().filter((a) -> a.name.equals("Shetty"))
				.map((a) -> new NamePhone(a.name, a.phoneNum));
		namePhoneFilter.forEach( a ->{
			System.out.println(a.name + " : " + a.phoneNum);
		});
		
		
		
	}
	
}

