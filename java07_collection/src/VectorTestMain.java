import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTestMain {

	public VectorTestMain() {
		// TODO Auto-generated constructor stub
	}
	
	public void start() {

		VectorTest vt = new VectorTest();
		Vector vec = vt.getData();
		
//		벡터의 객체 가져오기
//		0번째 객체 -> String 타입 이름
		String name = (String) vec.get(0);
		
//		1번째 객체 -> 난수저장
		Random random = (Random) vec.get(1);
		
//		2번째 객체 -> int형 나이 저장
		int age = (int) vec.get(2);
		
//		3번째 객체 -> 날짜형 Calendar 변수 저장
		Calendar cal = (Calendar) vec.get(3);
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH);
		int d = cal.get(Calendar.DAY_OF_MONTH);
		
//		4번째 객체 -> MemberDTO 클래스의 회원정보 저장 
		MemberDTO mem = (MemberDTO) vec.get(4);
		
		
		System.out.println("name => "+name);
		System.out.println("random => "+random.nextInt(100));
		System.out.println("age => "+age);
		System.out.printf("날짜 => %d-%d-%d \n",y,m,d);
		System.out.println(mem.toString());
	
//		백터의 객체 지우기
		vec.remove(3);
		vec.remove("강지우");
		System.out.println(vec.size());
		
	}
	
	
	
	public static void main(String[] args) {
		new VectorTestMain().start();

	}

}
