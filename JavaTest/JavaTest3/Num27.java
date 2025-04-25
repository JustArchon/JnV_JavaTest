package JavaTest3;

import java.util.ArrayList;
import java.util.List;

public class Num27 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		List<String> list2 = List.copyOf(list1);
		list2.add("C");
		List<List<String>> list3 = List.of(list1, list2);
		System.out.println(list3);
	}
}

/*
선택한 오답: C) [[A, B], [A, B, C]]
정답: B) 런타임 도중 예외발생
컴파일 결과: java.lang.UnsupportedOperationException

이유: List.copyOf는 불변의 List를 반환합니다. 이에따라서 ArrayList의 기능인 add등을 사용할수없습니다.
ArrayList식으로 하고자한다면
List<String> list = new ArrayList<>(List.of("A", "B", "C"));
등 처럼 new ArrayList<>로 감싸야합니다.
*/