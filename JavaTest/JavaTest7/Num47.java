package JavaTest7;

public class Num47 {
	public static void main(String[] args) {}
}

/*
문제: Which two code blocks correctly initalize a Locale variable?

A) Locale loc1 = "UK";
B) Locale loc2 = Locale.getInstance("ru");
C) Locale loc3 = Locale.getLocaleFactory("RU");
D) Locale loc4 = Locale.UK;
E) Locale loc5 = new Locale("UK");

선택한 오답: C) Locale loc3 = Locale.getLocaleFactory("RU");, E) Locale loc5 = new Locale("UK");
정답: D) Locale loc4 = Locale.UK;, E) Locale loc5 = new Locale("UK");

이유: 오답으로 선택한 C에는 getLocaleFactory가 존재하지 않는다고합니다. D,E가정답인이유는
Locale내의 UK는 정적 상수로 정의되어있으며, new Locale(String language) 생성자도 실제로 존재하기때문에
D,E가 정답입니다.

*/
