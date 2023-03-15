import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookList extends DBConnection{

	public BookList() {}
	public void start() {

		try {
			getConnection();
			String sql = "select bn, bookname, publisher, autor, price, dop from lmp";
//					+ " order by bn asc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("========================책목록=========================");
			System.out.println("번호\t 제목\t\t 출판사\t 저자\t 가격\t 구매일");
			while(rs.next()) {//레코드가 있으면 true, 레코드가 없으면 false
//				현재 point의 레코드가 얻어올수 있다.
				int bn = rs.getInt(1);// rs.getInt("empno");
				String bookname = rs. getString(2);
				String publisher = rs.getString(3);
				String autor = rs.getString(4);
				int price = rs.getInt(5);
				String dop = rs.getString(6);
				
				
				System.out.println(bn+"|\t|"+bookname+"\t\t|"+publisher+"\t|"+autor+"\t|"+price+"\t|"+dop+"\t");
			}
			System.out.println();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	
}
