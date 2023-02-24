package java04_oop;

public class CCC extends BBB {
	int c = 30;
	public CCC() {}
	public int getData() {
//		상위클래스의 c멤버변수는 전븍ㄴ제한자 private 이므로 
//		상속되지 않는다.
//		System.out.println("BBB.c=" + c);
//		상위클래스의 getWelcom()메소드는 접근제한자 private 이므로
//		상속되지 않는다.
//		System.out.println(getWelcome());
		return b+20;
	}
}
