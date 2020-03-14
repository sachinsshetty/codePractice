package shetty.sachin.streaming.mapping;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class SimpleMapping2Test {

    private static BasicExample2 ex;
    private static SimpleMapping2 smp;

    @BeforeClass
    public static void initSimpleMapping()
    {	   
        smp = new SimpleMapping2();
	ex= new BasicExample2();
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
    public void testMapping(){		
	List<NamePhoneEmail> myList= new ArrayList<>();
		
	myList.add(new NamePhoneEmail("Sachin", "1111", "ss@11"));
	myList.add(new NamePhoneEmail("Shetty", "2222", "ss@22"));
	myList.add(new NamePhoneEmail("Stream", "3333", "ss@33"));
				
	smp.execute(myList);
	ex.execute(myList);
    }	

    /**
     * Test of execute method, of class SimpleMapping2.
     */
    @Ignore
    @Test
    public void testExecute() {
        System.out.println("execute");
        List<NamePhoneEmail> myList = null;
        SimpleMapping2 instance = new SimpleMapping2();
        instance.execute(myList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}