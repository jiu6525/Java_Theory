package test010.control;

import java.util.Scanner;

public class DiamondEx {

	public DiamondEx() {}
	
//	정수입력
	static int dataIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int max = scan.nextInt();
		if(max%2==0) {
			max++;
		}
		return max;
	}
	
//	다이아몬드 출력
	static void diamondPrint(int max) {
		int step = 2;
	
		for(int i=1;i>=1;i+=step) {// i= 1,3,5,......max......5,3,1
//			공백
			for(int s=1; s<=(max-i)/2; s++) {
				System.out.print(" ");
			}
			
//			문자
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i==max) step=-2;
	}
		
	}
	public static void main(String[] args) {
		diamondPrint(dataIn());
		
	}

}
