package shetty.sachin.hackerrank.projecteuler;

public class MultipleOf3And5 {

	public void getMultiples(int n, int t) {
	
        long product=0;
        for(int a0 = 0; a0 < t; a0++){
            //int n = in.nextInt();
            for(int i=1;i<n;i++)
                {
                if(i%3 ==0 || i%5 ==0)
                    product +=i;
            }
            System.out.println(product);
            product=0;
        }
	}

}
