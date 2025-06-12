package JavaTest10;


public class Num28 {
}

/*
문제: Which two statements set the default locale used for formatting numbers, currency, and percentages? (Choose two.)
숫자, 통화, 백분율 형식 지정에 사용되는 기본 로케일(Locale) 을 설정하는 두 문장은 무엇인가요? (두 개 선택)

선택한 오답: A) Locale.setDefault(Locale.Category.FORMAT, "zh-CN");
		  B) Locale.setDefault(Locale.Category.FORMAT, Locale.CANADA_FRENCH);
정답: B) Locale.setDefault(Locale.Category.FORMAT, Locale.CANADA_FRENCH);
	 C) Locale.setDefault(Locale.SIMPLEIFIED_CHINESE);

이유: A가 틀린 이유는 "zh-CN"이게 Locale에 대한 설정이 아닌, String으로 인식이되다보니 작동되지 않는다고합니다.
그래서 Locale.Category.FORMAT에 대한 설정을 정하고 Locale.CANADA_FRENCH을 한것이 정답이고,
그다음에 Locale.SIMPLEIFIED_CHINESE는 전역에 대한 설정을 하는것이므로, C가 정답이라고 합니다.
*/