import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public BufferedReaderTest() {
//		 BufferedReader : 콘솔에서 입력받은 값을 버퍼에 임시로 저장 후 한줄단위(enter 기준)로 읽어오는 기능이 있다.
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		try {
			String line = br.readLine(); //버퍼에서 1줄 읽어오기
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new BufferedReaderTest();

	}

}
