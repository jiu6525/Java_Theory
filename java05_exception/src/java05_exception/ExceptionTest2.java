package java05_exception;

import java.util.Scanner;

public class ExceptionTest2 {
	Scanner scan = new Scanner(System.in);
	public ExceptionTest2() {}

	public void start() {
		try {	//try영역 : 예외가 발생가능한 코드, 또는 예외발생가능성이 없는 코드를 함께 기술할수 있다.
			System.out.print("첫번째수=");
			int num1 = scan.nextInt();	// 5 <---------
			
			System.out.print("두번째수=");
			int num2 = scan.nextInt();	// 10 <--------
		
			int hap = num1 + num2;
			int cha = num1 - num2;
			int nul = num1 * num2;
			int div = num1 / num2;	// <----------
			
//					   5 + 10 = 15
//					   printf(String format, Object... args)
			System.out.printf("%-5d + %-5d = %6.5f\n",num1,num2,(double)hap);
			System.out.printf("%d - %d = %d\n", num1,num2,cha);
			System.out.printf("%d * %d = %d\n", num1,num2,nul);
			System.out.printf("%d / %d = %d\n", num1,num2,div);
			int data[] = {10,20,30};
			System.out.println("배열 ->" + data[data.length]);	//ArrayIndexOutOfBounds
			
			
		}catch(ArrayIndexOutOfBoundsException ae){	
			System.out.println("배열의 index가 잘못처리 되었습니다.");
			
		}catch(Exception ae){	//모든 예외클래스는 Exception 클래스를 상속받는다.
								//하위클래스는 상위클래스에 대입가능하다.
			System.out.println("입력값은 정수를 입력하고 두번째 값은 0을 제외해야 합니다.");
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		ExceptionTest2 a = new ExceptionTest2();
		a.start();
	}

}
