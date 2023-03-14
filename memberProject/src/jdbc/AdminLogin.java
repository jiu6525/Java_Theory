
public class AdminLogin {
	final String ID = "master";
	final String PWD = "1234";
	public static String adminId;//로그인한 아이디
	private String adminPwd;//로그인한 비번
	public static boolean logStatus;//로그인한 상태
	public AdminLogin(String adminId,String adminPwd) {
		//로그인 (master, 1234)
		if(adminId.equals(ID) && adminPwd.equals(PWD)) {
			//로그인 성공
			this.adminId = adminId;
			this.adminPwd = adminPwd;
			this.logStatus = true;
		}else {
//			로그인 실패
			this.adminId = null;
			this.adminPwd = null;
			this.logStatus = false;
		}
	}
	public void logout() {
//		로그인시 셋팅한 값을 초기화
		adminId = null;
		adminPwd = null;
		logStatus = false;
	}
}
