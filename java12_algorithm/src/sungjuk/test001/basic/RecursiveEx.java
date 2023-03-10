package test001.basic;
/* 두수를 입력받아 거듭제곱을 재귀호출로 작성하라.

[입력]
5의
3승
125

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RecursiveEx {

	static int factorialRecur2(int a,int b) {
		if(b==0) return 1;
		return a * factorialRecur2(a,b-1);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=1;i<11;i++) {
			
//		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.printf("#%d %d\n",i,factorialRecur2(a,b));
		
		}

	}

}
