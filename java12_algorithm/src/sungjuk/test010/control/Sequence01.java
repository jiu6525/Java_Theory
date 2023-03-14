package test010.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 [실행결과]
 15
 1 2 4 7 8 11 13 14
 
 3의 배수와 5의 배수를 제외한 15보다 작은 수들의 나열
  
  
  
 */
public class Sequence01 {

	public Sequence01() throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int num = Integer.parseInt(br.readLine());
//		int c = 1;
//		
//		String result =" ";
//		
//		while(c>num) {
//			if(c%3!=0 && c%5!=0) {
//				result += c;
//				c++;
//			}
//			
//		}
//		
//		System.out.println(c);
	}
	
	public static void seqPrint(int max) {
		for(int i=1; i<=max; i++) {//1,2,3,4,5....max
			if(i%3 != 0 && i%5!=0) {
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) throws Exception {
//		new Sequence01();
		
		Scanner s =new Scanner(System.in);
		
		int max = s.nextInt();
		
		seqPrint(max);

	}

}
