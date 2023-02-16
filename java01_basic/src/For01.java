
public class For01 {

	public static void main(String[] args) {
		//1~5
		// 제어 문자 : \n -> 줄바꿈
		//           \t -> 8칸간격으로 띄워쓰기
		//           \" ->
		//           \' ->
		System.out.println("1\n2\n3\n4\n5");
		System.out.println("1\t2\t3\t4\t5");
		//    저는 "홍길동"입니다.
		//    저는 '홍길동'입니다.
		
		System.out.println("저는 \"홍길동\"입니다.");
		System.out.println("저는 \'홍길동\'입니다.");
		
		int oddSum = 0;
		// for문 : 지정한 회전수 만큼 반복한다.
		//for(int i=1;i<=5;i++) {// i++, ++i, i=i+1, i+=1
		//for(int i=5; i>=1; i--) {// 5, 4,3,2,1     --i, i--, i=i-1, i-=1
		for(int i=1; i<=10; i+=2) { // i=i+2, i+=2
			oddSum = oddSum + i; // 1~10까지 홀수의 합
			System.out.println(i);
		}
		System.out.println("홀수 합 =" + oddSum+"\n======================================");
		for(int i=65; i<=90; i++) {// 65,66,67....
			System.out.print((char)i);			
		}
		System.out.println();
		for(char alp='A'; alp<='Z'; alp++) {
			System.out.print(alp);
		}
		/*
ABCDEF.......Z		 
		*/
	}

}
