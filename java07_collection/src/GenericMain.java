import java.util.Calendar;

public class GenericMain {

	public static void main(String[] args) {
		int n1 = 10;
		String name1 = "홍길동";
		
		GenericTest gt1 = new GenericTest();
		gt1.setNum(n1);
		gt1.setName(name1);
		System.out.println(gt1.toString());
		
		double n2 = 12.5;
		Calendar now = Calendar.getInstance();
		
		GenericTest<Double,Calendar> gt2 = new GenericTest<Double,Calendar>();
		gt2.setNum(n2);
		gt2.setName(now);

		System.out.println(gt2.getNum());
		System.out.println(gt2.getName());
	}

}
