package java05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionTest {
	Scanner scan = new Scanner(System.in);
	public MyExceptionTest() {
		
	}
	public void start() {
		try {
//		임의 정수를 입력받아 그 수까지 합을 구하기
		System.out.print("정수=");
		int max = scan.nextInt();
//		1~100 사이의 값이 아니면 예외 발생시키기
		
		if(max>=1 && max<=100) {	//정상 값 입력시
			int tot = sum(max);
			System.out.println("1~"+max+"까지의 합은 "+tot);
		}else {	//값이 잘못들어오면 예외발생시킴
//				throw : 강제로 예외발생시키기
//			throw new MyException();
			throw new MyException("1에서 100사이의 값만 가능해.");
		}
		}catch(InputMismatchException ime) {
			System.out.println("정수를 입력하지 않았습니다.");
		}catch(MyException me) {
			System.out.println(me.getMessage());
		}
	}
	
//	합구하기
	public int sum(int max) {
		int sum = 0;
		for(int i=1; i<=max; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		new MyExceptionTest().start();
	}

}
