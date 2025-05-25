package JavaTest7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Num45 {
	public static void main(String[] args) {
		Stream<List<String>> iStr = Stream.of(Arrays.asList("1", "John"), Arrays.asList("2", null));
		Stream<String> nInSt = iStr.flatMap((x) -> x.stream());
		nInSt.forEach(System.out::print);
	}
}

/*

선택한 오답: B) 12
정답: D) 컴파일에러
실제 정답 추정: A) 1John2null

이유: 실제 코드를 작성해본 결과, 컴파일 오류가발생하지 않습니다. 하지만 12가 틀린이유는 우선 두번째 요소를 무시했을경우이며,
전부 출력이되야하기때문에 1John2null이 실제 정답으로 추정됩니다.

*/
