import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {}

	public Vector getData() {
//		컬렉션은 객체를 저장하고 보관하는 기능을 가진 자료구조처리를 해주는 것을 말한다.
//		컬렉션은 다양한 타입의 객체를 저장할수도 있고, 하나의 타입(제너릭)을 저장할 수 있도록 성정할수도 있다.
		
//		순서를 유지, index가짐, 중복객체 저장됨
		
		Vector vector = new Vector();
		
		String name = "홍길동";	//0
		int age = 25;	//1
		Calendar now = Calendar.getInstance();
		now.set(2020, 10, 25);
		Random random = new Random();
		MemberDTO mem = new MemberDTO("best","베스트","010-1234-5678");
		
		vector.add(name); //0
		vector.add(age); //1	->	오토박싱	2 -->지워짐
		vector.addElement(now); //2			3
		vector.add(1, random); //1
		vector.addElement(mem); 	//4
		
		
//		index위체의 객체를 치환
		vector.set(2, 35);	//-->2
		vector.setElementAt("강지우",0 );	//-->2
		
		System.out.println("capacity -> " + vector.capacity());	//확보된크기
		
		return vector;
	}

}
