package week3.day2;

public class ReverseString {
public static void main(String[] args) {
	String str="Vallabbi";
	char[] charArray = str.toCharArray();
	for (int i = charArray.length-1; i >=0; i--) {
	System.out.println(charArray[i]);	
	}
}

}
