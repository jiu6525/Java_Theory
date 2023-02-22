// 캡슐화된 멤버변수와 getter,setter 메소드가 있는 데이터를 저장할수 있는 클래스
// 회원정보(아이디, 비밀번호, 이름, 연락처, email, 주소, 취미, 관심분야..........)
// 상품정보(상품명, 가격, 컬러, 사이즈, 할인률)
// DTO클래스(Data Transfer Object) - setter 이용하여 데이터 변경할 수 있다.

// VO클래스(Value Object) - readonly전용
public class MemberDTO {
//	캡슐화 변수
	private String userid;	//null
	private String userpwd;
	private String username;
	private	String tel;		//010-1234-5678	02-123-4567
	private	String Email;

	public MemberDTO() {}
	
	public MemberDTO(String userid, String username, String tel) {
		this.userid = userid;
		this.username = username;
		this.tel = tel;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + ", tel=" + tel
				+ ", Email=" + Email + "]";
	}

//  마우스 오른쪽 -> source -> gernerate getters and setters
	//	getter
	public String getUserid() {
		return userid;
	}
	
//	setter
	public void setUserid(String userid) {
		this.userid = userid;
		
	}
	
	public String getUserpwd() {
		return userpwd;
	}
	
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
