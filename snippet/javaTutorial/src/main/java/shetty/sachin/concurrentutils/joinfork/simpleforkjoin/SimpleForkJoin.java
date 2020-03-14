package shetty.sachin.concurrentutils.joinfork.simpleforkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class SimpleForkJoin {

	public double execute(int size) {
		
		ForkJoinPool fjp= new ForkJoinPool();
		long startT;
		startT= System.nanoTime();
		
		
		double[]nums = new double[size];
		for(int i=0;i<nums.length;i++)
			nums[i] =(double)i;
		
		SqrtTransform task = new SqrtTransform(nums, 0, nums.length);
		
		fjp.invoke(task);
		
		return System.nanoTime() -startT;

	}

}

class SqrtTransform extends RecursiveAction{
	int seqThreshold= 1000;
	double[] data;
	int start;
        int end;
	
	SqrtTransform(double[] vals, int s, int e)
	{
		data =vals;
		start =s;
		end =e;
	}
	
        @Override
	protected void compute()
	{
		
		if((end-start) < seqThreshold)
		{
			for(int i=start;i<end;i++)
			{
				data[i]=Math.sqrt(data[i]);
			}
		}
		else
		{
			int middle =(start + end) / 2;
			
			invokeAll(new SqrtTransform(data, start, middle), new SqrtTransform(data, middle, end));
		}
	}
}

