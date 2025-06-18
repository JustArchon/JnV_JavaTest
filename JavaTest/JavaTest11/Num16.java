package JavaTest11;

import java.util.List;

public class Num16 {
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
정답: B) 런타임 예외

이유: List.of의 경우 불변 리스트를 반환하다보니 ArrayList와 다르게 add, remove등을 쓸수없습니다.
하지만 List<Integer>에서 ArrayList가들어올수도있고, List.of같은 불변리스트가 들어올수있기때문에 컴파일에서 막히지않지만,
현재 이문제는 불변리스트를 반환했기때문에 런타임 에러가 발생한다가 정답입니다.
*/