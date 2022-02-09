package com.parallelclasses;

import org.testng.annotations.Test;

public class Class1 {
	long id;
	@Test
	public void testcase1()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case1 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase2()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case2 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase3()
	{
		id=Thread.currentThread().getId();
		System.out.println("Test Case3 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase4()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case4 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase5()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case5 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase6()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case6 successfully:-"+"Thread count is:-"+id);
	}
}

