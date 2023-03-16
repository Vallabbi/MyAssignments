package week3.day2;

import java.util.Arrays;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text="We learn java basics as part of java sessions in java week1";
	String[] split = text.split(" ");
	for (int i = 0; i < split.length; i++) {
		for (int j = i+1; j < split.length; j++) {
		if (split[i].equals(split[j])) {
			split[j]="";
		}
	}

	}
System.out.println("After removing duplicates = "+Arrays.toString(split));


}
}

