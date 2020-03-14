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
public class DiagonalDifferenceTest {
    
    public DiagonalDifferenceTest() {
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
     * Test of main method, of class DiagonalDifference.
     */
    
    @Test
    public void testCalculateDifference() {
      int n = 3;
      int a[][] = new int[n][n];
      a[0][0]=0;
      a[0][0]=1;
      a[0][0]=2;
      a[0][0]=3;
      a[0][0]=4;
      a[0][0]=5;
      a[0][0]=6;
      a[0][0]=7;
      a[0][0]=8;
      DiagonalDifference dfd= new DiagonalDifference();
      dfd.calculateDifference(n, a);
      
      
    }
    
}
