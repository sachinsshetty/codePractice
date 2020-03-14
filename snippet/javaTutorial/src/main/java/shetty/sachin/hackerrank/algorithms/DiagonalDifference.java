package shetty.sachin.hackerrank.algorithms;

public class DiagonalDifference {

	public void calculateDifference(int n, int [][]a) {
	

		int prmDiaSum=0;
                int secDiaSum=0;
		
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                	if(a_i == a_j)
	                	{
	                		prmDiaSum += a[a_i][a_j]; 
	                	}
	                	if(a_i + a_j == n-1)
	                	{
	                		secDiaSum += a[a_i][a_j];
	                	}
	                
	            }
	        }
	        
	        
	        
	        
	        int differ = prmDiaSum - secDiaSum;
	        differ = (differ>0)? differ:-differ;
	        System.out.println(differ);
	        
	}

}
