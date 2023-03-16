package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestUsingList {
public static void main(String[] args) {
	List<Integer>second=new ArrayList<Integer>();
	second.add(3);
	second.add(2);
	second.add(11);
	second.add(4);
	second.add(6);
	second.add(7);
	List<Integer>second1=new ArrayList<Integer>();
	second1.addAll(second);
	System.out.println("Original order = "+second1);
	Collections.sort(second1);
	System.out.println("Sorted order = "+second1);
	for (int i = 0; i <second1.size();) {
		System.out.println("Second largest number in the given list = "+second1.get((second1.size()-2)));
		break;
	}
}
}

