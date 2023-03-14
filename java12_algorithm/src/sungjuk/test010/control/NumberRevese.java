package test010.control;

public class NumberRevese {

	public NumberRevese() {
		
	}
	static void numberReverse(int data) {
//		74747585	-> 5574747
//		123456		-> 654321
//		정수형을 역순으로 처리한다.
		
//		StringBuilder를 사용한 풀이
//		숫자 -> 문자 String.valueOf(123) ,	123+"" = "123"
//		문자 -> 숫자 Integer.parseInt("123")
		
//		StringBuilder sb = new StringBuilder(String.valueOf(data));
//		sb.reverse();
//		System.out.println(Integer.parseInt(sb.toString()));
		
		
//		수식을 이용한 풀이
//		int num = 0;
//		while(data!=0) {
//			num = num*10+data%10;
//			data /= 10;
//		}
//		System.out.println(num);
		
	}
	
//	배열을 이용한 숫자의 역순
	static void numberReverseArray(int data) {
		StringReverseArray(String.valueOf(data));
	}
	
	static void StringReverseArray(String data) {
		char c[]= data.toCharArray();//	배열로 만듬
//		배열의 문자 교환
		for(int i=0; i<c.length/2;i++) {
//			i = c.length-1-i
			char temp = c[i];
			c[i] = c[c.length-1-i];
			c[c.length-1-i] = temp;
		}
		System.out.println(String.valueOf(c));
	}
	public static void main(String[] args) {
//		클래스이용 && 수식이용
//		numberReverse(10013);

		
//		배열이용
		numberReverseArray(215668);
		
		StringReverseArray("qwer");
		
	}

}
