import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// switch문 : 범위가 없는 조건문
		// 임의의 정수 입력받아 1->빨강, 2->노랑, 3->파랑, 4->초록, 나머지->검정
		
		System.out.print("정수=");
		int inData = scan.nextInt();
		//int보다 작거나 같은 데이터형의 변수(byte, short, int, char), String
		//     상수,변수,수식
		switch(inData) {
			case 1:	
				System.out.println("빨강");				
				break;
			case 2:
				System.out.println("노랑");
				break;
			case 3: // break를 만날때까지 실행문을 실행한다.
				System.out.println("파랑");
				//break;
			case 4:
				System.out.println("초록");
				break;
			default:
				System.out.println("검정");
		}		
	}
}
