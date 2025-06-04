package JavaTest9;

import java.util.HashMap;
import java.util.Map;

public class Num11 {
	public static void main(String[] args) {
		Map<Integer, Integer> mVal = new HashMap<>();
		mVal.put(1, 10);
		mVal.put(2, 20);
		// line n1
		c.accept(1, 2);
		mVal.forEach(c);
	}
}

/*

선택한 오답: C) BiConsumer<Integer, Integer, String> c = 
				(i, j) -> { System.out.print(i + ", " + j + "; "); };
정답: A) BiConsumer<Integer, Integer> c = 
				(i, j) -> { System.out.print(i + ", " + j + "; "); };

이유: BiConsumer는 애초에 BiConsumer<T, U>로서 제너릭 값을 두개만 필요하다고합니다. 이에따라서 3개의 인자가 들어올수없다고합니다.
*/