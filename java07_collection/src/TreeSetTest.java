import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	
	public TreeSetTest() {}
	public void start() {
		String data[] = {"자바","java","Java","스프링","spring","아작스","ajax","1234"};
	
//		TreeSet 컬렉션
//		저장순서를 유지하지 않느다.
//		정렬된다.
//		중복허용안함.
		TreeSet<String> ts = new TreeSet<>();
		
		for(int i=0; i<data.length; i++) {
			ts.add(data[i]);
		}
		
		System.out.println("객체수=" + ts.size());
	
//		오름차순으로 정렬하여 Iterator 객체로 리턴해준다.
		Iterator<String> ii = ts.iterator();
		while(ii.hasNext()) {
			System.out.print(ii.next()+"\t");
		}
		System.out.println();
		
//		내림차순으로 정렬하여 Iterator 객체로 리턴해준다.
		Iterator<String>iii = ts.descendingIterator();
		while(iii.hasNext()) {
			System.out.print(iii.next()+"\t");
		}
		System.out.println();
		
		String first = ts.first();
		
	}
	public static void main(String[] args) {
		TreeSetTest tst = new TreeSetTest();
		tst.start();

	}

}
