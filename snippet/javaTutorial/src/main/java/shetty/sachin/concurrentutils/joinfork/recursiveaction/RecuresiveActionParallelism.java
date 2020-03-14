package shetty.sachin.concurrentutils.joinfork.recursiveaction;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class RecuresiveActionParallelism {

    public void recursiveAction(int pLevel, int threshold, int size) {
	ForkJoinPool fjp= new ForkJoinPool(pLevel);
	long startT ;
        startT= System.nanoTime();
		
	double[]nums = new double[size];
	for(int i=0;i<nums.length;i++)
            nums[i] =(double)i;
		
	Transform task = new Transform(nums, 0, nums.length, threshold);
		
	fjp.invoke(task);
		
	System.out.println("TotalTime Taken(ns): FJ :"  + (System.nanoTime()-startT) + " level" + pLevel + " threshold :" + threshold + " size:" + size );
    }

	
}

class Transform extends RecursiveAction
{
	int seqThreshold;
	double []data;
	int start;
        int end;
	
	Transform(double[]vals, int s, int e, int t)
	{
		data= vals;
		start =s;
		end = e;
		seqThreshold =t;
	}

	@Override
	protected void compute() {
		if((end-start) < seqThreshold)
		{
			for(int i=start;i<end;i++)
			{
				if(data[i]%2 ==0)
					data[i]=Math.sqrt(data[i]);
				else
					data[i]= Math.cbrt(data[i]);
			}
		}
		else
		{
			int middle =(start + end) / 2;
			
			invokeAll(new Transform(data, start, middle,seqThreshold), new Transform(data, middle, end, seqThreshold));
		}
	}
	
	
}
