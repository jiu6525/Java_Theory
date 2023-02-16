
public class ContinueTest {

	public static void main(String[] args) {
		// continue : 반복문내에서 continue를 만나면
		//            continue 다음의 실행문을 건너띄기 한다.
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}
	}

}
