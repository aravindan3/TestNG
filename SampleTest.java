package testNG;

import org.testng.annotations.Test;

public class SampleTest {

	
	@Test(priority=0)
	public void startCar() 
	{
		System.out.println("The car has started");
		
	}
	@Test(priority=1)
	public void putFirstgear() 
	{
		System.out.println("First gear success");
		
	}
	@Test(priority=2,enabled=false )
	public void turnMusic() 
	{
		System.out.println("Music turned on");
		
	}
}
