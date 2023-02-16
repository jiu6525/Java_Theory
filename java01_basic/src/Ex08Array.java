import java.util.Scanner;

public class Ex08Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 한 학생의 국어, 영어, 수학, 물리, 과학, 체육점수를 입력받아 총점, 평균을 구하라.
		
		String msg[] = {"국어","영어","수학","물리","과학","체육"};
		
		//각 과목의 점수, 총점, 평균을 담을 배열형 변수선언
		int jumsu[] = new int[8]; 
		
		//점수 입력
		for(int i=0; i<msg.length; i++) {// 0,1,2,3,4,5
			System.out.print(msg[i]+"=");
			jumsu[i] = scan.nextInt();
		}

		//총점   89,56,95,69,69,63,0,0    8-2 = 6
		for(int i=0; i<jumsu.length-2 ; i++) {
			jumsu[jumsu.length-2] += jumsu[i];
		}
		
		//평균
		jumsu[jumsu.length-1] = jumsu[jumsu.length-2] / msg.length;
		
		for(int d : jumsu ) {
			System.out.println(d);
		}
	}
}
