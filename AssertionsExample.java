package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample 
{
	String name="agni";
	boolean value=true;
	@Test
	public void checkEqual() 
	{
		/*if(name.equals("agni"))
		{
			System.out.println("Name is equal");
		}
		
		else
		{
			System.out.println("Name is not equal");
		}*/
		
		Assert.assertEquals(name, "agni");
		Assert.assertTrue(value, "This should not be true");
	}
	
}
