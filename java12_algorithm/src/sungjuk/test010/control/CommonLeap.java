package test010.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * [처리조건]
 * 년도를 입력받아 윤년과 평년을 구별하여 출력하라.
 * 첫번째 입력은 입력받을 년도의 갯수
 * api사용하지 말것
 * Scanner, Calendar api 사용하지 말것
 * 
 * [처리결과]
 * 6
 * 4 100 400 2000 2001 2004
 * #1 윤년
 * #2 평년
 * #3 윤년
 * #4 윤년
 * #5 평년
 * #6 윤년
 */


public class CommonLeap {

	public CommonLeap() {
		
		}
	public static void main(String[] args) throws Exception{
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(in.readLine());
//		StringTokenizer st = new StringTokenizer(in.readLine());
//		for(int i=1; i<=n; i++) {
//			int year = Integer.parseInt(st.nextToken());
//			System.out.print("#"+i);
//			if((year%4==0&&year%100!=0)||year%400==0) {
//				System.out.println(" 윤년");
//			}else {
//				System.out.println(" 평년");
//			}
//		}
		startCommonLeaf();
	}
	
	
	
	static void startCommonLeaf() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
//		년도입력
		String[] y = br.readLine().split(" ");
		String[] re = new String[cnt];
//		윤년과 평년
		for(int i=0; i<y.length;i++) {
			int year = Integer.parseInt(y[i]);
			if((year%4==0&&year%100!=0)||year%400==0) {
				re[i]=" 윤년";
			}else {
				re[i]=" 평년";
			}

		}
		print(re);
	}
	static void print(String[] re) {
		for(int i=0; i<re.length;i++) {
			System.out.printf("#%d %s\n",i+1, re[i]);
		}
	}

	}


