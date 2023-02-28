package java06_abstract_interface;

//추상클래스 사용하기
//1. 추상클래스는 반드시 extends 상속받아야 한다.
//2. 상속받은 추상클래스의 모든 추상메소드를 오버라이딩 해야 한다.
//3. 추상클래스는 미완성 클래스 이기 때문에 new로 객체 생성하여 사용할 수 없다.
public class AbstractTestMain extends AbstractTest{

	public AbstractTestMain() {}
//	추상메소드 오버라이딩
//		   반환형,메소드명,매개변수 개수, 매개변수 데이터형이 일치해야 한다.
	public void minus(int x, int y) {
		int result = Math.abs(x - y);	//abs() : 절대값
		System.out.println(x+"-"+y+"="+result);
		
	}
	public void divide(int x, int y) {
		
	}
	public static void main(String[] args) {
		AbstractTestMain at = new AbstractTestMain();
		at.add(5, 7);
		at.minus(5, 12);
		at.divide(2, 3);
	}

}
