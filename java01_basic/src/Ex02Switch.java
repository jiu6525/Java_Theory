import java.util.Scanner;

public class Ex02Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int kor, eng, mat;		
		//1. 점수입력
		System.out.print("국어점수=");
		kor = scan.nextInt();
		System.out.print("영어점수=");
		eng = scan.nextInt();
		System.out.print("수학점수=");
		mat = scan.nextInt();
		
		//총점
		int tot = kor + eng + mat;
		//평균
		double ave = (double)tot/3;   //tot/3.0
		
		String grade = "F";
		switch((int)ave/10) {// 0,1,2,3,4,5,6,7,8,9,10
		case 10 : 
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default: grade = "F";
		}
		System.out.println("총점="+ tot);
		System.out.println("평균="+ ave);
		System.out.println("학점="+ grade);
	}
}
/*

90~100   A학점
80~89    B학점
70~79    C학점
60~69    D학점
0~59     F학점


 
[처리조건]
콘솔에서 국어,영어,수학점수를 입력받아 다음과 같이 출력하라.
단, 평균은 실수로 구한다.  
   학점은 switch문을 이용한다.

[실행결과]
국어점수=70
영어점수=80
수학점수=90
총점=240
평균=80.0
학점=B
*/