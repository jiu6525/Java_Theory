import java.util.Scanner;

public class Ex04For {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
			//단입력
			System.out.print("단입력=");
			int dan = scan.nextInt();
			
			if(dan>=2 && dan<=9) {// 2~9단
				for(int i=2; i<=9; i++) {// 2,3,4,5,6,7,8,9
					int result = dan*i;
					System.out.println(dan +" * "+ i + " = "+ result);
				}			
			}else {//잘못입력된경우
				System.out.println("단을 잘못입력하였습니다.");
			}
		}while(true);		
	}
}
/*
   2~9단까지 
  
[실행] 
단입력->10
단을 잘못입력하였습니다.


단입력->5
5 * 2 = 10
5 * 3 = 15
:
:
5 * 9 = 45 
 
*/
