package java06_abstract_interface;

//interface에는 static final 상수
//추상메소드를 기술한다.
public interface InterfaceA extends InterfaceB{
//	상수
	public static final int MAX = 100;
	public static final String FIRST_NAME = "LEE";
	
//	추상메소드
	public int hap(int x, int y);
	public int cha(int a, int y);
	public int gob(int a, int b);
	public int mok(int x, int y);
	
	
}
