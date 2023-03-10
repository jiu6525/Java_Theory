package test02.ex.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main17478 {
	static String sArr [];
	static String underBar ="";// 언더바 처리할 변수
	static void recursive(int num) {
//		_의 수를 임시 변수에 대입 
		String underBarTemp = underBar;
//		num이 0일때 재귀호출 중지
		if(num==0) {
			System.out.println(underBarTemp + sArr[0]);
			System.out.println(underBarTemp + sArr[4]);
			System.out.println(underBar + sArr[5]);
			return;
		}
//		문자열 출력
		for(int i=0; i<4; i++) {// 0,1,2,3
			System.out.println(underBarTemp + sArr[i]);
		}
		
		underBar += "____";
		recursive(num-1);
		
		System.out.println(underBarTemp + sArr[5]);
		
	}
	
	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");


		 sArr = new String[6];
		 sArr[0] = "\"재귀함수가 뭔가요?\"";
		 sArr[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
		 sArr[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
		 sArr[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		 sArr[4] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		 sArr[5] = "라고 답변하였지.";
		 
		 recursive(n);		 
	}

}
