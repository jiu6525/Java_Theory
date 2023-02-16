import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// if~else문  : 평균이 60점을 기준으로 합격, 불합격으로 나눌때
		
		// 임의의 정수를 입력받아 양수(0포함)이면 입력받은 값에 100을 곱하여 출력하고
		//                   음수이면 양수로 만든 후 200을 곱하여 출력하라.
		
		System.out.print("정수 입력->");
		int intData = scan.nextInt();
		int result;
		
		if(intData >= 0) {// 조건식이 참일 때 - 양수,0
			result = intData * 100;
		}else {// 조건식이 거짓일 때 - 음수
			result = -intData * 200;
		}		

		System.out.println("result ->"+ result);
	}
}
