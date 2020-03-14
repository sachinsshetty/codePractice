package shetty.sachin.concurrentutils.joinfork.recursivetask;

public class SingleThread {

	public double execute(int size) {
		long startT;
		startT= System.nanoTime();
		
		
		double[]nums = new double[size];
		for(int i=0;i<nums.length;i++)
			nums[i] =(double)(((i%2)==0)?i:-i);
		
		caluclateSum(nums);
		
		
		return  System.nanoTime()-startT;
	}


        private static double caluclateSum(double[] nums) {
		double sum=0;
		
		for(int i=0;i<nums.length;i++)
		{
			sum +=nums[i];
		}
		
		return sum;
	}

}
