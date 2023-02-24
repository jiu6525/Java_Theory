import java04_oop.MyData;

public class ProtectedTestMain extends MyData {

	public ProtectedTestMain() {
		// TODO Auto-generated constructor stub
	}

	public void start() {
//		다른 패키지의 protected 접근제한자 생성자이므로
//		객체를 생성할 수 없다.
//		MyData md = new MyData();
		
		username = "안중근";
		System.out.println(getUsername());
		setUsername("윤봉길");
		System.out.println(username);
		
	}
	public static void main(String[] args) {
		new ProtectedTestMain().start();

	}

}
