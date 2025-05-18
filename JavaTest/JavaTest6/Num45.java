package JavaTest6;

import java.util.Locale;
import java.util.ResourceBundle;

public class Num45 {
	public void loadResourceBundle() {
		ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);
		System.out.println(resource.getObject(1));
	}
	public static void main(String[] args) {
		new Num45().loadResourceBundle();
	}
}

/*
Greetings.properties file에는 이렇게적혀있습니다.
HELLO_MSG = Hello, everyone!
GOODBYE_MSG = Goodbye everyone!

선택한 오답: C) Hello, everyone!
정답: A) 컴파일 실패

이유: ResourceBundle.getObject는 String 타입의 key를 받으며 ResourceBundle.getObject(1)은 int형태의 데이터를 넣었기때문에
오류가난다고합니다.
*/