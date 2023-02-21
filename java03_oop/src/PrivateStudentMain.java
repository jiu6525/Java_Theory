
public class PrivateStudentMain {

	public PrivateStudentMain() {
//		private접근제한자는 클래스외분에서 접근허용하지 않는다.
//		객체명.필드명, 객체명.메소드(), new 생성자 메소드()를 허용하지 않는다.
		PrivateStudent ps = new PrivateStudent();
//		String n = ps.name;
//		System.out.println("name->" + n);
		ps.output();
		
		String name = ps.getName();
		System.out.println(name);
		
//		name이 private접근제한자 이기때문에 객체명.필드를 사용할수 없다.
//		ps.name = "이순신";
		ps.setName("이순신");
		System.out.println(ps.getName());
	}

	public static void main(String[] args) {
		new PrivateStudentMain();

	}

}
