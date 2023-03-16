package week3.day2;

public class Palindrome {
public static void main(String[] args) {
	String palindrome="madam";
	String rev="";
	char[] array = palindrome.toCharArray();
	for (int i = array.length-1; i >=0 ; i--) {
		rev+=array[i];
		System.out.println("Reverse string of madam is "+rev);
	}
		boolean case1 = palindrome.equalsIgnoreCase(rev);
	System.out.println("The statement 'madam' is a palindrome is "+case1);
}
}
