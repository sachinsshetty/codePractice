/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shetty.sachin.hackerrank.contest.weeokofcode.week30;

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
public class CandyReplinishRobotTest {
    
    public CandyReplinishRobotTest() {
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
     * Test of replinish method, of class CandyReplinishRobot.
     */
    @Ignore
    @Test
    public void testReplinish() {
        System.out.println("replinish");
        
	int n = 20;
        int t = 100;
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = c_i;
        }
        
        CandyReplinishRobot instance = new CandyReplinishRobot();
        instance.replinish(c,n,t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
