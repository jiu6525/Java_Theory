import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollection {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	
	public LottoCollection() {}
	
	public void gameStart() {
		do {
			int cnt = gameCount();
			for(int i=1; i<=cnt; i++) {
				System.out.print(i+"게임");
				createLotto();
			}
			if(!endQuestion()){
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
		}while(true);
	}
	
//	번호생성
	public void createLotto() {
//		번호 6개와 마지막 생성된 번호가 보너스 번호 1개를 생성
//		정렬, 중복검사 -> TreeSet
		TreeSet<Integer> ts = new TreeSet<>();
		
		int ran;
		while(true) {
			ran = random.nextInt(45)+1; //난수생성 - 마지막생성번호
			ts.add(ran); //TreeSet에 추가
			if(ts.size()==7) { //7개가 되면 난수 생성중지 5,6,7,8,9,10,11
				
				break;
			}
			//마지막 생성번호 ran이 가지고 있다.
		}
		ts.remove(ran);	//보너스번호 TreeSet에서 지운다.
		
		System.out.print(ts.toString());	//[3,5,8,12,24,25]
		System.out.println(", bonus=" + ran);
	}
//	게임수 입력
//	계속여부확인

//	게임수 입력
	public int gameCount() {
		do{
			try {
			System.out.println("게임수->");
			String cntString = scan.nextLine();
			int cnt = Integer.parseInt(cntString);// 1~10, -58, o9
			
//			게임수의 최대, 최소값 범위확인
			if(cnt>=1 && cnt<=10) {	//정상게임수
				return cnt;
			}else {	//게임수 범위 벗어남
				System.out.println("게임수는 1~10까지만 가능합니다.");
			}
			}catch(NumberFormatException nnf) {
				System.out.println("게임수는 숫자이여야 합니다.");
			}
			}while(true);
		
	}
//	계속 여부확인
	public boolean endQuestion() {
//		y, Y : 예
//		n, N : 아니오
//		그외 : 다시질문
		do {
			System.out.println("계속하시겠습니까(y or Y:예, n or N: 아니오)?");
			String yn = scan.nextLine();
//			equals() -> 대소문자 구별
//			equlasIngnoreCase() -> 대소문자 구별안한다.
			if(yn.equalsIgnoreCase("Y")) { //계속한다.
				return true;
			}else if(yn.equalsIgnoreCase("N")) { //그만하겠다.
				return false;
			}
		}while(true);
		
	}
	public static void main(String[] args) {
		LottoCollection lotto = new LottoCollection();
		lotto.gameStart();
	}

}
