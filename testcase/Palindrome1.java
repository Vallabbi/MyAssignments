package testcase;

import org.testng.annotations.Test;

public class Palindrome1 {
	@Test
	public  void palin() {
		int num=34343;
		int rem=34343;
		int palin=0;
		for(int i=rem;rem!=0;rem/=10) {
		int reverse=rem%10;
		palin=palin*10+reverse;
	}
		System.out.println(palin);
	if (num==palin) {
		System.out.println(num+ " is a Palindrome");
		
	} 
	else {
System.out.println(num+ " is not a palindrome");

	}	
		
	}
}

