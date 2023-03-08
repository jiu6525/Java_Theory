import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {

	public FileCopyTest() {
//		File에서 File로 쓰기
//		읽을 파일객체
		File orgFile = new File("c://web_test/img","배경.jpg");
		File tarFile = new File("c://java_test/",orgFile.getName());
		
		try {
	
			FileInputStream fis = new FileInputStream(orgFile);
			FileOutputStream fos = new FileOutputStream(tarFile);
			
//			파일의 크기만큼 배열생성
			byte[] inData = new byte[(int)orgFile.length()];
			int cnt = fis.read(inData, 0, inData.length);
			System.out.println("읽어온 바이트 수 => " + cnt + "배열의 길이" + inData.length);
			
//		쓰기
			fos.write(inData, 0, cnt);
			fos.close();
			fis.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileCopyTest();

	}

}
