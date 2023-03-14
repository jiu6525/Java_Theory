package test010.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * [문제]
 * 3개의 정수를 입력받아 중간값을 출력하라.
 * 
 * [실행결과]
 * 54
 * 75
 * 34
 * 54
 * 
 */
public class MiddelNumber {

	public MiddelNumber() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[3];
		System.out.println("숫자3개를 입력해주세요 : ");
		for(int i=0; i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		System.out.print("중간값은 " +arr[arr.length/2] +" 입니다.");
		
	}
	
//	강사님 풀이
	static int middleCheck(int a, int b, int c) {
//		b가 중간값일때
		if(a<b && b<c || c<b && b<a) {//b가 중간값일때
			return b;
		}else if(b<a && a<c || c<a && a<b){//a가 중간값일때
			return a;
		}else if(a<c && c<b || b<c && c<a){//c가 중간값일때
			return c;
		}else {
			return -1;
		}
	}

	public static void main(String[] args) throws Exception {
		new MiddelNumber();
		
//		강사님 풀이
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.nextLine());
		int b = Integer.parseInt(scan.nextLine());
		int c = Integer.parseInt(scan.nextLine());
		
		int middle = middleCheck(a,b,c);
		System.out.println(middle);
	}

}
