package shetty.sachin.streaming.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleStreamTest {
    private static SimpleStream str;
    private static BasicExample bse;
    
    @BeforeClass
    public static void initSimpleStreamTest()
    {	
        str= new SimpleStream();
	bse= new BasicExample();
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
    public void testStream()
    {
        List<Double> myList;
	int number=100;
	myList = getList(number);
	
        str.execute(myList);
	bse.execute(myList);

	number=500;
	myList = getList(number);
	str.execute(myList);
	bse.execute(myList);

	number=1000;
	myList = getList(number);
	str.execute(myList);
	bse.execute(myList);
    }

    private List<Double> getList(int number) {
        List<Double> myList=  new ArrayList<>();	
	for(int i=0;i<number;i++)
	{
            myList.add(Math.random());
	}
	return myList;		
    }

    /**
     * Test of execute method, of class SimpleStream.
     */
    @Ignore
    @Test
    public void testExecute() {
        System.out.println("execute");
        List<Double> myList = null;
        SimpleStream instance = new SimpleStream();
        long expResult = 0L;
        long result = instance.execute(myList);

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinimunValues method, of class SimpleStream.
     */
    @Ignore
    @Test
    public void testGetMinimunValues() {
        System.out.println("getMinimunValues");
        List<Double> myList = null;
        SimpleStream instance = new SimpleStream();
        Optional<Double> expResult = null;
        Optional<Double> result = instance.getMinimunValues(myList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximumValues method, of class SimpleStream.
     */
    @Ignore
    @Test
    public void testGetMaximumValues() {
        System.out.println("getMaximumValues");
        List<Double> myList = null;
        SimpleStream instance = new SimpleStream();
        Optional<Double> expResult = null;
        Optional<Double> result = instance.getMaximumValues(myList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSortedStream method, of class SimpleStream.
     */
    @Ignore
    @Test
    public void testGetSortedStream() {
        System.out.println("getSortedStream");
        List<Double> myList = null;
        SimpleStream instance = new SimpleStream();
        Stream<Double> expResult = null;
        Stream<Double> result = instance.getSortedStream(myList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOddNumbers method, of class SimpleStream.
     */
    @Ignore
    @Test
    public void testGetOddNumbers() {
        System.out.println("getOddNumbers");
        List<Double> myList = null;
        SimpleStream instance = new SimpleStream();
        Stream<Double> expResult = null;
        Stream<Double> result = instance.getOddNumbers(myList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class SimpleStream.
     */
    
}
