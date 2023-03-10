package test001.basic;

import java.util.Scanner;

public class Fibonacci {
//		반복문을 이요한 피보나치 수열 구하기
	static void forFibonacci(int n) {
		
//		초기값
//		0 1 1 2 3 5 8 13 21
		int num1 = 0, num2 = 1, sum = 1;
		System.out.print(0+" ");
		for(int i=0; i<n; i++) {//0,1,2,3,4,5,6,7
			System.out.print(sum+" ");
//			전전값, 전값, 합
			sum = num1+num2;
//			0 1 1 2 3 5 8 13 21 34 55 
			num1 = num2;
			num2 = sum;

			
		}
		
		System.out.println();
	}
	
	static int fibo(int n) {
		if(n<=1) {
			return n;
		}else {
			return fibo(n-2) + fibo(n-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
//		배열을 이용한 피보나치 수열 구하기
		forFibonacci(n);
		
		
//		재귀호출을 이용한 피보나치 수열 구하기
		System.out.print(0+" ");
		for(int i=1; i<=n; i++) {
			System.out.print(fibo(i)+" ");// 1->1, 2-> 1, 3->2,.....
		}
	}

}
