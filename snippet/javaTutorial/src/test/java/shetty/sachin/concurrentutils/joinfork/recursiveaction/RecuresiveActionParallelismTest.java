/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shetty.sachin.concurrentutils.joinfork.recursiveaction;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author sachin
 */
public class RecuresiveActionParallelismTest {
    
    public RecuresiveActionParallelismTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class RecuresiveActionParallelism.
     */
    
    @Test
    public void testRecursiveAction() {
    
        RecuresiveActionParallelism pst= new RecuresiveActionParallelism();
        int pLevel, threshold, size;
		
	pLevel =1;
	threshold =100;
	size = 10000000;
				
		
	pst.recursiveAction(pLevel, threshold, size);
		
		pLevel =2;
		threshold =100;
		size = 10000000;
		
		pst.recursiveAction(pLevel, threshold, size);
		
		pLevel =3;
		threshold =100;
		size = 10000000;
		
		pst.recursiveAction(pLevel, threshold, size);
		
		pLevel =1;
		threshold =50;
		size = 10000000;
				
		
		pst.recursiveAction(pLevel, threshold, size);
		
		pLevel =2;
		threshold =50;
		size = 10000000;
		
                pst.recursiveAction(pLevel, threshold, size);
		
		pLevel =3;
		threshold =50;
		size = 10000000;
		
		pst.recursiveAction(pLevel, threshold, size);
		
    }
 }
