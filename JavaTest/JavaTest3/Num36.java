package JavaTest3;

import java.util.List;
import java.util.function.UnaryOperator;

public class Num36 {
	public static void main(String[] args) {
		var list = List.of(1,2,3,4,5,6,7,8,9,10);
		UnaryOperator<Integer> u = 1 -> 1 * 2;
		list.replaceAll(u);
	}
}

/*

선택한 오답: D) UnaryOperator<Integer> u = i -> { return 1 * 2; );
정답: B) UnaryOperator<Integer> u = (var i) -> (i * 2);

이유: 람다 자체 공식 자체에서는 -> 로들어오는 변수에 대해서 매개변수가 엄격하다고 적혀있습니다.
그러므로 var를 통해서 매개변수에 대해서 처리를 해야합니다.
또한 앞의 매개변수에 대해서 매개변수가 있으면 ()를 감싸야하며, 매개변수가 없거나, 2개이상이어도 ()를 감싸야한다고합니다.
*/