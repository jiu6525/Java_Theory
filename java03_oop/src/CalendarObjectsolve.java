import java.util.Calendar;
import java.util.Scanner;

public class CalendarObjectsolve {
//	멤버변수없음
	public  CalendarObjectsolve() {}
	public void start() {
//		년, 월, 요일, 마지막날, 제목, 날짜를 출력하는 start 클래스 생성
//		년
		int year = inputData("년도");
//		월
		int month = inputData("월");
//		요일
		int week = getWeek(year, month);
//		마지막날
		int lastDay = getLastDay(year, month);
//		제목
		titlePrint(year, month);
//		공백
		spacePrint(week);
//		날짜
		dayPrint(lastDay, week);
		
	}
	public void start2(int y,int m) {
		int w = getWeek(y,m);
		int lastDay = getLastDay(y, m);
		spacePrint(w);
		dayPrint(y, m);
	}
	
//	입력 (년도,월)
	public int inputData(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.println(msg + "=>");
		return scan.nextInt();
	}
	
//	요일구하기(1일)
	public int getWeek(int year, int month) {
		Calendar now = Calendar.getInstance();
		now.set(year,month-1,1);
		return now.get(Calendar.DAY_OF_WEEK);
	}
	
//	마지막날 구하기
	public int getLastDay(int year, int month) {
		int lastDay = 31;
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11: lastDay = 30;break;
		case 2:

			if(year%4==0 && year%100 != 0 || year%400==0) {
				
			}else { 
				lastDay = 28;
			}
		}
		return lastDay;
		}
	
	
	
	
//	title출력
	public void titlePrint(int year, int month) {
		System.out.print("\t\t"+year+"년 "+month+"월\n");
		weekTitle();
	}
	
	public void weekTitle() {
		System.out.print("일\t월\t화\t수\t목\t금\t토\n");
	}
	
	
	
//	공백출력
	public void spacePrint(int week) {
//	    첫번째 날 전까지 \t 로 띄어줌
		for(int i = 1; i<week; i++) {
			System.out.print("\t");
		}
	}
	
	
	public void dayPrint(int lastDay, int week) {
//		입력받은 월의 마지막날 전까지 콘솔창에 입력되도록 반복분 실행
		for(int i =1; i<=lastDay;i++) {
			System.out.print(i+"\t");
			
	
		//		start 값을 1씩 증가시켜서 7이 될 경우 개행
			if(week %7 ==0) {
				System.out.println();
			}
			week++;
		}
	}
}
	
	
	
	
	
	


