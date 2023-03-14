package test010.control;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class NumberMarches {

	public NumberMarches() throws IOException {
		Random ran = new Random();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer (br.readLine());
		Scanner scan = new Scanner(System.in);
		boolean start = true;
		int num = ran.nextInt(9)+1;
		int count = 1;
		System.out.println("두자리의 수를 입력하세요 : ");
		int a = Integer.parseInt(scan.nextLine());
		
		
		while(start) {
				count += 1;
				if(a!=num){
					if(a>num) {
						System.out.println("컴퓨터의 수가 더 작습니다.");
						System.out.println("두자리의 수를 입력하세요 : ");
						a = Integer.parseInt(scan.nextLine());
					}else {
						System.out.println("컴퓨터의 수가 더 큽니다.");
						System.out.println("두자리의 수를 입력하세요 : ");
						a = Integer.parseInt(scan.nextLine());
					}
				}
				if(a==num) {
					System.out.printf("축하합니다. %d번만에 맞추셨습니다.\n",count);
					System.out.println("계속하시겠습니까(Y/N)? : ");
					String con = scan.nextLine();
					if(con.equalsIgnoreCase("N")) {
						start = false;
						System.out.println("시스템 종료");
					}else {
						num = ran.nextInt(9)+1;
						count = 0;
						System.out.println("두자리의 수를 입력하세요 : ");
						a = Integer.parseInt(scan.nextLine());
					}
				}
				
		}
		
	}

	private String parseInt(String a) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) throws Exception{
		new NumberMarches();

	}

}

/*
[처리조건]
두자리수의 난수(25)를 생성하여 맞추는 게임을 작성하라.

[처리결과]
숫자입력 = 56
컴퓨터의 수가 더 작습니다.
숫자를 입력 = 24
컴퓨터 수가 더 큽니다.
숫자 입력 = 25
축하합니다. 3번만에 맞추셨습니다.
계속하시겠습니까(Y/N)? y

숫자입력 = 65
컴퓨터의 수가 더 작습니다.
숫자를 입력 = 45
컴퓨터 수가 더 큽니다.
숫자 입력 = 34
축하합니다. 3번만에 맞추셨습니다.
계속하시겠습니까(Y/N)? N
프로그램이 종료되었습니다.

*/