package JavaTest10;

import java.util.List;
import java.util.Optional;

public class Num45 {
	public static void main(String[] args) {
		var fruits = List.of("apple", "orange", "banana", "lemon");
		Optional<String> result = fruits.stream().filter(f -> f.contains("n")).findAny(); // line 1
		System.out.println(result.get());
	}
}

/*

선택한 오답: A) The code will produce the same result
코드가 항상 같은 결과를 낼 것이다.
정답: D) The code may produce a different result.
코드가 다른 결과를 낼 수 있다.

이유: findAny()는 단순히 조건에 충족하는 아무거나를 찾아준다는 메소드라고합니다.
하지만 이번에 선언한 리스트에서는 ora'n'ge, ba'n'a'n'a, lemo'n' 3개가 여러개가 충족하므로
항상 같은 결과값을 낸다고 보장 할 수 없다고합니다.
*/