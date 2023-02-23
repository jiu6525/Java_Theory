
public final class FinalTest {
//	final변수는 한번 값이 설정되면 변경할 수 없다.
//	final변수는 대문자로 만든다. 단어의 구별은 _로 한다.
	
	final String COMPANY = "멀캠";
	private final String ADDRESS;
	static final String PHONE = "01-1234-5678";
	public FinalTest() {
		ADDRESS = "서울시 강남구";
//		ADDRESS = "서울시 영등포구"; final변수는 값을 변경할 수 없다.
		
	}
//	메소드의 final 은 오버라이딩이 안됨.
	public final void information() {
		System.out.println("회사명 = " + COMPANY);
		System.out.println("주소 = " + ADDRESS);
	}
}
