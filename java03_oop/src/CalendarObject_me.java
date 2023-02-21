import java.util.Calendar;
import java.util.Scanner;

public class CalendarObject_me {
	public CalendarObject_me() {}
	
	public int Year() {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력해주세요 :");
		int year = scan.nextInt();
		return year;
	}
	
	public int Month() {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇월인가요? :");
		int month = scan.nextInt();
		return month;
	}
	
	public int Set1(int year,int month) {
		Calendar cal = Calendar.getInstance();
//		기본 화면
	    System.out.print("\t\t"+year+"년 "+month+"월\n");
	    System.out.print("일\t월\t화\t수\t목\t금\t토\n");
//	    사용자에게 입력받은 값으로 일자를 변경해줌(입력받은 년,월 1일로 세팅)
	    cal.set(year, month-1,1);
	    
//	    입력받은 월의 첫번째 날을 start 변수에 저장
	    int start = cal.get(Calendar.DAY_OF_WEEK);
	    
	    return start;
	}
	
	 public void go(int start) {
		Calendar cal = Calendar.getInstance();
//	    첫번째 날 전까지 \t 로 띄어줌
		for(int i = 1; i<start; i++) {
			System.out.print("\t");
			
		}
//		입력받은 월의 마지막날 전까지 콘솔창에 입력되도록 반복분 실행
		for(int i1 =1; i1<=cal.getActualMaximum(Calendar.DAY_OF_MONTH);i1++) {
			System.out.print(i1+"\t");
			
//			start 값을 1씩 증가시켜서 7이 될 경우 개행
			if(start %7 ==0) {
				System.out.println();
			}
			start++;
		}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
