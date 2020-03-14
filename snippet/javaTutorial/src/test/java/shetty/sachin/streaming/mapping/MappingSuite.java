/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shetty.sachin.streaming.mapping;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author sachin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({shetty.sachin.streaming.mapping.NamePhoneTest.class, shetty.sachin.streaming.mapping.BasicExample2Test.class, shetty.sachin.streaming.mapping.BasicExampleTest.class, shetty.sachin.streaming.mapping.SimpleMappingTest.class, shetty.sachin.streaming.mapping.NamePhoneEmailTest.class, shetty.sachin.streaming.mapping.SimpleMapping2Test.class})
public class MappingSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
