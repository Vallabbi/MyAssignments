package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesUsingList {
	public static void main(String[] args) {
	List<Integer>duplicate=new ArrayList<Integer>();
duplicate.add(14);
duplicate.add(12);
duplicate.add(13);
duplicate.add(11);
duplicate.add(15);
duplicate.add(14);
duplicate.add(18);
duplicate.add(16);
duplicate.add(17);
duplicate.add(19);
duplicate.add(18);
duplicate.add(17);
duplicate.add(20);
List<Integer>d1=new ArrayList<Integer>();
d1.addAll(duplicate);
System.out.println("Original order = "+d1);
Collections.sort(d1);
System.out.println("Sorted order = " +d1 );
for (int i = 0; i < d1.size(); i++) {
	for (int j = i+1; j < d1.size()-1; j++) {
		if (d1.get(i).equals(d1.get(j))) {
			System.out.println("Duplicate value is "+d1.get(i));
			break;
		}
		
	}
}

}
}
