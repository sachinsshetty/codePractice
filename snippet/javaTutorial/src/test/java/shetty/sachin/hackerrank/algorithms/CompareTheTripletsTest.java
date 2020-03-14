/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shetty.sachin.hackerrank.algorithms;

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
public class CompareTheTripletsTest {
    
    public CompareTheTripletsTest() {
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
     * Test of main method, of class CompareTheTriplets.
     */
    @Test
    public void testCompareTriplets() {
        
        int a[]= new int[3];
        int b[]= new int[3];
    
        a[0]=5;
        a[1]=6;
        a[2]=7;
        
        b[0]=3;
        b[1]=6;
        b[2]=10;
        
        CompareTheTriplets cmp= new CompareTheTriplets();
        cmp.compareTriplets(a, b);
        
    }
}
