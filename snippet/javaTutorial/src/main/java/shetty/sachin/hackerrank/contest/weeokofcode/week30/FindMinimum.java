package shetty.sachin.hackerrank.contest.weeokofcode.week30;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 
  Input Format

The input contains a single integer  (the number of integers to be compared).

Constraints

Output Format

Print the string on a single line. Each integer in the string should be written as 'int' and the string must accurately show how  functions can be called to find the smallest of  integers.

Sample Input 0

2
Sample Output 0

min(int, int)
  
  
 */
public class FindMinimum {

        private static final Logger logger = Logger.getLogger("FindMinimum");

	public void minimunString(int n) {
		
        String initString = "min(int, int)";
        String temp;
        if(n >1 && n <51 ){
        	
        	for(int i=2;i<n;i++)
        	{
        		temp = "min(int, " + initString + ")";
        		initString = temp;
        		
        	}
        	logger.log(Level.INFO, "initString");
        }else
        {
        	logger.log(Level.INFO, "Wrong Range for Input");
        }
	}

}
