package JavaTest8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Num5 {
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("red", "green", "yellow");
		Predicate<String> test = n -> {
			System.out.println("Searching...");
			return n.contains("red");
		};
		colors.stream()
			.filter(c -> c.length() > 3)
			.allMatch(test);
	}
}

/*

선택한 오답: B) Searching...
			 Searching...
정답: A) Searching...

이유: allMatch의 경우는 딱 한번만 검사 후에 조건중 하나라도 불일치시 그대로 검사를 종료한다고합니다. 또한 anyMatch또한 조건중 하나라도맞을경우 그대로 조건검사를 종료하는
특성상 Searching... 이 한번만 발생한다고합니다.
*/