package testNGActivities;

import org.testng.annotations.Test;

public class Example1 {
	@Test (groups = { "Car" })
	public void Car1() {
	    System.out.println("Batch Car - Test car 1");
	}

	@Test (groups = { "Car" })
	public void Car2() {
	    System.out.println("Batch Car - Test car 2");
	}
}
