package JavaTest6;

interface Interface1 {
	public default void sayHi() {
		System.out.println("Hi Interface-1");
	}
}

interface Interface2 {
	public default void sayHi() {
		System.out.println("Hi Interface-2");
	}
}

public class Num10 implements Interface1, Interface2{
	public static void main(String[] args) {
		Interface1 obj = new Num10();
		obj.sayHi();
	}
	public void sayHi() {
		System.out.println("Hi my Class");
	}
}

/*

선택한 오답: B) 컴파일 오류
정답: D) Hi MyClass

이유: 중복된 인터페이스를 상속해도, 결국 sayHi()를 오버라이딩 했기때문에, 두 인터페이스 전부 재정의를 만족한다고합니다.
이에따라서 컴파일 문제가발생하지 않으며, Interface1을 생성자로썻지만 결국 Num10을 가리키고있기때문에 Num10.sayHi가 호출됩니다.
*/