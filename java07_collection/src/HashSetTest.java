import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	double data[] = {12.5, 56.3, 9.6, 41.2, 10.9,12.5, 56.3, 9.6, 41.2, 10.9};
	public HashSetTest() {}
	public void start(){
//		HashSet
//		set 인터페이스를 상속받음
//		저장 순서를 유지하지 않는다.
//		중복데이터 허용안함.
		
		HashSet<Double> hs = new HashSet<Double>();
		
		for(double d : data) {
			hs.add(d);//HashSet에 객체추가
			
		}
		
//		HashSet객체 꺼내기
		Iterator<Double> i= hs.iterator();
		
		while(i.hasNext()) {//객체가 있으면 true, 없으면 false가 리턴된다.
			double num = i.next();
			System.out.println(num);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		HashSetTest hst = new HashSetTest();
		hst.start();

	}

}
