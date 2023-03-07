//스레드 처리되는 클래스 생성하기
//1. Thread 클래스 상속
//2. Thread 처리할 실행문을 run() 메소드에 오버라이딩하여 구현
//3. start() 메소드를 이용하여 자바가상 머신의 스레드 스케쥴러에 등록한다.

public class ThreadTest1 extends Thread{
	String msg;
	public ThreadTest1() {}
	
	
	public ThreadTest1(String msg) {
		this.msg = msg;
	}
	
//	run() 메소드 오버라이딩
	public void run() {
		for(int i =1; ;i++) {
			System.out.println(msg+"-->"+i);
		try {
			Thread.sleep(200);
		}catch(InterruptedException ie) {}
		}
	}
	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1("첫번째");
		ThreadTest1 tt2 = new ThreadTest1("두번째");
		ThreadTest1 tt3 = new ThreadTest1("세번째");
		
		
//		스레드 시작
		tt1.start();
		tt2.start();
		tt3.start();
	}

}
