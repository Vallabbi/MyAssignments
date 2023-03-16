package week3.day2;

public class FindCharCount {
public static void main(String[] args) {
	String input="TestLeaf";
	int count=0;
	char letter='e';
	char[] charArray = input.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
			if (letter==charArray[i]) {
				count++;
				}
	}
		System.out.println("Total number of letter 'e' is "+count);
	}
}
