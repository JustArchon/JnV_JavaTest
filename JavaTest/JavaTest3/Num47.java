package JavaTest3;

interface Pastry{
	void getIngredients();
}
abstract class Cookie implements Pastry {}

class ChocolateCookie implements Cookie {
	public void getIngredients() {}
}

class CoconutChocolateCookie extends ChocolateCookie {
	void getIngredients(int x) {}
}

public class Num47 {
	public static void main(String[] args) {}
}

/*

선택한 오답: B) 컴파일오류가 난다. 라인5에서
정답: C) 라인 7에서 컴파일 오류가난다.

이유: ChocolateCookie implements Cookie에서 컴파일 오류가 나는 이유는, 
abstract class Cookie가 interface가 아닌 abstract이기때문입니다.
abstract는 extends 로 받아야 오류가 나지않습니다.
*/