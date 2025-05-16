package JavaTest6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Num32 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("win", "try", "best", "luck", "do");
		Predicate<String> test1 = w -> {
			System.out.println("Checking...");
			return w.equals("do");
		};
		Predicate test2 = (String w) -> w.length() > 3; // n2
		words.stream()
			.filter(test2)
			.filter(test1)
			.count();
	}
}

/*

선택한 오답: C) Checking...
			 Checking...
정답: D) n2라인에서 컴파일 에러가난다.

이유: Predicate는 raw type이므로 람다식에서 타입을 지정할수 없다고합니다. String w를 지정했으므로 n2에서 컴파일에러가납니다.
*/