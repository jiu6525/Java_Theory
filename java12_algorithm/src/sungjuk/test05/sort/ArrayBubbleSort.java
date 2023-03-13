package test05.sort;

import java.util.Random;

public class ArrayBubbleSort {

	public static void main(String[] args) {
//		Bubble Sort
//		두 인접한 요소를 검사하여 정렬하는 방법
//		버블정렬의 장점
//			구현이 쉽다.
//			이미 정렬된 데이터를 정렬할 때 빠르다.
		
//		버블정렬의 단점
//			다른정렬에 비해 정렬속도가 느리다.
//			역순배열을 정렬할때 가장 느리다.
		
//		난수를 생성해서 배열에 저장후 버블정렬을 오름차순으로 하기
		Random ran = new Random();
		
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(100)+1;
		}
		
		System.out.println("============정렬전=============");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		
		
//		정렬(버블)
		for(int k=0;k<arr.length-1; k++) {
	//						10->9 9->8
			for(int i=0; i<arr.length-1-k;i++){//기준점	0,1,2,3,4,5,6,7,8
	//			기준점 i와 i+1를 비교 후 교환
				if(arr[i] < arr[i+1]) {//오름차순	 8 9
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}

			System.out.println("*************1번 정렬 후 출력**************");
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j]);
				if(j!=arr.length-1)System.out.print(", ");
			}
			System.out.println();

		}
//			System.out.println("*************1번 정렬 후 출력**************");
//			for(int j=0; j<arr.length; j++) {
//				System.out.print(arr[j]);
//				if(j!=arr.length-1)System.out.print(", ");
//			}
//			System.out.println();
	}
	

}
