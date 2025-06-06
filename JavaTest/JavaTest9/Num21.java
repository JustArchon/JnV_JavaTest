package JavaTest9;

import java.util.List;

public class Num21 {
	public static void main(String[] args) {
		var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		// line 1
		StringBuilder sb = new StringBuilder();
		for (int a : numbers) {
			sb.append(f.apply(a));
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}

/*

선택한 오답: B) Function<Integer> f = n -> n * 2;
정답: A) Function<Integer, Integer> f = n -> n * 2;

이유: Function은 <T, R> 2개의 인자를 사용한다고합니다. 입력, 출력의 타입을 어떤것으로 지정할 것이냐이며, 여기서 틀린점은
출력인자를 정하지 않았단 것이며, B가 정답이아닌 A가 정답이라고 합니다. 또한 원시타입인 int 또한 정답이아니며
클래스 타입인 Integer를 사용해야한다고 합니다.
*/