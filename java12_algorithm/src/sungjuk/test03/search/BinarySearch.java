package test03.search;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

//	이진검색
//	데이터가 오름차순 또는 내림차순으로 정렬되어야 한다.
//	중앙값을 구하여 이진 검색을 한다.
	static int binarySearch(int arr[], int n, int key) {
//		검색범위의 시작 index
		int pl = 0;
		
//		검색범위의 끝 index
		int pr = n-1;
		
		
//		while(true) {
//			int pc = (pl+pr)/2;
//			if (arr[pc]==key) {
//				return pc+1;
//			}else if(key<arr[pc]){
//				pr = pc;
//			}else {
//				pl = pc;
//			}
//		}
		
		do {
			int pc = (pl+pr)/2;//중앙 위칠의 index 구하기 5
			
			if(arr[pc]==key) {//pc의 값과 key가 같을때
				return pc;
			}else if(key>arr[pc]){//pc의 값과 key가 작을때
				pl = pc+1;
			}else {//pc의 값과 key가 클때
				pr = pc -1;
			}
		}while(pl<=pr);
		
//		검색데이터가 없다.
		return -1;

	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("요소수 : ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
//		값생성
		for(int i=0;i<n;i++) {
			arr[i] = ran.nextInt(100)+1;
		}
		
		
//		정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		찾을 값 입력
		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		
		int idx = binarySearch(arr, n, key);
		if(idx == -1) {
			System.out.println("값이 존재하지 않습니다.");
		}else{
		System.out.println("검색할 "+key+" 의 자리는 "+idx+" 입니다.");
		}
	}

}
