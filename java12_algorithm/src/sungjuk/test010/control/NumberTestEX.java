package test010.control;

import java.util.Scanner;

public class NumberTestEX {

	public NumberTestEX() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sign;
		do {
			int compute = (int)(Math.random()*(99-10+1))+10;//난수를 생성 10~99
			int cnt = 1;
			do {
				System.out.print("숫자입력 = ");
				int userin = Integer.parseInt(scan.nextLine());
				
				if(compute > userin) {
					System.out.println("컴퓨터의 수가 더 큽니다.");
				}else if(compute < userin) {
					System.out.println("컴퓨터의 수가 더 작습니다.");
				}else {
					System.out.println("축하합니다." + "번째에 맞추셨습니다.");
					break;
				}
				cnt++;
			}while(true);	//compute 변수의 값을 맞출때까지 반복
			System.out.println("계속하시겠습니까(Y/N)?"); // compute변수의 값을 맞출때까지 반복
			sign = scan.nextLine();
			}while(sign.equalsIgnoreCase("Y"));
	}
}
			
