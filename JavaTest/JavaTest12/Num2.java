package JavaTest12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Num2 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		List<String> list2 = Collections.unmodifiableList(list1);
		list1.add("C");
		System.out.println(list1);
		System.out.println(list2);
	}
}

/*

선택한 오답: C) ["A","B","C"]
			 ["A","B","C"]
정답: A) [A, B, C]
		System.out.println(list2);에서 예외발생
실제 정답: C) ["A","B","C"]
			["A","B","C"]

이유: Collections.unmodifiableList(list1)은 읽기전용 리스트를 전달해주는 역할을 한다고합니다.
그래서 list1에 ["A","B","C"]가 전달되며
이는 list2에도 반영되며 두개다 똑같은 유형의 리스트를 띄우게됩니다.
하지만 여기 정답에서는 예외가발생한다고 되어있지만 예전 Java Test4 때의 정답 및 GPT도 C)가 정답이라고 명시되어있습니다.
*/