package test001.basic;

public class Array2Ex {

	public Array2Ex() {}
	
	public static void start() {
		int arr1[][] = new int[4][4];
		int arr2[][] = new int[4][4];
		int arr3[][] = new int[4][4];
		int num = 0;
		
//		행 우선순회
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++){
				num++;
				arr1[i][j] = num;
				
			}
		}
		num = 0;
		
//		행 우선순회
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++){
				num++;
				arr2[j][i] = num;
			}
		}
		
		num = 1;
//		지그재그 탐색
		for(int i=0;i<arr3.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr3.length;j++){
					arr3[i][j] = num++;
				}
			}else{
				for(int j=arr3.length-1;j>=0;j--) {
					arr3[i][j] = num++;
				}
				
			}
			}
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length;j++) {
				System.out.print(arr3[i][j] + "\t");
				
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		start();

	}

}
