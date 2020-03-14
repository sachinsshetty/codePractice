package shetty.sachin.streaming.parallelstream;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class SimpleParallelTest {

       @BeforeClass
    public static void initCalculator()
    {	    //    calculator = new Calculator();

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
 
    public void testParallel()
	{
		List<Integer> myList;
		
		
		SimpleParallelStream str= new SimpleParallelStream();
		
		BasicExample bse= new BasicExample();
		
		int number=10;
		myList = getList(number);
		str.execute(myList);
		bse.execute(myList);

		
		number=20;
		myList = getList(number);
		str.execute(myList);
		bse.execute(myList);

}
	
	private static List<Integer> getList(int number) {
		List<Integer> myList=  new ArrayList<>();
		
		for(int i=1;i<number;i++)
		{
			myList.add(i);
		}
		
		return myList;		
	}
	
}
