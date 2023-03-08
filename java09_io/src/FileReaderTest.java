import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public FileReaderTest() {
		
		try {
//			파일의 문자를 읽어 콘솔(줄단위) 출력
			File file = new File("C://java_test","CalendarTest.java");
			FileReader fr = new FileReader(file); //문자단위 읽기
			BufferedReader br = new BufferedReader(fr);
	
			while(true) {	//BufferedReader 객체에서 1줄씩 읽어 콘솔에 출력
				String line = br.readLine();
				if(line == null) {// line의 값이 null이면 EOF(end of file : 파일의 끝) 이다
					break;
				}
				System.out.println(line);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ie) {
			ie.printStackTrace();
		}
		System.out.println("The End....");
	}

	public static void main(String[] args) {
		new FileReaderTest();

	}

}
