package shetty.sachin.streaming.reduction;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleReductionTest {
    		
    private static SimpleReduction str;		
    private static BasicExample bse;

    @BeforeClass
    public static void initSimpleReduction()
    {
        str= new SimpleReduction();
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
    public void testReduction(){
        List<Integer> myList;
	int number=10;
	myList = getList(number);
	str.execute(myList);
	bse.execute(myList);

	number=20;
	myList = getList(number);
	str.execute(myList);
	bse.execute(myList);

    }
	
    private List<Integer> getList(int number) {
        List<Integer> myList=  new ArrayList<>();
		
	for(int i=1;i<number;i++)
	{
            myList.add(i);
	}
		
	return myList;		
    }	

    /**
     * Test of execute method, of class SimpleReduction.
     */
    @Ignore
    @Test
    public void testExecute() {
        System.out.println("execute");
        List<Integer> myList = null;
        SimpleReduction instance = new SimpleReduction();
        instance.execute(myList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}