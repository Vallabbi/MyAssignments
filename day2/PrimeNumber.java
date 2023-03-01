package week1.day2;

public class PrimeNumber {
public static void main(String[] args) {
	int n=71,m;
boolean prime=true;
m=n/2;
if (n==0||n==1) {
	System.out.println("It is not a prime number range");
}
for (int i = 2; i <=m; i++) {
	if (n%i==0) {
		
		prime=false;
		
	}

}

if (prime==true) {
	System.out.println(n+ " is  a prime number");
} 

if (prime==false) {
	System.out.println(n+ " is  not a prime number");
} 

}
}
