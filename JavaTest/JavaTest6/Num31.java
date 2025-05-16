package JavaTest6;

public final class IceCream{
	public void prepare() {}
}

public class Cake {
	public final void bake(int min, int temp) {}
	public void mix() {}
}

public class Shop {
	private Cake c = new Cake();
	private final double discount = 0.25;
	public void makeReady() { c.bake(10, 120);
}
	
public class Bread extends Cake {
	public void bake(int minutes, int temprature) {}
	public void addTopping() {}
}

public class Num31 {
	public static void main(String[] args) {
	}
}

/*

선택한 오답: B) cake 클래스가 컴파일오류가 뜬다.
정답: D) Bread 클래스가 컴파일 오류가뜬다.

이유: Cake의 final method는 오버라이드가 될 수 없다고 합니다.
*/