package java06_abstract_interface;

//클래스에서 추상메소드들이 있는 interface를 사용하기 위해서느
//implements키워드를 이용하여 상속을 받은 후 모든 추상메소드를 오버라이디하여야 한다.
//interface는 여러개 상속받을 수 있다.
public class InterfaceMain implements InterfaceA, InterfaceC {

	public InterfaceMain() {}	
	
	@Override
	public int hap(int x, int y) {
		return x+y;
	}

	@Override
	public int cha(int a, int y) {
		return 0;
	}

	@Override
	public int gob(int a, int b) {
		return 0;
	}

	@Override
	public int mok(int x, int y) {
		return 0;
	}
	

	@Override
	public String getDouble() {
		return null;
	}

	@Override
	public void setDouble(double n) {
	}

	@Override
	public void output() {
		System.out.println("MAX=" + MAX);
		System.out.println("MAX_DOUBLE = " + MAX_DOUBLE);
		System.out.println("STATUS = " + STATUS);
	}
	
	public static void main(String[] args) {
		System.out.println(InterfaceA.MAX);	//100
		
		InterfaceMain im = new InterfaceMain();
		im.output();
		
//		interface를 상속받은 클래스의 객체생성과 대입
//		new InterfaceA(); //->interface이므로 객체 생성불가
		InterfaceA a = new InterfaceMain();
		System.out.println("hap() -> "+ a.hap(100, 25));
//		a.output();//	InterfaceC의 메소드 output() 숨겨져있다.
		
		InterfaceMain im2 = (InterfaceMain)a;
		
		im2.output();
	}

}
