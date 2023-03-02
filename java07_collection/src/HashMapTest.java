import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {}

	public void start() {
//		HashMap
//		키와 value를 가진다.
//		키는 중복될수 없다.
//				key		value
		HashMap<String, MemberDTO> hm = new HashMap();
		
		hm.put("홍길동", new MemberDTO("jiu","지우","0110-1111-2222"));
		MemberDTO dto = new MemberDTO();
		dto.setUserid("guest");
		dto.setUsername("손님");
		dto.setEmail("guest@daum.net");
		hm.put("손님", dto);
		hm.put("세종대왕",new MemberDTO("king","세종대왕","010-0000-1111"));
		hm.put("안중근",new MemberDTO("jung","안중근","010-0000-2222"));
		hm.put("김구",new MemberDTO("kim","김구","010-0000-3333"));
		hm.put("꿩",new MemberDTO("bird","꿩","010-0000-4444"));
		
//		Map 컬렌션에 객체 얻어오기
//		key를 이용하여 value 얻어오기
		MemberDTO value = hm.get("안중근");
		System.out.println(value.toString());
		
//		모든 key얻어오기
		Set<String> keyList= hm.keySet();
		Iterator<String> ii = keyList.iterator();
		System.out.println("------------key를 이용한 정보얻어오기-----------------------------");
		while(ii.hasNext()) {
			MemberDTO dto2 = hm.get(ii.next());
			System.out.println(dto2.toString());
			
		}
		
//		모든 value얻어오기
		Collection<MemberDTO> valueList = hm.values();
		Iterator<MemberDTO> iii = valueList.iterator();
		System.out.println("------------value를 이용한 정보얻어오기---------------------------");
		while(iii.hasNext()) {
			System.out.println(iii.next().toString());
		}
	}
	public static void main(String[] args) {
		HashMapTest hmt = new HashMapTest();
		hmt.start();

	}

}
