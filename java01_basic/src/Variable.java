
public class Variable {
	//멤버변수
	public static void main(String[] args) {
		// 기본 데이터형
		// 정수(byte, short, int(기본), long)
		// 국어점수 0~100점
		byte kor = 97;  //97
		byte eng = (byte)130;  // byte형으로 변환
		//클래스명.변수.메소드명()     "" -> 문자열, String
		System.out.println("kor=" + kor);
		System.out.println("eng=" + eng);
		
		int data = kor;  // 자동형변환 : 작은 데이터 타입 큰 데이터타입으로 대입할 때
		byte mat = (byte)data;
		//   8byte    4byte
		long data2 = 2152542599L; // 상수가 long형이다.
		
		//실수(float, double(기본))
		double n1 = 15.8;
		float n2 = (float)15.3;
		
		//   정수 < 실수
		int data3 = (int)n1;  //소수이하 버림
		System.out.println("data3="+ data3);
		
		boolean boo = true;
		
		//문자형 - 1글자를 저장할 수 있다.   문자열 -  1글자 이상
		char c1 = 'A';  //'한'
		String name = "홍길동";
		
		c1++;
		System.out.println("c1="+ c1);  // B -> 66 
		//  char + int => int
		c1 = (char)(c1 + 1); // 'B'+1
		//  int + double => double
		int result = (int)(data3 + n1); // 15 + 15.8 = 30.8
		System.out.println(c1+", "+ result); //  C,30		
		char c2 = 'B';
		int result2  = c1 + c2;  // 67 + 66 = int
		System.out.println("result2="+ result2);
		
		int data4=0;
		System.out.println(data4);
		
		//      int / int = int
		//      int / double = double
		int a = 10 / 3 ; // 3.3333333 -> 3
		double b = 10 / 3.0; // 3.333333
	}

}
