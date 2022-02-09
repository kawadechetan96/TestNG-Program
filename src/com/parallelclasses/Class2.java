package com.parallelclasses;

import org.testng.annotations.Test;

public class Class2 {
	
	long id;
	@Test
	public void testcase7()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case7 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase8()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case8 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase9()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case9 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase10()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case10 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase11()
	{
		 id=Thread.currentThread().getId();
		System.out.println("Test Case11 successfully:-"+"Thread count is:-"+id);
	}
	
	@Test
	public void testcase12()
	{
		id=Thread.currentThread().getId();
		System.out.println("Test Case12 successfully:-"+"Thread count is:-"+id);
	}
}
