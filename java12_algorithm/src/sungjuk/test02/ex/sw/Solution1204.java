package test02.ex.sw;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution1204 {



	public static void main(String[] args) throws Exception {
//		데이터 가져오기
		System.setIn(new FileInputStream("src/test02/ex/sw/1204input.txt"));
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt(); //문제수
		
		for(int i=1; i<=t; i++) {
			int n = s.nextInt();
			int arr[] = new int[101];//점수의 갯수 0~100점까지 이므로 점수를 index 값에 추가 
			for(int j=1;j<=1000;j++) {//1 그룹에 점수 1000개이므로
				arr[s.nextInt()]++;
			}
//			첫번째 index -> 0점
			int maxIdx = 0;
			for(int idx =1; idx<arr.length;idx++) {//1,2,3.......100
				if(arr[maxIdx] <= arr[idx]) {
					maxIdx = idx;
				}
				
			}
			System.out.println("#" + n + " "+maxIdx);
			//system.out.println(Arrays.toString(arr));
		}
		
		
		
		
		
		
		
		}
		
	}


