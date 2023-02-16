
public class Operator {

	public static void main(String[] args) {
		// 연산자 
		// 산술연산자(+,-,*, /,%)
		// 부호 (+, -)
		// 대입연산자 ( =, +=, -=, *=, /=, %=)
		int n1 = 1230;
		n1 *= 2; // n1 = n1 * 2;
		System.out.println("n1="+ n1);
		
		//증감연산자 : ++, --
		char c = 'A';
		c++; // B
		++c; // C
		c--; // B
		System.out.println("c->"+ c);
		
		int n = 5;
		int result = n++ + 10; 
		// 6, 15
		System.out.println("n="+n+", result="+ result);
		
		int result2 = n + 2 * 8 / (2 % (7 + 2) - 3) * 3;
		System.out.println("result2=>"+ result2);
		
		//비트 연산자 (2진수로 계산하기
		//          &, |, ^(XOR), ~
		int a = 10;
		int b = 3;
		int r1 = a & b;
		System.out.println("r1->"+ r1);
		
		int r2 = a | b;
		System.out.println("r2->"+ r2);
		
		int r3 = a ^ b;
		System.out.println("r3->" + r3);
		
		int r4 = ~b; // 단항연산자  ~ : 0->1, 1->0
		
		// 2의 보수 -> 1의 보수 + 1 -> 
		//1의 보수 -> 0->1 , 1-> 0
		System.out.println("r4="+ r4);
		
		// 쉬프트 연산자 : 비트를 왼쪽 또는 오른쪽으로 이동하며 연산하기
		// <<, >>, >>>
		// << (왼쪽으로 이동)
		// >> (오른쪽으로 이동, 부호로 채워짐)
		// >>> (오른쪽으로 이동, 0으로 채워짐)
		int r5 = a << 3;
		System.out.println("r5->"+ r5);//    10 * 2^3
		
		int r6 = a >> 3;
		System.out.println("r6->"+ r6);
		
		int r7 = r4 >> 3;
		System.out.println("r7->"+ r7);  //-1
		
		int r8 = r4 >>> 3;
		System.out.println("r8->"+r8);
	}
}
