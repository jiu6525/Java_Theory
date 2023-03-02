import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public ArrayListTest() {}
	public ArrayList memberList() {
//		회원 1명의 정보를 DTO에 셋팅하고
//		DTO를 ArrayList에 추가하여 리턴해주는 메소드
		
		ArrayList memList = new ArrayList();
//		add(Object) : 마지막에 객체추가
//		add(int, Object) : int 위치에 객체를 추가하고 int위치에 객체가 있으면 다음으로 이동한다.
		memList.add(new MemberDTO("jiu","지우","010-1111-2222","jiu6525@daum.net"));
		memList.add(new MemberDTO());
		memList.add(new MemberDTO("master","마스터","010-1234-5678"));
		MemberDTO dto = new MemberDTO();
		dto.setUserid("admin");
		dto.setUsername("관리자");
		dto.setEmail("admin@daum.net");
		memList.add(dto);
		
		return memList;
		
	}
	public ArrayList<MemberDTO> memberList2() {
//		회원 1명의 정보를 DTO에 셋팅하고
//		DTO를 ArrayList에 추가하여 리턴해주는 메소드
		
		
//		컬렉션에 제너릭을 설정하면 컬렌션추가 할수 있는 객체타입을 지정할수 있다.
//		컬렌션에 설정된 타입과 다르면 추가 할수 없다.
		
		ArrayList<MemberDTO> memList = new ArrayList<MemberDTO>();
//		add(Object) : 마지막에 객체추가
//		add(int, Object) : int 위치에 객체를 추가하고 int위치에 객체가 있으면 다음으로 이동한다.
		memList.add(new MemberDTO("jiu2","지우2","010-1111-2222","jiu65252@daum.net"));
		memList.add(new MemberDTO());
		memList.add(new MemberDTO("master2","마스터","010-1234-5678"));
		MemberDTO dto = new MemberDTO();
		dto.setUserid("admin2");
		dto.setUsername("관리자");
		dto.setEmail("admin@daum.net");
		memList.add(dto);
		
//		제너릭 설정된 MemberDTO가 아니므로 객체를 추가할수 없다.
//		memList.add(new Scanner(System.in));
		
		return memList;
	}
}
