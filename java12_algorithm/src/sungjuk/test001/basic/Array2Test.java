package test001.basic;

public class Array2Test {

	public Array2Test() {}

	public static void main(String[] args) {
//		2차원 배열 : 행과 열이 있는 표형식으로 데이터를 관리할 수 있다.
		
//		2차원 배열생성
		int arr[][];	//생성전
		int arr2[][] = new int[7][5]; // 배열생성됨 초기화값 정수 0, 실수 0.0, Object=null
		
		Object[][] obj = new Object[2][3]; //null
		
//		1행 0열
		arr2[1][0] = 100;
		arr2[2][1] = 2;
//		1차원배열 : 배열명.length  ->  배열의 크기
//		2차원배열 : 배열명.length  ->  행의 수
//				  배열명[행/index].legth -> 행index의 칸수
		for(int row =0; row<arr2.length; row++) {//행 0,1,2
			for(int col =0;col < arr2[row].length; col++) {//열 0,1
				System.out.print(arr2[row][col] + "\t");
			}
			System.out.println();
		}
//		2차원 배열 초기값
		
		int arr3[][] = new int[][] {{1,2,3},{10,20,30},{100,200,300}};
		String arr4[][] = {{"A","B","C"},{"가","나","다"},{"1","2","3"}};
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length;j++) {
				System.out.print(arr3[i][j] + "\t");
				System.out.print(arr4[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
