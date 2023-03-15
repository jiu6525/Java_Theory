import java.util.Scanner;

public class BookDelete extends DBConnection{
	Scanner scan = new Scanner(System.in);
	
	
	public BookDelete() {}
	
	public void start() {
		try {
			System.out.print("삭제할 책이름 : ");
			String bookname = scan.nextLine();
			getConnection();
			sql = "delete from lmp where bookname=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  bookname);
			
			int result = pstmt.executeUpdate();
			if(result>0) {//삭제된 경우
				System.out.println(bookname+"책 정보가 삭제되었습니다.\n");
			}else {//삭제된 레코드가 없을때
				System.out.println("삭제정보가 없습니다.\n");
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}

}
