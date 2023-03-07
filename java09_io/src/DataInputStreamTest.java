import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamTest {

	public DataInputStreamTest() {
		try {
//		DataInputStream : 파일에서 원래 데이터형의 크기로 값을 읽어온다.
		
		FileInputStream fis = new FileInputStream("c://java_test/data.txt");
		DataInputStream dis = new DataInputStream(fis);
		
//		int, double, boolean, char
		int readInt = dis.readInt();
		double readDouble = dis.readDouble();
		boolean readBoolean = dis.readBoolean();
		char readChar = dis.readChar();
		
		System.out.printf("%d, %f, %b, %s\n ", readInt, readDouble, readBoolean, readChar);
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new DataInputStreamTest();

	}

}
