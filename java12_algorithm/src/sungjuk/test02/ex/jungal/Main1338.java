package test02.ex.jungal;

import java.util.Scanner;

public class Main1338 {
	
    public static void main(String[] args) {
	 
    	int k =0;
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	char a = 'A';
    	
		 for(int j=0; j<n; j++) {
			 for(int m=n-1;m>j;m--) {
			 System.out.printf("  ");
			 }
			 for(int i=0; i<= k; i++) {
				 System.out.printf(" %s",a);
				 a++;
					if(a == 'Z'+1) {
						a='A';
					}
			 }
			 k++;

			 System.out.println();
		    }
		 
	 
	 
	 }
}
