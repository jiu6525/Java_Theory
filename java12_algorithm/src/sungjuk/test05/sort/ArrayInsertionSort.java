package test05.sort;

public class ArrayInsertionSort {
	public static void main(String[] args) {
		/* 삽입정렬
		 	배열의 모든 요소를 앞에서 부터 차례대로 이미 정렬된 부분과 비교하며, 자신의 위치를 찾아 삽입한다.
		 */
//		데이터 : 1~100 사이의 난수 10개
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
		System.out.println("=============정렬전=============");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
//		intsertion sort
		for(int i=1; i<arr.length; i++) {//기준점 1,2,3,4,5,6,7,8,9
			int temp = arr[i];// 비교대상이 되는 기준값을 임시변수 보관한다.
			int j;
			for(j= i-1;j>=0 && temp<arr[j];j--) {//	i->4, j=3,2,1,0		
				arr[j+1] = arr[j];
			}
//			temp보다 j번째값이 작으면
			arr[j+1] = temp;
			
			System.out.println("=============정렬후"+i+"=============");
			for(int k=0; k<arr.length; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			
		}
		
		
		
	}
}
