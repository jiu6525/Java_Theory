import java.util.Calendar;
import java.util.Scanner;

public class Ex05ConsoleCalendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//년,월입력
		System.out.print("년=");
		int year = scan.nextInt();
		System.out.print("월=");
		int month = scan.nextInt(); // 10
		
		//현재날짜시간 객체
		Calendar date = Calendar.getInstance();
		//입력받은 년, 월, 1일로 변경
		date.set(year, month-1, 1);
		
		//1일에 대한 요일
		int week = date.get(Calendar.DAY_OF_WEEK); // 1~7
		
		//30->4, 6, 9, 11
		//31->1,3,5,7,8,10,12
		//28, 29 ->
		
		int lastDay = 31;
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11: lastDay = 30;break;
		case 2:
			// 년도가 4의배수이고 100으로 나눠지지 않아야 한다.
			// 400의 배수의 해는 윤년
			if( year%4==0 && year%100!=0  || year%400==0 ) {//윤년
				lastDay = 29;
			}else {//평년
				lastDay = 28;
			}			
		}
		//int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		//타이틀 출력
		System.out.println("\t\t"+year+"년 "+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//공백출력      1         3
		for(int space=1; space<week; space++) {
			System.out.print("\t");
		}
		//날짜 출력
		for(int day=1; day<=lastDay; day++) {
			System.out.print(day+"\t");
			if((week-1+day)%7==0){//줄바꾸기
				System.out.println();
			}
		}
	}

}
