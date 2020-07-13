package com.testpack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;




public class CalcTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Before class ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class ");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before setup class ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After teardown class ");
	}

	@Test(timeout=4000)
	public void test() {
		//fail("Not yet implemented");
		Calculator c=new Calculator();
		int res=c.add(10, 20);
		assertEquals(30, res);
		
	}
	@Test
	public void test3()
	{
		String s[]= {"s","h"};
		String s1[]= {"s","h"};
		assertArrayEquals(s, s1);
	}
	
	@Test(expected = ArithmeticException.class)
	public void test2()
	{
		int i=1/0;
		//assertEquals("Hello", "Hello");
	}
	
	
	

}
