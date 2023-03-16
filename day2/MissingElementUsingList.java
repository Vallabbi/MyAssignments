package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {
public static void main(String[] args) {
	List<Integer>missing=new ArrayList<Integer>();
	missing.add(1);
	missing.add(2);
	missing.add(3);
	missing.add(4);
	missing.add(7);
	missing.add(6);
	missing.add(8);
	List<Integer>miss=new ArrayList<Integer>();
	miss.addAll(missing);
	System.out.println("Original List = "+miss);
	Collections.sort(miss);
	System.out.println("Sorted List = "+miss);
	for (int i =1 ; i < miss.size(); i++) {
		if (i!=miss.get(i-1)) {
		System.out.println("Missing element in list = "+i);
		break;
	}	
	}
}
}
