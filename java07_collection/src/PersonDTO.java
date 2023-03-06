import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PersonDTO {
	private int num; //	번호
	private Calendar dateTime;//	날짜, 시간
	private int waitingCount;//	대기인수
	
	@Override
	public String toString() {
//		번호 : 5
//		현재시간 : 2023-01-12 03:15:16 (목)
//		대기인수 : 3
		String message = "";
		message += "번호 : " + num + "\n";
		
//		SimpleDateFormat 클래스를 이용하면 날짜를 원하는 패턴으로 만들수 있다.
		SimpleDateFormat dFormat = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss (E)");
		
//		날짜를 패턴에 적용
		String dateTimeStr = dFormat.format(dateTime.getTime());
		
		message += "현재시간 : " + dateTimeStr + "\n";
		
//		대기열에 남아 있는 객체 수
//		LinkedListTest.watingList.size();
		
		message += "대기인수 : " + waitingCount; 
		return message;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Calendar getDateTime() {
		return dateTime;
	}
	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}
	public int getWaitingCount() {
		return waitingCount;
	}
	public void setWaitingCount(int waitingCount) {
		this.waitingCount = waitingCount;
	}
	
	
}
