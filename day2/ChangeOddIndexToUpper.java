package week3.day2;

public class ChangeOddIndexToUpper {
public static void main(String[] args) {
	String test="changeme";
	int count;
	char[] charArray = test.toCharArray();
	for (int i = 0; i < charArray.length;i++ ) {
		count=i%2;
		if (count!=0) {
		charArray[i]= Character.toUpperCase(charArray[i]);
		}
		}
	
	String valueOf = String.valueOf(charArray);
	System.out.println("Converted String is "+valueOf);
}
}
