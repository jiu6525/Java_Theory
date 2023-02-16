import java.util.Scanner;

public class Ex07While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			//그수까지 합구하기
			System.out.print("양의정수=");
			int max = scan.nextInt();
			int sum=0;
			for(int i=1; i<=max; i++) {
				sum += i;
			}
			System.out.println("1~"+max+"까지의 합은 "+ sum);
			//계속여부 1:계속, 나머지:정지
			System.out.print("계속하시겠습니까(1:예, 그외:아니오)?");
			int que = scan.nextInt();
			if(que!=1) {
				System.out.println("프로그램이 종료되었습니다.");
				break;//반복문 중지
				
			}
		}		
	}
}
/*
양의정수=10
1~10까지의 합은 55
계속하시겠습니까(1:yes, 2:no)?1

양의정수=10
1~10까지의 합은 55
계속하시겠습니까(1:yes, 2:no)?1

양의정수=100
1~100까지의 합은 5050
계속하시겠습니까(1:yes, 2:no)?2

프로그램이 종료되었습니다. 
  
  
  
*/
