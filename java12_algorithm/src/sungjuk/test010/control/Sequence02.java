package test010.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 9
 		 *
 		**
 	   ***
 	  ****
 	 *****

 */

public class Sequence02 {

	public Sequence02() throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("몇층 :");
//		int num = Integer.parseInt(br.readLine());
//		for(int i =0; i<num;i++) {
//			for(int j =0; j<num-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=num-1; k<num+i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	
	static void triangle(int max) {
		for(int row=1; row<=max; row++) {
//			공백				8
			for(int s=1; s<=max-row; s++) {
				System.out.print(" ");
			}
//			문자출력
			for(int i=1; i<=row; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception{
//		new Sequence02();
		
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		
		triangle(max);
	}

}
