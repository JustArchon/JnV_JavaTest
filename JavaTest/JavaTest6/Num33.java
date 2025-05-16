package JavaTest6;

import java.io.FileInputStream;
import java.util.Properties;

public class Num33 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/resources/Message.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("welcome1"));
		System.out.println(prop.getProperty("welcome2", "Test")); // line 1
		System.out.println(prop.getProperty("welcome3"));
	}
}

/*
/resources/Message.properties 에 이렇게정의되어있다.
welcome1 = "Good day!"

선택한 오답: B) Good day!
			 followed by an Exception stack trace
정답: C) Good day!
		Test
		Null

이유: getProperty는 값이 없을 경우 defaultValue를 설정했을경우 defaultValue를 반환한다고합니다.
그래서 첫번째는 Good day!, 두번째는 값이 없지만 defaultValue를 설정했으므로 "Test"
3번째는 null이 반환됩니다. 예외가발생하는 상황이라면 .length()등의 메소드가 사용되어야 한다고합니다.
*/