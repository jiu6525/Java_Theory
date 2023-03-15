import java.util.Scanner;

public class BookUpdate extends DBConnection{
	public BookUpdate() {}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("수정할 책번호->");
			int bn = Integer.parseInt(scan.nextLine());
			
			System.out.print("책 제목 : ");
			String bookname = scan.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = scan.nextLine();
			
			System.out.print("저자명 : ");
			String autor = scan.nextLine();
			
			System.out.print("가격->");
			int price = Integer.parseInt(scan.nextLine());
			
			System.out.print("구매일(예:1999-10-20)->");
			String dop = scan.nextLine();

			getConnection();
			
			sql="update lmp set bookname=?, publisher=?, autor=?, price=?, dop=? where bn=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bookname);
			pstmt.setString(2, publisher);
			pstmt.setString(3,  autor);
			pstmt.setInt(4, price);
			pstmt.setString(5, dop);
			pstmt.setInt(6,  bn);
			
			int result = pstmt.executeUpdate();

			
			if(result>0) {
				System.out.println(bn+" 책의 정보가 수정되었습니다.");
			}else {
				System.out.println("책정보가 수정되지 않았습니다.");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
	
	}
}

