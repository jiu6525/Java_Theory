package test010.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diamond {

	public Diamond() {}
	static void Up(int max,char a) {
		for(int i=1; i<=max; i+=2) {
//			공백출력	(max-i)/2
			for(int s=1; s<=(max-i)/2;s++) {
				System.out.print(" ");
			}
//			문자출력
			for(int j=1; j<=i;j++) {
				System.out.print(a);
				a+=1;
				if(a == 'Z'+1) {
					a='A';
				}
			}
			
			System.out.println();
		}
		Down(max,a);
	}
	static void Down(int max,char a) {
		int max1 = (max%2==0)?max-3:max-2;
		
		for(int i=max1; i>=1; i-=2) {
//			공백출력	(max-i)/2
			for(int s=1; s<=(max-i)/2;s++) {
				System.out.print(" ");
			}
//			문자출력
			for(int j=1; j<=i;j++) {
				System.out.print(a);
				a+=1;
				if(a == 'Z'+1) {
					a='A';
				}
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("임의의 수를 입력하세요 : ");
		int n = Integer.parseInt(br.readLine());
		char a = 'A';
		
		Up(n,a);
		
		
	}
}
