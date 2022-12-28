package first;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int r;
		int rev=0;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==m) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}		
	}
}
