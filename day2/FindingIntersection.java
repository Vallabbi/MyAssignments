package week1.day2;

import java.util.Arrays;

public class FindingIntersection {
public static void main(String[] args) {
	int[] m={3,2,11,4,6,7};
	int[] n={1,2,8,4,9,7};
	int len1=m.length;
	int len2=n.length;
	Arrays.sort(m);
     Arrays.sort(n);
for (int i = 0; i < len1; i++) {
		for (int j = 0; j < len2; j++) {
		if (m[i]==n[j]) {
			System.out.println("Intersection values in two arrays are "+m[i]);	
			} 
		}
	}
}
}
