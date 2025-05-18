package JavaTest6;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

public class Num46 {
	public static void main(String[] args) {
		List<Double> doubles = Arrays.asList(100.12, 200.32);
		DoubleFunction funD = d -> d + 100.0;
		doubles.stream().forEach(funD); // line n1
		doubles.stream().forEach(e -> System.out.println(e));
	}
}

/*

선택한 오답: B) 200.12
			 300.32
정답: D) line n1에서 컴파일에러발생

이유: 이유는 DoubleFunction과 forEach()하고의 타입 불일치때문이라고 합니다. forEach는 내부적으로 Consumer<T>를 쓰기때문에
결국 DoubleFunction을 넣으면 타입에러가 나므로 Consumer<Double>을 쓰는게맞다고합니다.
*/