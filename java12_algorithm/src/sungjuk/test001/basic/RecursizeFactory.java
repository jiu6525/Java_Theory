package test001.basic;

public class RecursizeFactory {


//	for문
	static int factorialFor(int n) {
		int fact =1;
		for(int i=5; i>=1;i--) {
			fact *=i;
		}
		return fact;
	}
	
//	while문
	static int factorialWhile(int n) {
		int fact =1;
		while(n>0) {
			fact *= n;
			n--;
		}
		return fact;
	}
	
	
	
//	반환형이 없는 재귀호출
	static int fact=1;//결과를 저장할 변수가 필요함
	static void factorialRecursive(int n) {
		if(n==0) return;
		fact *= n;
		factorialRecursive(n-1);
	}

//	반환형이 있는 재귀호출
	static int factorialRecur2(int n) {
		if(n==1) return 1;
		return n * factorialRecur2(n-1);
	}
	public static void main(String[] args) {
//	임의 값가지 팩토리얼 구하기 5! = 5*4*3*2*1	1*2*3*4*5
		System.out.println(factorialFor(5));
		System.out.println(factorialWhile(5));
		factorialRecursive(5);//재귀 메소드 호출
		System.out.println(fact);
		System.out.println(factorialRecur2(5));
	}

}
