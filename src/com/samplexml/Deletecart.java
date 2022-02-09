package com.samplexml;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Deletecart {
	
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
     public void delete()
     {
    	 
    	 System.out.println("Item delete sucessfully");
    	 
     }
     @Test(priority=2)
     public void update()
     {
    	
    	 System.out.println("Item updated sucessfully");
    	
     }
}
