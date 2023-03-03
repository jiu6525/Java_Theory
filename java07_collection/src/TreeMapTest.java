import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
//		TreeMap
//		key와 value를 가진다.
//		key를 정렬한다.
		
		TreeMap<String, MemberDTO> tm = new TreeMap<>();
		
		tm.put("홍길동", new MemberDTO("hong","홍길동","010-0000-1111"));
		tm.put("이순신", new MemberDTO("sunsin","이순신","010-0000-2222"));
		tm.put("세종대왕", new MemberDTO("king","세종대왕","010-0000-3333"));
		tm.put("강감찬", new MemberDTO("chan","강감찬","010-0000-4444"));
		tm.put("안중근", new MemberDTO("jung","안중근","010-0000-5555"));
		
		System.out.println("--------key목록을 구하여전체 출력------------");
		Set<String> keyList =tm.keySet();
		System.out.println(keyList.toString());
		
		System.out.println("-----------value목록을 구하여 전체 출력---------------");
		Collection<MemberDTO> valueList= tm.values();
		
		Object[] objList = valueList.toArray();
		for(Object obj : objList) {
			MemberDTO dto = (MemberDTO)obj;
			System.out.println(dto.toString());
		}
	}

	public static void main(String[] args) {
		new TreeMapTest();

	}

}
