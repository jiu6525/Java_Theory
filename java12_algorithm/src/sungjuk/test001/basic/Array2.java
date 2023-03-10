package test001.basic;

import java.util.Scanner;

public class Array2 {
	static int arr[][];
	static int row;
	static int col;
	public Array2() {}

	
	static void setData() {
		arr =new int[row][col];
		int value = 1;
		for(int i=0; i<row; i++) {	//행
			for(int j=0; j<col; j++) {	//열
				arr[i][j] = value++;
			}
		}
	}
	static void searchByRow() {
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}System.out.println();
	}
	
	static void searchByCol() {
		for(int c=0; c<col; c++) {//열 index
			for(int r=0; r<row; r++) {//행 index
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
	}
	static void searchByZigZag() {
		for(int r=0;r<row;r++) {
			if(r%2==0) {
				for(int c=0;c<col;c++){
					System.out.print(arr[r][c]+"\t");
				}
			}else{
				for(int c=col-1;c>=0;c--) {
					System.out.print(arr[r][c]+"\t");
				}
				
			}
			System.out.println();
		
			}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		행의 수
		System.out.println("행 :");
		row = scan.nextInt();
//		열의 열
		System.out.println("열 :");
		col = scan.nextInt();
		
//		초기값
		setData();
		System.out.println("** 행우선 탐색 **");
		searchByRow();
		System.out.println("** 열우선 탐색 **");
		searchByCol();
		System.out.println("** 지그재그 탐색 **");
		searchByZigZag();
	}

}
