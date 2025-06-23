package JavaTest11;

import java.util.function.Supplier;

public class Num6 {
	public static void main(String[] args) {
	}
	
	void myLambda() {
		int i = 1;
		Supplier<Integer> foo = () -> i;
		i++;
		System.out.println(foo.get());
	}
}

/*

선택한 오답: B) The code prints 1.
정답: C) 코드가 컴파일되지않는다.

이유: 람다식에서 내부적으로 참조하는 지역변수는 무조건 final이어야 한다고합니다. 하지만 i++가 되면서 final이아니게되었고,
이를 막기위해서는 i++ 제거 혹은 i를 인스턴스 변수로바꿔야한다고합니다.
그래서 C가 정답입니다.
*/