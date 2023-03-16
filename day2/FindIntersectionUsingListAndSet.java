package week3.day2;

import java.util.ArrayList;
import java.util.List;


public class FindIntersectionUsingListAndSet {
public static void main(String[] args) {
	List<Integer>find=new ArrayList<Integer>();
	find.add(3);
	find.add(2);
	find.add(11);
	find.add(4);
	find.add(6);
	find.add(7);
	List<Integer>find1=new ArrayList<Integer>();
	find1.addAll(find);
	System.out.println(find1);
	List<Integer>find2=new ArrayList<Integer>();
	find2.add(1);
	find2.add(2);
	find2.add(8);
	find2.add(4);
	find2.add(9);
	find2.add(7);
	List<Integer>find3=new ArrayList<Integer>();
	find3.addAll(find2);
	System.out.println(find3);
	for (int i = 0; i < find1.size(); i++) {
		for (int j = 0; j < find3.size(); j++) {
		if (find1.get(i).equals(find3.get(j))) {
			System.out.println("Intersection values is "+find1.get(i));
			}
		}	
		}
	}
}

