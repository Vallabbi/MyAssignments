package testcase;

import org.testng.annotations.Test;

public class Fibonacci {
	@Test
public  void fibo() {
	int[] series= {0, 1, 1, 2, 3, 5, 8, 13};
	int fibo=0;
	int len=series.length;
	for (int i = 0; i <len; i++) {
	fibo=fibo+series[i];
	}
	System.out.println("Sum of given fibonacci series is " +fibo);
}
}
