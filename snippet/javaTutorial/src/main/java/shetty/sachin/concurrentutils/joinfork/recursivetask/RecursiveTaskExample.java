package shetty.sachin.concurrentutils.joinfork.recursivetask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecursiveTaskExample {

    private static final Logger logger = Logger.getLogger("Recursive Task Example");

	public double execute(int size) {
		
		ForkJoinPool fjp= new ForkJoinPool();
		long startT;
		startT= System.nanoTime();
		
		
		double[]nums = new double[size];
		for(int i=0;i<nums.length;i++)
			nums[i] =(double)(((i%2)==0)?i:-i);
		
		SumRecTask task = new SumRecTask(nums, 0, nums.length);
		
		double summation = (double) fjp.invoke(task);
                logger.log(Level.INFO,"RecTask: " + summation );
		
		return System.nanoTime() -startT;

	}

}

class SumRecTask extends RecursiveTask<Double>{
	int seqThreshold= 500;
	double[] data;
	int start;
        int end;
	
	SumRecTask(double[] vals, int s, int e)
	{
		data =vals;
		start =s;
		end =e;
	}
	
        @Override
	protected Double compute()
	{
		double sum=0;
		
		if((end-start) < seqThreshold)
		{
			for(int i=start;i<end;i++)
			{
				sum +=data[i];
			}
		}
		else
		{
			int middle =(start + end) / 2;
			
			SumRecTask subTaskA = new SumRecTask(data, start, middle);
			SumRecTask subTaskB = new SumRecTask(data, middle, end);
			
			subTaskA.fork();
			subTaskB.fork();
			
			sum  = (double)subTaskA.join() + (double)subTaskB.join();
		}
		return sum;
	}
}

