package shetty.sachin.concurrentutils.joinfork.simpleforkjoin;

public class SingleThread {

	public double execute(int size) {
		long startT;
		startT= System.nanoTime();
		
		
		double[]nums = new double[size];
		for(int i=0;i<nums.length;i++)
			nums[i] =(double)i;
		
		transform(nums);
		
		return  System.nanoTime()-startT;
	}

	private void transform(double[] nums) {
		
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=Math.sqrt(nums[i]);
		}
		
	}

}
