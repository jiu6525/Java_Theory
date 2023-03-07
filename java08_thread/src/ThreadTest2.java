//	스레드 처리 클래스 생성
//  1.인터페이스 Runnable 상속받는다.


public class ThreadTest2 implements Runnable{
	String msg;
	int i = 0;
	
	public ThreadTest2() {}
	
	public ThreadTest2(String msg) {
		this.msg = msg;
	}

//	2. Runable 인터페이스의 추상메소드 오버라이딩
//	   스레드 구현코드 기술한다.
	
	@Override
	public void run() {
		while(true) {								  			// 현재 실행중인 스레드 객체
			System.out.println(msg+"=======>"+ ++i + "____" + Thread.currentThread().getName());
			
		}
		
	}
	
	public static void main(String[] args) {
//	3.  인터페이스 Runnable을 상속받아 run()메소드를 오버라이딩 한 경우
//		해당 클래스를 객체생성 후 Thread 클래스를 객체 생성하여야 한다.
		ThreadTest2 tt1 = new ThreadTest2("first");
		Thread t1 = new Thread(tt1, "첫번째");
		
		ThreadTest2 tt2 = new ThreadTest2("second");
		Thread t2 = new Thread(tt2, "두번째");
		
		ThreadTest2 tt3 = new ThreadTest2("three");
		Thread t3 = new Thread(tt2, "세번째");
		
//		4.스레드 스케쥴러 등록
		t1.start();
		t2.start();
		t3.start();
	}







}
