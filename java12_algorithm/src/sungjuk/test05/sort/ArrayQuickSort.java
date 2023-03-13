package test05.sort;

public class ArrayQuickSort {
	static void swap(int arr[], int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	static void quickSort(int arr[], int left, int right) {
		int pLeft = left;//왼쪽위치	0	1	0
		int pRight = right;//오른쪽끝위치	9	4
		int pivot = (left+right)/2;//피벗		4	2
		System.out.println(pivot);
		int x = arr[pivot];//
		
		do {
//			왼쪽에서 피벗보다 큰값 위치 찾기
			while(arr[pLeft]<x) {
				pLeft++;
			}
//			오른쪽에서 피벗보다 작은값 위치 찾기
			while(arr[pRight]>x) {
				pRight--;
			}

//			pLeft위치의 값과 pRight위치의 값을 교환
//			교환
			if(pLeft <= pRight) {
				swap(arr, pLeft++, pRight--);
//				pLeft++;
//				pRight--;
			}
			
		}while(pLeft <= pRight);
		
//		재귀호출
//		if(left<pRight) {quickSort(arr, left, pRight);}//왼쪽
//		if(pLeft<right) {quickSort(arr, pLeft, right);}//오른쪽
	}
	
	public static void main(String[] args) {
		// 퀵정렬(QuickSort)
		/*
		  리스트에서 가운데 값을 선택하여(pivot) 피벗 위치의 값보다 작은 것은 왼쪽에, 큰것은 오른쪽에 배치하여
		  오름차순 정렬을 구현한다.
		  시간 복잡도 = 평균 : O(nlongn) - 최악 : O(n^2)
		 */
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("=================정렬전=================");
		for(int d : arr) {
			System.out.print(d+"  ");
		}
		System.out.println();
		
//		퀵정렬
//				데이터	왼쪽끝	오른쪽끝
		quickSort(arr,	0,		arr.length-1);
		System.out.println("=================정렬후=================");
		for(int d : arr) {
			System.out.print(d+"  ");
		}
		System.out.println();
				
	}
	
	
	

}
