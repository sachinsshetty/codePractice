package shetty.sachin.concurrentutils.callablefuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {

    public long execute(long val)  {
		
        long startTime = System.nanoTime();
        ExecutorService ex= Executors.newFixedThreadPool(3);
        Future<Integer> sum;
        Future<Long> factorial;
	Future<Double> hypotenuse;
	
	sum = ex.submit(new Sum(val));
	factorial = ex.submit(new Factorial(val));
	hypotenuse = ex.submit(new Hypotenuse(val,val));
	
	try{
	        sum.get();
	        factorial.get();
	        hypotenuse.get();
	}catch(ExecutionException | InterruptedException e)	{
	    e.printStackTrace();
	}
	
	ex.shutdown();
	    
	long endTime =  System.nanoTime() ;    
	return endTime - startTime ;
    }
}

class Sum implements Callable<Integer>
{
    long val;
    Sum(long v){ val =v;}
	
    @Override
    public Integer call()
    {
        int sum = 0;
	for(long i=0;i<=val;i++)
	{
            sum +=i;
        }
        return sum;
		
    }
}

class Factorial implements Callable<Long>
{
    long val;
    public Factorial(long v) {
        val=v;
    }
	
    @Override
    public Long call()
    {
        long factorial = 1;
	for(long i=2;i<=val; i++)
	{
            factorial *=i;
	}
        return factorial;
    }
}

class Hypotenuse implements Callable<Double>
{
    long side1;
    long side2;
    public Hypotenuse(long v1,long v2) {
        side1= v1;
	side2= v2;
    }
	
    @Override
    public Double call()
    {	
        return Math.sqrt((side1*side1) + (side2*side2));
    }
}