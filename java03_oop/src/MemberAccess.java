
public class MemberAccess {
	String userid = "jiwoo";
	String name = "지우";
	String tel = "010-1111-2222";
	String email = "jiu6525@daum.net";
	public MemberAccess() {}

	public MemberDTO getMember() {
		MemberDTO dto = new MemberDTO();
		dto.setUserid(userid);
		dto.setUsername(name);
		dto.setTel(tel);
		dto.setEmail(email);
		return dto;
	}
	public MemberDTO[]	getAllMember() {
//		DB회원 선택후
//		1명의 회원은 DTO에 담고 배열에 담는다.
		MemberDTO m1 = new MemberDTO();
		m1.setUserid("java");
		m1.setUsername("홍길동");
		m1.setTel("010-1234-5678");
		
		MemberDTO m2 = new MemberDTO("master","마스터","010-7777-8888");
		MemberDTO m3 = new MemberDTO("admin","나관리자","010-1111-2222");
		
//		배열에 MemberDTO 담기
		MemberDTO[] member = new MemberDTO[3]; 
		member[0] = m1;
		member[1] = m2;
		member[2] = m3;
		
		return member;
	}
	
}
