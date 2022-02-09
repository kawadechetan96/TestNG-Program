package com.parallelclasses;

import org.testng.annotations.Test;

public class Class3 {

	long id;
	@Test
	public void testcase13()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case13 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase14()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case14 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase15()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case15 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase16()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case16 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase17()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case17 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase18()
	{
		id=Thread.currentThread().getId();
		System.out.println("Test Case18 successfully:-"+"Thread count is:-"+id);
	}
}
