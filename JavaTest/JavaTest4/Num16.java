package JavaTest4;

import java.util.List;

public class Num16 {
	public static void main(String[] args) {
		var fruits = List.of("apple","orange","banana","lemon");
	}
}

/*
You want to examine the first element that contains the character n. Which statement will accomplish this?
"문자 n을 포함하는 첫 번째 요소를 검사하고 싶습니다. 어떤 명령문(Statement)이 이를 수행할 수 있을까요?"

선택한 오답: B) fruits.stream().filter(f -> f.contains("n")).forEachOrdered(System.out::print);
정답: C) Optional<String> result = fruits.stream().filter(f->f.contains("n")).findFirst();

이유: 문제는 n을 포함하는 첫 번째 요소만을 검사한다고 했습니다. 오답의 경우는 forEachOrdered를 하므로 전체를 검사합니다.
C의 경우는 findFirst를 통해서 첫 번째 요소만을 검사하므로 C가 정답입니다.
*/