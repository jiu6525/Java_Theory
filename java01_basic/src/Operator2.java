import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 삼항 연산자
		// 임의의 정수를 입력받아 홀수, 짝수를 구별하여 출력하라.
				
		//1. 데이터
		System.out.print("정수입력=");
		int dataInt = scan.nextInt();
		//2. 처리
		//  (조건식) ? 상수 or 수식 : 상수 or 수식;
		//    짝수:홀수     홀수:짝수
		//  임의의수를 2로 나눈 (%)나머지  0:짝수, 1:홀수
		//           / 연산자로 구할 수 있다.
		String result  = ( dataInt%2==0 )? "짝수"  : "홀수" ;
		
		// 정수,실수 = 실수
		// 정수,정수 = 정수
		// 실수,실수 = 실수
		
		//6 ->                 3       ==       3.0
		//7 ->                 3	            3.5
		String result3 = ( dataInt/2 == dataInt/2.0     ) ? "짝수" : "홀수";
		System.out.println("result3 -> "+ result3);
		//3. 출력		
		System.out.println(dataInt +"는 "+result+"입니다.");
		
		/*
		 	임의의 정수를 입력받아 양수, 음수, 0인지 구별하여 출력하라.		 		
		*/
		//                                     0, 음수
		String result2 = (dataInt>0)? "양수" : (dataInt<0)? "음수" : "0"  ;
		System.out.println(dataInt+"는 "+ result2+"입니다.");
	}
}
/*
실행결과
정수입력=5
5는 홀수입니다.
5는 양수입니다.
 
정수입력=-12
-12는 짝수입니다.
-12는 음수입니다.

정수입력=0
0는 짝수입니다.
0는 0입니다.		 
*/