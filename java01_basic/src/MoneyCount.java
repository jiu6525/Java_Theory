import java.util.Scanner;

public class MoneyCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int money = 50000;//화폐중 제일 큰단위
		int div = 5; //다음 화폐를 구하기 위해서 필요한 값
		
		System.out.print("금액입력=");
		int won = scan.nextInt();
		
		while(won>0) {
			//화폐수
			int cnt = won / money;
			//출력
			if(cnt>0) {
				System.out.print(money+"원="+cnt);
				String lbl = "장";
				if(money<=500) {
					lbl = "개";
				}
				System.out.println(lbl);
			}
			//계산한 금액 빼주기
			won -= money*cnt;
			//다음화폐만들기
			money /= div;
			//다음화폐나눌값 변경 5->2, 2->5
			if(div==5)
				div = 2;
			else
				div = 5;
			//     div = (div==5)?2:5;			
		}//while
		
	}

}
