package shetty.sachin.concurrentutils.callablefuture;

public class SingleThread {

    public long execute(long val) {
		
        long startTime = System.nanoTime();
	testCode(val);
	long endTime =  System.nanoTime() ;
	return endTime - startTime;

    }

    private void testCode(long val) {  
            getFactorial(val);
            getSum(val);
            getHypotenuse(val,val);
    }

    private double getHypotenuse(long i, long j) {
        return Math.sqrt((i*i) + (j*j));
    }

    private double getSum(long val) {
        long sum = 0;
	for(long i=0;i<=val;i++)
	{
            sum +=i;
	}
	
        return  sum;
    }

    private double getFactorial(long val) {
        long factorial = 1;
	for(long i=2;i<=val; i++)
	{
            factorial *=i;
	}
	
        return factorial;
    }
}