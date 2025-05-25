package JavaTest7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Num46 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
		Predicate<String> test = s -> {
			int i = 0;
			boolean result = s.contains("pen");
			System.out.print(i++ + ":");
			return result;
		};
		str.stream()
		   .filter(test)
		   .findFirst()
		   .ifPresent(System.out::print);
	}
}

/*

선택한 오답: B) 0:1:pen
정답: A) 0:0:pen

이유: test = s -> { 식의 람다 내부의 지역변수의 경우는 새로 만들어질떄마다 내부 지역변수가 초기화된다고합니다. 그래서 i++의 특징인 출력후 후 덧셈이 되다보니
0:0:pen이 표시됩니다.

*/
