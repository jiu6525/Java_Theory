
public class CalendarObjectTest_me {

	public static void main(String[] args) {
		CalendarObject_me cal = new CalendarObject_me();
		
		int a = cal.Year();
		int b = cal.Month();
		int c = cal.Set1(a,b);
		
		cal.go(c);

	}

}
