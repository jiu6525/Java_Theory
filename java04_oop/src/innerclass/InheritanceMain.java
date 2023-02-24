package java04_oop;

public class InheritanceMain {

	public static void main(String[] args) {
		CCC c = new CCC();
		System.out.println(c.getData());
		
//		하위클래스를 객체로 만들어 상위클래스에 대입하더라도
//		하위클래스를 오버라이딩한 기능은 그대로 적용된다.
		
		BBB b = new CCC();
		System.out.println(b.getData());
		
		Object obj = new CCC();
		
//		System.out.println(obj.getData());
		
//		상속관계에서 하위클래스 객체를 상위클래스에 대입후
//		다시 하위클래스로 대입할 수 있다.
		
		CCC c2 = (CCC) obj;
		
		System.out.println(c2.getData());
		
//		BBB() 생성자 메소드가 private 접근제한자 이므로
//		객체를 생성할수 없다.
		BBB b1 = new BBB();
		
		MyData data = new MyData();
		data.username = "이순신";
		System.out.println(data.getUsername());
	}

}
