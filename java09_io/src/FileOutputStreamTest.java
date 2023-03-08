import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public FileOutputStreamTest() {
//		FileOutputStream : byte 단위로 파일로 쓰기
		try {
//			파일이 존재하지 않으면 파일이 생성되고
//			파일이 존재하면 기본파일을 덮어쓰기 한다.
			File file = new File("c://java_test","my_data.txt");
			
			FileOutputStream fos = new FileOutputStream(file);
			String [] inData = {"자바에서 문자열을\n","파일로 쓰기 연습중\n","FileOutputStream객체 활용함."};
			
			for(String data : inData) {
//				문자열 -> byte배열
				fos.write(data.getBytes());
			}
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileOutputStreamTest();

	}

}
