package JavaTest7;

import java.util.function.IntConsumer;

public class Num33 {
	public static void main(String[] args) {
		IntConsumer consumer = e -> System.out.println(e);
		Integer value = 90;
		/* insert code fragment here */
		consumer.accpet(result);
	}
}

/*

선택한 오답: A) Function<Integer> funRef = e -> e + 10;
			 Integer result = funRef.apply(value);
정답: C) ToIntFunction<Integer> funRef = e -> e + 10;
		int result = funRef.applyAsInt(value);

이유: 기존의 Function의 경우는 <입력타입, 출력타입> 이런식으로 2개를 적어야하며 A는 하나만적혀져있엇기때문에
ToIntFunction인 출력자가 정해져있는것을 사용해 IntConsumer에 맞춰야한다고합니다.

*/
