package test03.search;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SequentialSearch {
//	while문을 이용하여 선형검색하기				10 -> 0,1,2,3,4....9
	
	static int linearSearch(int a[], int n, int key) {
//		a배열에서 key의 값을 찾아 index를 리턴하고, 찾는 값이 없으면 -1을 리턴한다.
		int i=0;
		while(true) {
			if(i==n)//데이터의 갯수와 i가 같으면 끝까지 검색했으며 값이 존재하지 않으므로 -1 리턴.
				return -1;
			if(a[i] == key) {// key의 값도 배열의 i번째 index 값과 같으면 index를 리턴
				return i;
			}
			i++;//1
		}
	}
//	for문을 이용한 선형검색하기
	static int linearSearch2(int []a, int n, int key) {
		for(int i=0; i<n; i++) {
			if(a[i] == key) {//	찾는 값이 있을때
				return i;
			}
		}
		return -1;// 찾는 값이 없을때
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
//		데이터 준비
//		요소수 입력
		System.out.println("요소수 : ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		
//		1~20까지의 수를 요소수 만큼 생성하여 배열에 저장한다.
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;// 1~19
		}
		
		System.out.print("검색할 값: ");
		int key = scan.nextInt();
		
		int idx = linearSearch(arr, n, key);
		if(idx==-1) {
			System.out.println("찾는 값이 존재하지 않습니다.");
		}else {
			System.out.println("검색한 값의 인덱스 번호는 " + idx + "이며, 값은 " + arr[idx] +"입니다");
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(linearSearch2(arr, n, key));
	}

}
