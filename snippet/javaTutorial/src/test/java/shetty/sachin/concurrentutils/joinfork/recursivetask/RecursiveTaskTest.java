package shetty.sachin.concurrentutils.joinfork.recursivetask;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import shetty.sachin.concurrentutils.callablefuture.SingleThread;
import shetty.sachin.concurrentutils.joinfork.recursivetask.RecursiveTaskExample;
public class RecursiveTaskTest {

    private static RecursiveTaskExample sfj;
    private static SingleThread sng;
		

    @BeforeClass
    public static void initRecursiveTask()
    {
        sfj= new RecursiveTaskExample();
	sng= new SingleThread();
    }
    
    @Before
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }

    @After
    public void afterEachTest() {
        System.out.println("This is exceuted after each Test");
    }

    @Test
    public void testRecursive() {
	int []comparSize = {100,1000,100000,10000000, 100000000};
		
	for(int i=0;i< comparSize.length;i++)
	{
            System.out.println("ArraySize : " + comparSize[i]);
            System.out.println("TotalTime Taken(ns): FJ :" + sfj.execute(comparSize[i]));
	//		System.out.println("TotalTime Taken(ns): ST :" + sng.execute(comparSize[i]));
            System.out.println("----");
			
	}
    }

}
