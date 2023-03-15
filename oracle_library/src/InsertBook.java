import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertBook  extends DBConnection{
	
	
	public InsertBook() {}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		
//		*******책등록********
		System.out.print("번호->");
		int bn = Integer.parseInt(scan.nextLine());
		
		System.out.print("제목->");
		String bookname = scan.nextLine();
		
		System.out.print("출판사->");
		String publisher = scan.nextLine();
		
		System.out.print("저자명->");
		String autor = scan.nextLine();
		
		System.out.print("가격->");
		int price = Integer.parseInt(scan.nextLine());
		
		System.out.print("구매일(예:1999-10-20)->");
		String dop = scan.nextLine();
		
		
		//////////////////////////////
		try {
			getConnection();
			
			sql = "insert into lmp(bn, bookname, publisher, autor, price, dop)"
				+ "values(?, ?, ?, ?, ?, to_date(?,'YYYY-MM-DD'))";
		
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, bn);
			pstmt.setString(2, bookname);
			pstmt.setString(3, publisher);
			pstmt.setString(4, autor);
			pstmt.setInt(5,price);
			pstmt.setString(6,dop);

			
//			실행
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("책이 등록되었습니다...\n");
			}else {
				System.out.println("책등록 실패하였습니다.\n");
			}
			
			//Commit은 프로그램에서 연동하여 insert, update, delete는 자동 커밋이 된다.
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	
}
