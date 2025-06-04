package JavaTest9;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Num25 {
	public static void main(String[] args) {
		List<Integer> codes = Arrays.asList(10,20);
		UnaryOperator<Double> uo = s -> s + 10.0;
		codes.replaceAll(uo);
		codes.forEach(c -> System.out.println(c));
	}
}

/*

선택한 오답: A) 20.0
			 30.0
정답: C) 컴파일 오류

이유: UnaryOperator는 Double 형식이었으며, 여기에 Integer를 대입할려고 했기때문에 컴파일 에러가 발생합니다.
*/