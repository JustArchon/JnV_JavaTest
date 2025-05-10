package JavaTest5;

import java.util.Arrays;
import java.util.List;

public class Num44 {
	public static void main(String[] args) {
		List<Integer> prices = Arrays.asList(3, 4, 5);
		prices.stream()
			.filter(e -> e > 4)
			.peek(e -> System.out.println("Price " + e))	   // line n1
			.map(n -> n - 1)								   // line n2
			.peek(n -> System.out.println(" New Price " + n)); // line n3
	}
}

/*
Which modification enables the code to print Price 5 New Price 4?
어떻게 수정해야 "Price 5" 와 " New Price 4" 가 출력되게 할 수 있는가?

선택한 오답: B) Replace line n2 with .mapToInt(n -> n -1)
정답: D) Replace line n3 with .forEach(n -> system.out.print(" New Price " + n));

이유: 오답의 map to Int는 중간 연산자를 수정하는 것이며, 마지막 n3 라인의 peek은 중간연산하며 결과값을 반환하지 않습니다.
그러므로 forEach를 통한 print를 출력시켜야됩니다. 즉 D가정답입니다.
*/