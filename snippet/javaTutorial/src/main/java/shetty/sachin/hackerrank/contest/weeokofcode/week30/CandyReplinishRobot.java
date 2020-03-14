package shetty.sachin.hackerrank.contest.weeokofcode.week30;

/*
 
 Alice programs the following algorithm into her robot, Bob, to replenish the candy throughout the party:

If the party is ending (i.e.,t it's time ), do not refill the bowl.
If the bowl contains b(i) candies at the end of minute i and b(i)<5, add n-b(i) candies to the bowl.
Calculate new candies added
 */
public class CandyReplinishRobot {

	public void replinish(int []c, int n, int t) {

        int totalAdded=0;
        int tempAdd=0;
        int rem=0;
        int init=n;
        for(int i=0;i<t-1 && t< 101;i++)
        {
        	System.out.println(init);
        	rem = init - c[i];
        	init =rem;
        	if(rem <5)
        	{
        		tempAdd = n- rem;
        		 
        		init +=tempAdd;
        		totalAdded += tempAdd;
        	}
        	
        }
        System.out.println(totalAdded);
	}

}
