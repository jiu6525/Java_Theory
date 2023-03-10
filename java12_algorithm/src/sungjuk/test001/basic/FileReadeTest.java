package test001.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadeTest {

	public FileReadeTest() {
		
	}

	public static void main(String[] args) throws FileNotFoundException {
//		파일의 내용을 InputStream 셋팅하기
		System.setIn(new FileInputStream("src/test001/basic/sungjuk.txt"));
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			String str = scan.nextLine();
			System.out.println(str);
		}
	}

}
