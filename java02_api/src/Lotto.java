import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int start = 1;
		while(start == 1) {
			System.out.println("게임수 = ");
			int number = scan.nextInt();
			
//			게임수 만큼 반복
			for(int k = 0; k<number;k++) {
				
		//		로또번호 리스트 생성
				int lo[] = new int[6];
				int bonus = 0;
				
				
		//		무작위 난수 6개 lo변수에 저장 마지막은 bonus에 저장
				for(int i=0; i<lo.length+1; i++) {
					int num1 = Math.abs(ran.nextInt(45))+1;
					if(i==lo.length) {
						bonus = num1;
					}else {
						lo[i] = num1;
					}
				}
				
		//		중복검사 t를 1로 설정하고 중복이 발생할 경우 검사횟수 추가
				int t = 1;
				while(t>0) {
					int num1 = Math.abs(ran.nextInt(45))+1;
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
				
				
			Arrays.sort(lo);
			System.out.println((k+1)+"게임 = "+Arrays.toString(lo)+", bonus = " + bonus);
			
			}
		System.out.println("계속하시겠습니까(1:예, 2:아니요)");
		start = scan.nextInt();
		}
	}

}
