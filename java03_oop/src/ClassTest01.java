import java.util.Calendar;
import java.util.Scanner;

public class ClassTest01 {
//	멤버변수(필드) - 현재클래스 내에는 사용가능한 전역변수
//	멤버변수는 초기값이 자동으로 설정된다.
//	정수(byte, short, int, long)은 0, 실수(float, double)은 0.0, 논리(boolean)은 false
//	배열, 클래스형(객체형)은 null;
	
	int num;  //0
	String userid; //null
	Calendar now;  //null
	int[] arr;  //null

	
	int dataNum = 1234;
	String myName = "이순신";
	Scanner scan = new Scanner(System.in);
	String name = "세종대왕";
	
	static {
//		멤버영역에서 실행문을 구현할때 static{} 명령어를 사용하여 기술가능.
//		클래스 내에서 제일 먼저 실행됨
		System.out.println("멤버영역에서 실행함.....");
	}
	
//	메소드 : 기능구현, 변수선언, 계산, 기본명령어(if, switch, for, while.....기술한다.)
//	1. 생성자 메소드
//	 - 객체생성시 1번 실행됨. new 생성자(), 객체의 초기값을 설정할때 사용한다.
//	 - 메소드명이 클래스명과 같아야 한다.
//	 - 반환형이 없다.
//	 - 생성자 메소드는 여러개 만들수 있다. 단 매개변수의 갯수나 데이터형이 달라야 한다.
//	 - 생성자가 없을경우 자동으로 클래스를 생성한다.
//	 ClassTest01(){}

	public ClassTest01() {
		System.out.println("ClassTest01() 생성자 메소드 실행됨.." );
	}
	
	public ClassTest01(int num) {
		int data;
		System.out.println("ClassTest01(int num) 생성자 메소드 실행됨..." + num);
	}
	
	public ClassTest01(String name) {
		System.out.println("ClassTest01(String name) 생성자 메소드 실행됨..." + name);
	}
	
	public ClassTest01(int num, String name) {
//		멤버있는 변수에 지역변수값을 설정하기
//		this는 메소드의 지역변수와 멤버변수가 같은 변수명일때 멤버변수를 지정하는 키워드로 사용한다.
		this.num = num;
		System.out.println("ClassTest01(int num, String name) 생성자 메소드 실행됨..." +num+ " , "+ name + this.num + myName);
	}
//	2. 메소드 : 기능구현
//		- 필요한 만큼 생성가능
//		- public 반환형 메소드명(arg1, arg2....){
//		}
//		- 반환형은 메소드를 실행한 결과가 메소드 밖으로 내보내는 것이다.
//	    - 반환형이 void인 경우 반환값이 없다.
	
//		- 메소드명 생성규칙
//		  소문자로 시작, 두번째 단어는 첫번째 문자를 대문자
	public void method1() {
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println("c=" + c );
	}
	
	public String method2(int a, int b) {
		int c = a + b;
		return "c="+c;
	}
	public void method2() {
		System.out.println();
	}
		
	public String getMyName() {
//		같은 클래스에 다른 메소드 호출
		method1();
		
		return myName;
	}
}
