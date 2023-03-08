import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
//		File : 하드디스크, USB등 메모리의 드라이브, 폴더, 파일을 처리할 수 있는 객체 

//		File 객체 생성하기
		File f1 = new File("c://java_test");	//C:\java_test			제어문자 : \n,\t, \", \'....
		File f2 = new File("c://java_test/CalendarTest.java");
		File f3 = new File(f1,"CalendarTest.java");
		File f4 = new File("c://java_test","CalendarTest.java");
		// mkdir()	: 하위에 디렉토리가 없을 폴더 생성 (폴더가 있어야 하위도 생성)	
		// mkdirs()	: 하위 디렐토리까지 폴더 생성(폴더가 없어도 하위 디렐토리까지 생성)
		// isDirectory() : 디렉토리인지 파일인지
		// exists() : 디렉토리 또는 파일이 존재하는지 있으면, true, 없으면 false
		File f5 = new File("c://sample3");	
		File f6 = new File("c://sample4/folder"); 
		
		f5.mkdir();
		f6.mkdirs();
		
//		파일
		File f7 = new File(f5, "dddd.txt");
		try {
			boolean result = f7.createNewFile();
			if(result) {
				System.out.println("파일생성됨");
			}else {
				System.out.println("파일생성 실패");
			}
//			마지막 수정일
//			마지막 수정일을 밀리초로 구해준다.
//			1970 01 01 00 00 00 0
//								1000
//								2000
//			2023				1672800246503
			long lastSave = f2.lastModified();
			System.out.println(lastSave);
			
//			밀리초로 Calendar 객체 만들기
			Calendar dateTime = Calendar.getInstance();
			dateTime.setTimeInMillis(lastSave);
			
//			2023-01-04 오전 11:44
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-mm-dd a HH:MM");
			String dateStr = fmt.format(dateTime.getTime());
			System.out.println("마지막 수정일 -> " + dateStr);
			
//			특정위치(드라이브, 폴더)
			File f8 = new File("C:\\");
			File[] fileList = f8.listFiles();
			for(File f9 : fileList) {
//				getPath() : 드라이브, 경로, 파일명
//				getName() : 파일명
//				getAbsolutePath() : 드라이브, 경로, 파일명
//				getParent() : 드라이브, 경로
				
				if(f9.isDirectory()) {	//폴더
					if(f9.isHidden()) { //숨김폴더
						System.out.println(f9.getPath()+ " [숨김폴더]");
					}else {//폴더일때
						System.out.println(f9.getPath()+ " [폴더]");
					}
				}else {	//폴더가 아니고 파일일때
					if(f9.isHidden()) {
						System.out.println(f9.getPath()+ " [숨김파일]");
					}else {
						System.out.println(f9.getPath()+ " [파일]");
					}
				}
				
//				String pathFile = f9.getPath();
//				System.out.println(pathFile);
			}
			
//			현재 컴퓨터의 드라이브 목록
			File[] drive = File.listRoots();
			for(File f9 : drive) {
				System.out.println(f9.getPath());
			}
			
//			파일크기 (byte)
			System.out.println("파일크기 = " + f2.length());
			
//			파일삭제
			f7.delete();
			f5.delete();
//			폴더 삭제 : 폴더내에 파일이 없어야 한다...
			f6.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileTest();

	}

}
