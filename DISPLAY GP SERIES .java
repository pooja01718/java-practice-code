package first;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("program for GP series");
		System.out.println("Enter values of a , r and n");
		int a=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		int term=a;
		for(int i=0;i<n;i++) {
			System.out.print(term+" ");
			term=term*r;
		}
	}
}
