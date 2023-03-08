package java10_jdbc_oracle;

import java.util.Scanner;

public class DeleteTest extends DBConnection {
	Scanner scan = new Scanner(System.in);
	public DeleteTest() {
		// TODO Auto-generated constructor stub
	}

	public void start() {
		try {
			System.out.print("삭제할 사원명 : ");
			String ename = scan.nextLine();
			getConnection();
			sql = "delete from emp2 where ename=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  ename);
			
			int result = pstmt.executeUpdate();
			if(result>0) {//삭제된 경우
				System.out.println(ename+"사원의 정보가 삭제되었습니다.");
			}else {//삭제된 레코드가 없을때
				System.out.println("삭제정보가 없습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	
	public static void main(String[] args) {
		new DeleteTest().start();
	}

}
