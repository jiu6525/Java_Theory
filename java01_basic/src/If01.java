import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 임의의 수를 입력받아 양수면 100을 곱하여 출력하라.
		System.out.print("정수입력=");
		int n = scan.nextInt();
		
		int result=0;
		if(n>0) { // 조건식이 참일때 실행된다.
			//int result = n * 100;
			result = n * 100;
			System.out.println(n + "*100=" + result);			
		}
		System.out.println("The End......"+ n + ", result->"+ result);
	}
}
