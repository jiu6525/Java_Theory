package innerclass;

public class AnonymousInnerClass {
	String myName = "강지우";
	public AnonymousInnerClass() {}
	public void start() {
//		3. 익명(Anonymous)의 내부클래스
//			클래스명이 존재하지 않는 클래스
//		한번만 사용하거나 자주 사용하지 않을 때 익명내부클래스를 만든다.
//		객체명.메소드명
		
		Sample s = new Sample() {
//			내부클래스
			int tot = 120;
//			메소드a
			void totOutput() {
				System.out.println("tot= "+tot);
				System.out.println("myName = " + myName);
			}
			
//			Sample의 메소드를 오버라이딩
//			오버라이딩은 상위클래스 형변환하더라도 오버라이딩 된 기능은 유지한다.
			
			public void getSum() { 	//짝수의 합
				int total = 0;
				for(int i=2;i<=100; i+=2) {
					total += i;
				}
				
				System.out.println("evenSum ->" + total);
			}
			
		};//.getSum();//.getOddSum();//.totOutput();
//		익명의 내부클래스에서 새로생성된 메소드는 상위의 Sample클래스에
//		대입하면 사용할수 없다.
//		s.totOutput();
		s.getOddSum();
	}

	public static void main(String[] args) {
		AnonymousInnerClass aic = new AnonymousInnerClass();
		aic.start();
	}

}
