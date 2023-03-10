package test02.ex.sw;

import java.util.Scanner;

public class Solution2072 {
	
	
//	[문제]
//	2072. 홀수만 더하기
	
//	[입력]
//	3
//	3 17 1 39 8 41 2 32 99 2
//	22 8 5 123 7 2 63 7 3 46
//	6 63 2 3 58 76 21 33 8 1   
	
//	[출력]
//	#1 200
//	#2 208
//	#3 121
	 
	public static void start() {
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		for(int i=1; i<=cnt; i++) {
			int sum = 0;
			for(int j=1; j<=10; j++) {
				int data = s.nextInt();
				if(data%2==1) {
					sum += data;
				}
			}System.out.printf("#%d %d\n",i,sum);
			
		}
	}

	public static void main(String[] args) {
		 start();

	}

}
