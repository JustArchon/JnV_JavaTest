package JavaTest6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Num20 {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10, 20, 30);
		Function<Integer, Integer> fn = f1 -> f1+f1;
		Consumer<Integer> conVal = s -> System.out.print("Val:" + s + " ");
		li.stream().map(fn).forEach(conVal);
	}
}

/*

선택한 오답: C) 컴파일 에러가발생한다.
정답: A) Val:20 Val:40 Val:60

이유: Consumer가 반환값이 없는것은 맞지만, System.out.print는 반환이아닌 소비의 행동 중 하나일수 있다는 점에서 정상적으로 표시된다고합니다.
*/