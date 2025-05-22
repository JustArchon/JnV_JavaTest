package JavaTest7;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

public class Num4 {
	public static void main(String[] args) {
		List<Double> doubles = Arrays.asList(100.12, 200.32);
		DoubleFunction funD = d -> d + 100.0;
		doubles.stream().forEach(funD); // line n1
		doubles.stream().forEach(e -> System.out.println(e)); // line n2
	}
}

/*

선택한 오답: A) 라인 n1에서 컴파일 에러
정답: D) 100.12
		200.32
이전 자바테스트 6차 정답
D) 라인 n1에서 컴파일 에러

이유: Java Test 6차 46번 문제의 기출문제입니다. 거기서 line n1컴파일 에러가 정답이었으며, 실제 컴파일러도 n1에서 컴파일에러가 납니다.
정답은 A가 맞는거같습니다.
*/