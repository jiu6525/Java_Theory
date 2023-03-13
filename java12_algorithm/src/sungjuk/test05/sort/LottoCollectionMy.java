package test05.sort;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollectionMy {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	
	public LottoCollectionMy() {}
	
	public void gameStart() {
		do {
			int cnt = gameCount();
			for(int i=1; i<=cnt; i++) {
				System.out.print(i+"게임 ");
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
//		컬렉션 사용불가
//		api정렬메소드 사용불가
//		TreeSet<Integer> ts = new TreeSet<>();
		int lo[];
		int bonus = 0;
		int ran;
		
		ran = random.nextInt(45)+1; //난수생성 - 마지막생성번호
		lo = new int[6];
		for(int i=0;i<=lo.length;i++) {
			if(i==lo.length) {
				bonus = ran;
			}else {
				lo[i] = ran;
			}
		}
		check(lo,bonus);
	}
	
//	중복검사
	public void check(int lo[], int bonus) {
		int t = 1;
		while(t>0) {
			int num1 = Math.abs(random.nextInt(45))+1;
			for (int i = 0; i < lo.length; i++) {
	            for (int j = 0; j < i; j++) {
	                if (lo[i]==(lo[j])) {  
	                	lo[j] = num1;
	                	t++;
	                }
	            }
	        if(lo[i] == bonus) {
	        	bonus = num1;
	        	t++;
	       }
	       }
			t--;	
		}
		last1(lo,bonus);
	}
		
//	정렬
	public void last1(int lo[],int bonus) {

		for(int j =0; j<lo.length-1;j++) {
			for(int i =0;i<lo.length-1-j;i++) {
				if(lo[i]>lo[i+1]) {
					int temp = lo[i];
					lo[i] = lo[i+1];
					lo[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(lo) + " " + " bonus : " + bonus);
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
		LottoCollectionMy lotto = new LottoCollectionMy();
		lotto.gameStart();
	}

}
