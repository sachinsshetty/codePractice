package shetty.sachin.concurrentutils.joinfork.simpleforkjoin;

import shetty.sachin.concurrentutils.joinfork.simpleforkjoin.SimpleForkJoin;
import shetty.sachin.concurrentutils.joinfork.simpleforkjoin.SingleThread;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class SimpleForkJoinTest {

    private static SimpleForkJoin sfj;
    private static SingleThread sng;
	
    @BeforeClass
    public static void initSimpleForkJoin()
    {	    
        sfj= new SimpleForkJoin();
	sng= new SingleThread();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
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
    public void testExample() {
		
        int []comparSize = {100000,10000000, 100000000};
	for(int i=0;i< comparSize.length;i++)
	{
           	System.out.println("ArraySize : " + comparSize[i]);
		System.out.println("TotalTime Taken(ns): FJ :" + sfj.execute(comparSize[i]));
		System.out.println("TotalTime Taken(ns): ST :" + sng.execute(comparSize[i]));
		System.out.println("----");			
	}			
    }

    /**
     * Test of execute method, of class SimpleForkJoin.
     */
    @Ignore
    @Test
    public void testExecute() {
        System.out.println("execute");
        int size = 0;
        SimpleForkJoin instance = new SimpleForkJoin();
        double expResult = 0.0;
        double result = instance.execute(size);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}