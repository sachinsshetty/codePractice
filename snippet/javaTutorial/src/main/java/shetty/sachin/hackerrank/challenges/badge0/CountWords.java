package shetty.sachin.hackerrank.challenges.badge0;

public class CountWords {

	public void countWords(String s) {
	
        int countWords=1;
        
        for(int i=0;i<s.length() -1;i++)
        {
        	int j=i;
        	String str= s.substring(j, j+1);
        	if(str.equals(str.toUpperCase()))
        		countWords++;
        }
        
        System.out.println(countWords);
	}

}
