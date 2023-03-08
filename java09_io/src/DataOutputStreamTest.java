import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public DataOutputStreamTest() {
//		DataOutputStream : 기본데이터형의 값을 해당 데이터형의 byte 만큼 확보하여 저장한다.
//		FileOutputStream fos;
		try {
			File file = new File("c://java_test","data.txt");
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			
			int dataInt = 5434;
			double dataDouble = 562.2358;
			boolean dataBoolean = true;
			char dataChar = 'Z';
			
			dos.writeInt(dataInt);
			dos.writeDouble(dataDouble);
			dos.writeBoolean(dataBoolean);
			dos.writeChar(dataChar);
			
			dos.close();
			fos.close();
			
			System.out.println("쓰기완료...");
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch (IOException ie) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
	}

	public static void main(String[] args) {
		new DataOutputStreamTest();

	}

}
