package week5.day2;

import org.testng.annotations.Test;

public class Methods {
	@Test
	public void amazon() {
		System.out.println("Amazon application opened successfully");
	}
	@Test
	public void flipkart() {
		System.out.println("Flipkart application opened successfully");
	}
	@Test
	public void nykaa() {
		System.out.println("Nykaa application opened successfully");
		throw new RuntimeException();
	}
	@Test(timeOut = 2000)
	public void mynthra() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Mynthra application opened successfully");
	}
	@Test(dependsOnMethods = {"amazon","nykaa"},alwaysRun = true)
	public void Walmart() {
		System.out.println("Walmart application opened successfully");
	}
}
