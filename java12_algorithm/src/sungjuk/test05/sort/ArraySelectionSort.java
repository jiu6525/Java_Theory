package test05.sort;

public class ArraySelectionSort {

	public static void main(String[] args) {
		/* 선택정렬(SelectionSort)
		 * 주어진 데이터중 제일 작은 값을 찾아 기준위치의 값과 교환하는 정렬방법이다.
		 */
		
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("--------------------정렬전----------------------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//		point = 0		minIndex=0
		for(int point=0; point<arr.length-1;point++) {//기준점 : 0,1,2,3,4,5,6,7,8
			int minIndex = point;//제일작은 값을 가진 index
			
//			기준점 다음위치부터 끝까지 비교한다.
			for(int j=point+1; j<arr.length; j++) {
//				minIndex와 j번째의 값을 비교해서 j번째가 minIndex의 값보다 작으면 j를 minIndex에 대입
				if(arr[minIndex]>arr[j]) {
					minIndex =j;
				}
			}
//			교환 point위치의 값과 minIndex위치의 값을 교환
			int temp = arr[point];
			arr[point] = arr[minIndex];
			arr[minIndex] = temp;
			
			System.out.println("====================정렬 후" + point + "====================");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
	}

}
