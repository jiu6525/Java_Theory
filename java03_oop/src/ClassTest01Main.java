
public class ClassTest01Main {

	public static void main(String[] args) {
		// new 키워드로 객체를 생성한다.
		
		ClassTest01 ct1 = new ClassTest01();
		
		ClassTest01 ct2 = new ClassTest01("홍길동");

		ClassTest01 ct3 = new ClassTest01(9999,"안중근");
		
//		메소드 호출 : 객체명, 메소드명()
		ct1.method1();
		
		String result = ct1.method2(1234, 544);
		
		System.out.println("result ->" + result);
		
//		객체내의 멤버변수의 값 변경하기
//		객체명.멤버변수 = 값
		ct3.myName = "박태환";
		System.out.println("myName -> " + ct3.getMyName());
		System.out.println("myName -> " + ct2.getMyName());
	
	}

}
																																																																																																																																																																																																										