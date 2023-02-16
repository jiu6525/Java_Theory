
public class BreakTest {

	public static void main(String[] args) {
		// break : 반복문 다음 실행문으로 이동
		// 라벨을 만들어 원하는 반복문을 중지시킬수 있다.
		
		ggm:for(int i=1; ; i++) {
			System.out.println("i="+i);
			for(int j=1; ;j++) {
				System.out.println("j->"+j);
				if(j>=5) 
					break ggm;
			}
			/*--->
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			*/
		}
	}
}
