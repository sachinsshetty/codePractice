package shetty.sachin.streaming.collecting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollection {

	public void getCollection() {
	
	List<NamePhoneEmail> myList= new ArrayList<>();
		
	myList.add(new NamePhoneEmail("Sachin", "1111", "ss@11"));
	myList.add(new NamePhoneEmail("Shetty", "2222", "ss@22"));
	myList.add(new NamePhoneEmail("Stream", "3333", "ss@33"));
	
	
	Stream<NamePhone> namePhone = myList.stream().map(a -> new NamePhone(a.name, a.phoneNum));

	List<NamePhone> npList =namePhone.collect(Collectors.toList());
	System.out.println("FromList");
	for(NamePhone npe:npList)
	{
		System.out.println(npe.name  + " : " + npe.phoneNum);
	}   
	
	namePhone = myList.stream().map(a -> new NamePhone(a.name, a.phoneNum));

	System.out.println("FromSet");

	Set<NamePhone> nameSet =namePhone.collect(Collectors.toSet());
	for(NamePhone npe:nameSet)
	{
		System.out.println(npe.name  + " : " + npe.phoneNum);
	}
	
	}

}
