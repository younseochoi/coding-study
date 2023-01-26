package dynamic_programming;

import java.util.Scanner;

public class 피보나치수1 {

	static int count1=0, count2=0;
	static int[] arr ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		arr = new int[n];
		fib(n);
		fibonacci(n);
		
		System.out.println(count1+" "+count2);
		
	}

	public static int fib(int n) {
		if(n ==1 || n==2) {
			count1++;
			return 1;
		}
		else 
			return (fib(n-1)+fib(n-2)) ;
	}
	
	public static int fibonacci(int n) {
		
		arr[0] = arr[1] =1;
		
		for(int i=2;i<n;i++) {
			count2++;
			arr[i] = arr[i-1]+arr[i-2];
		}
		return arr[n-1];
	}
}
