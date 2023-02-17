
public class MathTest {

	public MathTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(Math.ceil(5.1) + "," + Math.ceil(-5.1));		// 6올림(큰값)		-5.1	-5

		int a = (int) Math.round(52.3);
		int a1 =  Math.round((float)52.3);
		System.out.println(a);
		System.out.println(a1);
		
		System.out.println(Math.floor(8.9)+","+Math.floor(-3.1));
		
		System.out.println(Math.sqrt(10));
		
		System.out.println((int)Math.pow(5,3));
	}

}
