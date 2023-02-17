import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
//		Random 클래스 : 난수를 구한다.
		Random ran = new Random();
		
//		nextInt() : int범위의 수중 1개를 무작위로 얻어온다.
		for(int i=1; i<=100; i++) {
			int num = Math.abs(ran.nextInt(11))+10;
			System.out.print(num+"\t");
			if(i%10==0) System.out.println();
		}

//		System.out.println("==================================");
//		for(int i=1; i<=100; i++) {
//			boolean boo = ran.nextBoolean();  //true, false
//			System.out.print(boo+"\t");
//			if(i%10==0) System.out.println();
//		}
	}

}
