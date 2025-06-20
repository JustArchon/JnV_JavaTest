package JavaTest11;

interface Pastry {
	void getIngredients();
}

abstract class Cookie implements Pastry {}

class ChocolateCookie implements Cookie {
	public void getIngredients() {}
}

class CoconutChocolateCookie extends ChocolateCookie {
	void getIngredients(int x) {}
}

public class Num33 {
	public static void main(String[] args) {
	}
}

/*

선택한 오답: G) 컴파일 성공
정답: C) class ChocolateCookie implements Cookie 에서 컴파일 오류가발생한다.

이유: class ChocolateCookie implements Cookie에서 인터페이스를 상속하는 implements를 사용했지만,
Cookie 클래스는 abstract이므로 extends를 사용해야한다고합니다. 그래서 C가 정답입니다.
*/