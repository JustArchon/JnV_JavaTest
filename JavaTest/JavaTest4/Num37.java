package JavaTest4;

import java.util.List;

public class Num37 {
	public static void main(String[] args) {
		List<Integer> even = List.of();
		even.add(0, -1);
		even.add(0, -2);
		even.add(0, -3);
		System.out.println(even);
	}
}

/*
선택한 오답: A) 컴파일 오류
정답: D) 런타임 예외 발생

이유: List.of()는 불변 리스트를 전달합니다. 그에따라서 add, remove 등을 사용할 수 없으며,
이 코드는 UnsupportedOperationException이라는 런타임 예외를 발생시킨다고합니다.
*/