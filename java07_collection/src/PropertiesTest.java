import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public PropertiesTest() {
		// key와 value를 문자열로 만 처리하는 컬렉션이다.
		Properties pro = new Properties();
		
//		객체추가				key				value
		pro.setProperty("/seoul/index.do","/index.jsp");
		pro.setProperty("/test.do", "/board/boardList.jsp");
		pro.setProperty("1111", "AAAA");
		pro.setProperty("22222", "BBBB");	
	
//	key를 이용해서 값 얻어오기
	System.out.println("/test.do-->" + pro.getProperty("/test.do"));
	
//	getProperty(String key, String defaultValue)
//	key가 없으면 defaultValue로 결과가 얻어진다.
	System.out.println("/notic.do-->" + pro.getProperty("/notice.do","/error.jsp"));
	
//	모든 키목록 구하기
	Enumeration keyList = pro.propertyNames();
	while(keyList.hasMoreElements()) {	//객체가 있으면 true, 없으면 false
		String key = (String) keyList.nextElement();
		String value = pro.getProperty(key);
		System.out.println(key+"="+value);
	}
	}
	public static void main(String[] args) {
		new PropertiesTest();
	}

}
