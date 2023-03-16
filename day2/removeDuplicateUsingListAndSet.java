package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateUsingListAndSet {
public static void main(String[] args) {
	String text="We learn java basics as part of java sessions in java week1";
	String[] split = text.split(" ");
	Set<String>remove=new LinkedHashSet<String>();
	for (int i = 0; i < split.length; i++) {
		remove.add(split[i]);
	}
	System.out.println("After removing duplicate,string text = "+remove);
	}
}
