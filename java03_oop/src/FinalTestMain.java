
public class FinalTestMain {

	public FinalTestMain() {
		
	}
	public void start() {
//		
		FinalTest ft = new FinalTest();
		System.out.println(ft.COMPANY);
		System.out.println(FinalTest.PHONE);
		
//		private 객체를 통합 접근불가
//		System.out.println(ft.ADDRESS);  
		ft.information();
		
	}
	public static void main(String[] args) {
		new FinalTestMain().start();;
	}

}
