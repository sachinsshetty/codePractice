package shetty.sachin.hackerrank.algorithms;

/*
 Your task is to find their comparison points by comparing  with ,  with , and  with .

If a>b, then Alice is awarded  point.
If b>a, then Bob is awarded  point.
If a==b, then neither person receives a point.
 Constraints

Output Format

Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

Sample Input

5 6 7
3 6 10
Sample Output

1 1

 */
public class CompareTheTriplets {


    public void compareTriplets(int []a, int []b) {
        int alicePoints=0;
        int bobPoints=0;
        for(int i=0;i<3;i++)
        {
        	if(a[i]>b[i])
        		alicePoints++;
        	else if(a[i]<b[i])
        		bobPoints++;
        
        }
        
        System.out.println(alicePoints + " " + bobPoints);
        
    }
}
