package test001.basic;

public class Array2Ex02 {

	public Array2Ex02() {}

	public static void main(String[] args) {
		char[][] arr = new char[9][9];
		
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[0].length; c++) {
				if(r==c || r+c==arr.length-1) {
					arr[r][c] = 'X';
				}else {
					arr[r][c] ='O';
				}
				System.out.print(arr[r][c]+" ");
			}System.out.println();
		}

	}

}
