package week1.day2;
 
import java.util.Arrays;

public class MissingElement {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,7,6,8};
	int missing=0;
	int len=arr.length;
	Arrays.sort(arr);
	for (int i = 1; i < arr[len-1]; i++) {
		if (arr[missing]==i) {
			missing++;
		} 
		else
		{
System.out.println("Missing element is "+i);
break;
		}
	}
		
		}
	
		}
	


