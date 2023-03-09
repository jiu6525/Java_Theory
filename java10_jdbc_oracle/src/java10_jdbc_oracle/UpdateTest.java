package java10_jdbc_oracle;

import java.util.Scanner;

public class UpdateTest extends DBConnection {
	Scanner scan = new Scanner(System.in);

	public UpdateTest() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
//		수정할 사원번호 입력
//		담당업무, 급여, 보너스 수정하기
		try {
			System.out.print("수정할 사원번호->");
			int empno = Integer.parseInt(scan.nextLine());
			
			System.out.print("담당업무 : ");
			String job = scan.nextLine();
			System.out.print("급여 : ");
			double sal = Double.parseDouble(scan.nextLine());
			System.out.print("보너스 : ");
			double comm = Double.parseDouble(scan.nextLine());
			
			System.out.println(empno+","+job+","+sal+","+ comm);
			getConnection();
			
			sql="update emp2 set job=?, sal=?, comm=? where empno=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, job);
			pstmt.setDouble(2, sal);
			pstmt.setDouble(3, comm);
			pstmt.setInt(4,  empno);

			int result = pstmt.executeUpdate();

			
			if(result>0) {
				System.out.println(empno+" 사원의 정보가 수정되었습니다.");
			}else {
				System.out.println("사원정보가 수정되지 않았습니다.");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
	}
	public static void main(String[] args) {
		new UpdateTest().start();

	}

}
