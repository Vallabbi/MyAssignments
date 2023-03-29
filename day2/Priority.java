package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority {
@Test(priority=1)
public void amazon() {
	System.out.println("Amazon application opened successfully");
}
@Test(priority=-1)
public void flipkart() {
	System.out.println("Flipkart application opened successfully");
}
@Test(priority=0)
public void nykaa() {
	System.out.println("Nykaa application opened successfully");
}
@Test
@Ignore
public void mynthra() {
	System.out.println("Mynthra application opened successfully");
}
@Test
public void Walmart() {
	System.out.println("Walmart application opened successfully");
}

}