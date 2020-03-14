package shetty.sachin.concurrentutils.callablefuture;

import shetty.sachin.concurrentutils.callablefuture.CallableFuture;
import shetty.sachin.concurrentutils.callablefuture.SingleThread;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class CallableFutureTest {

    private static CallableFuture conEx;
    private static SingleThread singEx;
    @BeforeClass
    public static void initCallableFuture()
    {	
        conEx =  new CallableFuture();
	singEx = new SingleThread();
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
    public void testCallableFuture() {
        System.out.println("Total Execution Time(ns) for 100000 (Single): " + singEx.execute(100000));
	System.out.println("Total Execution Time(ns) for 100000 (Thread): " + conEx.execute(100000));
		
	System.out.println("Total Execution Time(ns) for 10000000 (Single): " + singEx.execute(10000000));
	System.out.println("Total Execution Time(ns) for 10000000 (Thread): " + conEx.execute(10000000));
		
	System.out.println("Total Execution Time(ns) for 100000000 (Single): " + singEx.execute(100000000));
	System.out.println("Total Execution Time(ns) for 100000000 (Thread): " + conEx.execute(100000000));

    }

    /**
     * Test of execute method, of class CallableFuture.
     */
    @Ignore
    @Test
    public void testExecute() {
        System.out.println("execute");
        long val = 0L;
        CallableFuture instance = new CallableFuture();
        long expResult = 0L;
        long result = instance.execute(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
