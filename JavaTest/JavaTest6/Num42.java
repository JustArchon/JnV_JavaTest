package JavaTest6;

import java.util.Arrays;
import java.util.List;

public class Num42 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10, 20);
		List<Integer> list2 = Arrays.asList(15, 30);
		// line n1
	}
}

/*
Which code fragment, when inserted at line n1, prints 10 20 15 30?
// line n1 자리에 어떤 코드를 넣어야 다음과 같은 출력이 되나요? 10 20 15 30

선택한 오답: B) Stream.of(list1, list2).flatMap(list -> list.intStream())
				.forEach(s -> System.out.print(s = " "));
정답: A) Stream.of(list1, list2).flatMap(list -> list.stream())
			.forEach(s -> System.out.print(s = " "));

이유: intStream()은 List<Integer>에 존재하지 않는다고합니다. intStream()은 IntStream에 존재하는 메소드이며
List에는 .stream을 써야한다고합니다.
*/