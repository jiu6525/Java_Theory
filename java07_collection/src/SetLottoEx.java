import java.util.Scanner;
import java.util.TreeSet;


public class SetLottoEx {
	Scanner scan = new Scanner(System.in);
	public SetLottoEx() {}
	public int getNum() {
		System.out.println("게임수 = ");
		int num = scan.nextInt();
		return num;
	}
	
	
	public void getLast() {
		System.out.println("계속하시겠습니까(1:예, 2:아니요)? : ");
		
		int con = scan.nextInt();
		if(con==2) {
			System.exit(0);
		}
	}
	
	
	
	public void SetLotto() {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		SetLottoEx s = new SetLottoEx();
		
		int num ;
		int bonus = 0;
		while (true) {
			int c = s.getNum();
			
			for(int i=0;i<c;i++) {
				while (lotto.size() < 7) {  
					num = (int) (Math.random() * 45 + 1);
					
					if(lotto.size()==6) {
						bonus = num;
						lotto.remove(bonus);
						break;
					}else {
						lotto.add(num);
					}
					
				}
				System.out.println("로또 : "+lotto+","+" bonus = " + bonus);
				lotto.removeAll(lotto);
			}
			s.getLast();
			}
	}

}
