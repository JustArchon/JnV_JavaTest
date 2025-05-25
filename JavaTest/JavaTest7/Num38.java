package JavaTest7;

import java.util.Locale;
import java.util.ResourceBundle;

public class Num38 {
	public static void main(String[] args) {
		Locale currentLocale;
		// line 1
		ResourceBundle messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
		System.out.println(message.getString("inquiry"));
	}
}

/*
MessageBundle.properties
inquiry = How are you?

MessageBundle_de_DE.properties file:
inquiry = Wie geht's?


문제: 2개의 코드 블럭 중 라인1에 삽입했을시 "Wie geht's?"를 프린트할 코드는?

선택한 오답: A) currentLocale = new Locale("de", "DE");
		  D) currentLocale = new Locale();
		  	 currentLocale.setLanguage("de");
		  	 currentLocale.setRegion("DE");
정답: A) currentLocale = new Locale("de", "DE");
	 B) currentLocale = new Locale.Builder().setLanguage("de").setRegion("DE").build()

이유: Locale의 경우는 불변이며, setLanguage, setRegion이 존재하지 않는다고합니다.
그러므로 new Locale을 생성하면서 언어를 설정해야한다고합니다. 또한 기본적은 ("","")방식외에 Builder패턴을 통해서도 이전의 언어, 국가에대해서 set을통해서 설정할수있다고합니다.

*/
