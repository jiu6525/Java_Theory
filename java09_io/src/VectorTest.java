import java.io.Serializable;
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;
//파일로 객체를 저장하기 위해서는 객체를 직렬화를 해야 한다.
//인터페이스 Serializable을 상속받으면 직렬화가 된다.
public class VectorTest implements Serializable{
	String msg = "객체로 잘 만들기";
	public VectorTest() {}

	public Vector getData() {
//		컬렉션은 객체를 저장하고 보관하는 기능을 가진 자료구조처리를 해주는 것을 말한다.
//		컬렉션은 다양한 타입의 객체를 저장할수도 있고, 하나의 타입(제너릭)을 저장할 수 있도록 성정할수도 있다.
		
//		순서를 유지, index가짐, 중복객체 저장됨
		
		Vector vector = new Vector();
		
		String name = "홍길동22";	//0
		int age = 27;//1
		Calendar now = Calendar.getInstance();
		now.set(2024, 10, 25);
		Random random = new Random();
		MemberDTO mem = new MemberDTO("ioTest","베스트","010-3333-1111");
		
		vector.add(name); //0
		vector.add(age); //1
		vector.addElement(now); //2		
		vector.addElement(mem); //3
		vector.addElement("강지우");	//4
		

		
		return vector;
	}

}
