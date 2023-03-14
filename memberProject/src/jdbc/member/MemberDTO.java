package member;

public class MemberDTO {
	private int no;
	private String username;
	private String tel;
	private String email;
	private String addr;
	private String writedate;
	
	public MemberDTO() {}
	public MemberDTO(String username, String tel, String email, String addr) {
		this.username = username;
		this.tel = tel;
		this.email = email;
		this.addr = addr;
	}
	
	public MemberDTO(int no, String username, String tel, String email, String addr, String writedate) {
		this(username, tel, email, addr);
		this.no = no;
		this.writedate = writedate;
		
		
	}
	@Override
	public String toString() {
		return "no=" + no + ", username=" + username + ", tel=" + tel + ", email=" + email + ", addr=" + addr
				+ ", writedate=" + writedate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getWritedate() {
		return writedate;
	}
	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}
}
