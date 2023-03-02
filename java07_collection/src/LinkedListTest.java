import java.util.Calendar;
import java.util.LinkedList;

public class LinkedListTest {
	public static int count = 1;
//	번호표 뽑으면 personDTO객체를 만들어 Queue에 추가한다.
	public static LinkedList<PersonDTO> waitingList = new LinkedList<PersonDTO>();
	
//	Guest in - 번호표 뽑을때
	public void inGuest() {
//		personDTO객체를 만들어
		PersonDTO person = new PersonDTO();
//		1. num의 값을 DTO추가 num은 1 증가
		person.setNum(count++);
//		2. 현재날짜와 시간을 DTO객체에 추가
		person.setDateTime(Calendar.getInstance());
//		3. 대기인수 : watingList의 크기를 구하여 waitingCount셋팅
		person.setWaitingCount(waitingList.size());
//		4. 출력 
		System.out.println(person.toString());
		System.out.println("---------------");
		
//		대기열에 추가
		waitingList.offer(person);
		
	}
//	Guest out - 차례가 되었을때
	public void outGuest() {
//		제일앞객체 꺼내고 지워짐
		waitingList.poll();
		
	}
}
