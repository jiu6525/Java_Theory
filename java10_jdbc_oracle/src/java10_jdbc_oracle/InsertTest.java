package java10_jdbc_oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertTest  extends DBConnection{
	
	
	public InsertTest() {}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		
//		*******사원등록********
		System.out.print("사원번호->");
		int empno = Integer.parseInt(scan.nextLine());
		System.out.print("사원명->");
		String ename = scan.nextLine();
		System.out.print("담당업무->");
		String job = scan.nextLine();
		System.out.print("관리자 사원번호->");
		int mgr = Integer.parseInt(scan.nextLine());
		System.out.print("입사일(예:1999-10-20)->");
		String hiredate = scan.nextLine();
		System.out.print("급여->");
		double sal = Double.parseDouble(scan.nextLine());
		System.out.print("보너스->");
		double comm = Double.parseDouble(scan.nextLine());
		System.out.print("부서코드->");
		int deptno = Integer.parseInt(scan.nextLine());
		
		//////////////////////////////
		try {
			getConnection();
			
			sql = "insert into emp2(empno, ename, job, mgr, hiredate, sal, comm, deptno)"
				+ "values(?, ?, ?, ?, to_date(?,'YYYY-MM-DD'), ?, ?, ?)";
		
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, mgr);
			pstmt.setString(5,hiredate);
			pstmt.setDouble(6,sal);
			pstmt.setDouble(7,comm);
			pstmt.setInt(8, deptno);
			
//			실행
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("사원이 등록되었습니다...");
			}else {
				System.out.println("사원등록이 실패하였습니다.");
			}
			
			//Commit은 프로그램에서 연동하여 insert, update, delete는 자동 커밋이 된다.
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	
	public static void main(String[] args) {
		new InsertTest().start();

	}

}
