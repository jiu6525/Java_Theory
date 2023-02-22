import java.util.Scanner;

public class GuguDanObject {
	public GuguDanObject() {}
//	단을 입력받는 메소드
	public int inputDan() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단입력 ->");
		int dan = scan.nextInt();
		return dan;
	}
	
//		한개의 단 을 처리하는 메소드
		public void oneDan(int dan) {
			for(int i=1; i<=9; i++) {
				int result = dan * i;
				System.out.println(dan + "*" + i + " = " + result);
			}
		}

//		전체단(2~9)을 처리하는 메소드
		public void allDan() {
			for(int dan=2;dan<=9; dan++) {//단
				System.out.println("=" + dan + "단=");
				oneDan(dan);
//				for(int i=1;i<=9;i++) {
//					int result = dan*i;
//					System.out.println(dan  + "*" + i + "=" + result);
//				}
			}
		
}
}
