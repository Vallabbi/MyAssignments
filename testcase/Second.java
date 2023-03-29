package testcase;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Second {
	@Test
public  void second2() {
	int[] small= {23,45,67,32,89,22};
	int second=small.length;
	Arrays.sort(small);
for (int i = 0; i <second; i++) {
		System.out.println("Ascending order of the series is " + small[i]);
		}
System.out.println("Second smallest number in series is "+small[1]);
}
}