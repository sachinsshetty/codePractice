package shetty.sachin.hackerrank.contest.weeokofcode.week30;

public class MelodiousPassword {

	public void findPassword(int n) {
		
		
		String [] vowels={"a", "e", "i","o" ,"u"};
		String [] consonants={"b", "c", "d","f" ,"g", "h", "j", "k","l","m","n","o","p","q","r","s","t","v","w","x","z"};
        
        if(n>0 && n<7){
          if(n==1)
            {
        	   for(String str:vowels)
        	   {
        		  System.out.println(str);
        	   }
        	   for(String str:consonants)
        	   {
        		  System.out.println(str);
        	   }
        	}else{
              
        	
              for(int k=0;k<consonants.length;k++){
            	  for(int j=0;j<vowels.length;j++){
            		  for(int i=0;i<n;i++){
                    if(i%2==0){
                      System.out.print(vowels[j]);
                    }else{
                      System.out.print(consonants[k]);
                    }
                   
            	  }
            		  System.out.println();
            	 }
                
              }
              for(int k=0;k<vowels.length;k++){
            	  for(int j=0;j<consonants.length;j++){
            		  for(int i=0;i<n;i++){
                    if(i%2==0){
                      System.out.print(vowels[k]);
                    }else{
                      System.out.print(consonants[j]);
                    }
                   
            	  }
            		  System.out.println();
            	 }
                
              }
              
              for(int k=0;k<consonants.length;k++){
            	  for(int j=0;j<vowels.length;j++){
            		  for(int i=0;i<n;i++){
                    if(i%2==0){
                      System.out.print(consonants[k]);
                    }else{
                      System.out.print(vowels[j]);
                    }
                   
            	  }
            		  System.out.println();
            	 }
                
              }
              for(int k=0;k<vowels.length;k++){
            	  for(int j=0;j<consonants.length;j++){
            		  for(int i=0;i<n;i++){
                    if(i%2==0){
                      System.out.print(consonants[j]);
                    }else{
                      System.out.print(vowels[k]);
                    }
                   
            	  }
            		  System.out.println();
            	 }
                
              }
              
         
              
              
          }
        	
        }else{
        	System.out.println("Wrong Input Range");
        }
	}

}
