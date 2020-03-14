package shetty.sachin.streaming.mapping;

import java.util.ArrayList;
import java.util.List;

public class BasicExample2 {

	public void execute(List<NamePhoneEmail> namePhoneEmail) {
	
		System.out.println("Basic Example");
		for(NamePhoneEmail npe: namePhoneEmail )
		{
			System.out.println(npe.name + " : " + npe.email + " : " + npe.phoneNum);
		}
		
		List<NamePhone> namePhone = new ArrayList<>();
		for(NamePhoneEmail npe: namePhoneEmail )
		{
			namePhone.add(new NamePhone(npe.name, npe.phoneNum));
		
		}
		
		for(NamePhone npe:namePhone)
		{
			System.out.println(npe.name  + " : " + npe.phoneNum);
		}
		
		System.out.println("Filter");
		for(NamePhone npe:namePhone)
		{
			if(npe.name.equals("Shetty"))
			System.out.println(npe.name  + " : " + npe.phoneNum);
		}
		
	}

}
