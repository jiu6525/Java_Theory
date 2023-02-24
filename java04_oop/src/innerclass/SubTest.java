package java04_oop;

public class SubTest extends SuperTest{

	public SubTest() {
		
//		this(10);
//		super(10);
		
//		a=10;
//		super.a = 50;
		this.a = 10;	//하위에 변수가 없으면 상위의 변수에 적용한다.
		}
	
	public SubTest(int a) {super(a);}

	public static void main(String[] args) {
		SubTest st = new SubTest();
		System.out.println(st.a);

	}

}

//네이버 카페 수업자료 - 상속문제1 풀이