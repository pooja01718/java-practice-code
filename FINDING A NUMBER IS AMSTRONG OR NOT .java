package first;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int r;
		int sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
		}
		System.out.println(sum);
		if(sum==m) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("Not an Amstrong");
		}
	}
}
