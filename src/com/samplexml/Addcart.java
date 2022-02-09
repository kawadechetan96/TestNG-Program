package com.samplexml;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Addcart {
	
@BeforeClass	
public void login()
{
	System.out.println("login sucessfully");
}

@AfterClass
public void logout()
{
	System.out.println("logout sucessfully");
	
}
@Test(priority=1)
public void newitemdisplay()
{	
	
	System.out.println("New Item displyed sucessfully");
	}
@Test(priority=2)
public void additem()
{
	
	System.out.println("Item added sucessfully");
	
}

@Test(priority=3)
public void updatenew()
{
	
	System.out.println("New item update sucessfully");
	
}
@Test(priority=4)
public void purches()
{
		System.out.println("New item purches sucessfully");
	
}

}
