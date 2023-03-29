package week5.day2;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 4,invocationTimeOut = 4000,threadPoolSize = 3)
public void mergeNumber()	{
	
	System.out.println("Numbers gets successfully merged");

}
}