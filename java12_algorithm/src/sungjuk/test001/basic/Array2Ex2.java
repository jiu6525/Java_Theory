package test001.basic;

public class Array2Ex2 {

	public Array2Ex2() {}

	public static void start() {
		String arr[][]=new String[5][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = "O";
			}
			for(int j=0;j<arr.length;j++) {
				arr[i][i] = "X";
			}
			for(int k=arr.length-1-i;k>=4-i;k--) {
				arr[i][k] = "X";
			}	
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]);
			}System.out.println();
			}
	}
	public static void main(String[] args) {
		start();

	}

}
