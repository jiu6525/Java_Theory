
public class ATM implements Runnable{
	private int money = 20000;
	public ATM() {}

	
	
//	스레드 오버라이딩
//	스레드 메소드 전체 동기화 하기
//	동기화(synchronized) : 스레드 실행중 다른 실행이 대기모드가 된다.
//	run()메소드 표기, run() 메소드 내에 전체 또는 일부에 표시할수 있다.
	@Override
//	public synchronized void run() {
	public void run() {
//		메소드 내에 일부만 동기화 시키기
		synchronized(this) {
// 		스레드 시작시 1000원씩 10번 연속출금
		for(int i=1;i<=10; i++) {
			getCash(1000);
		if(money%2000==0) {	//잔액이 2000의 배수일때 동기화 해제
			try {
				this.wait();
			} catch (InterruptedException e) {}
		}else {	//다시 동기화
				this.notify();
		}
		}
	}//synchronized
		
}
	
	
//	출금처리 메소드
	public void getCash(int cash) {
		if(money>=cash) {//잔고가 있을때
			money -= cash;
			System.out.println(Thread.currentThread().getName()+"출금, 잔액 = " + money + " 원");
		}else {//잔고가 없을때
			System.out.println("잔액이 부족합니다.. 잔액 = " + money);
		}
	}
	
	
	
//	출금처리 메소드
	public void getCash() {}
	////////////////////////////////////////////////////////
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread mother = new Thread(atm, "mother");
		
		Thread son = new Thread(atm, "son");
		
		son.setPriority(Thread.MAX_PRIORITY); //우선순위
		mother.start();
		son.start();
	}



}
