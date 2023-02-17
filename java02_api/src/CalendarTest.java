import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
//		현재 시스템의 날짜, 시간 관련 객체 만들기
		
//		static이 있는 메소드는 클래스명,메소드명
		Calendar now = Calendar.getInstance();
//		원하는 날짜와 시간으로 변경 -> set()
		now.set(2024, 4-1, 11);
		now.set(Calendar.YEAR, 2023); //년도만 변경
		
//		년도구하기	-> get()
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;	//월 : 0~11
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);	//요일1~7 1:일요일,,,,7:토요일
		

	
		String weekStr = "";
		switch(week) {
		case 1: weekStr = "일"; break;
		case 2: weekStr = "월"; break;
		case 3: weekStr = "화"; break;
		case 4: weekStr = "수"; break;
		case 5: weekStr = "목"; break;
		case 6: weekStr = "금"; break;
		case 7: weekStr = "토";
		
		}
//		오늘은 2023-01-04 수요일 입니다.
		System.out.println("오늘은" + year +"-" +month+"-"+day+" "+weekStr+"요일입니다.");
	
		System.out.println(now.get(Calendar.DAY_OF_YEAR));
//		now의 날짜 정보에서 월의 마지막날구하기
		System.out.println(now.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println("year->" + year);
//		System.out.println("month->" + month);
//		System.out.println("date->" + day);
//		System.out.println(now);
	
	}

}
