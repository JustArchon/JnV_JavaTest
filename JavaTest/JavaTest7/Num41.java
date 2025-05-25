package JavaTest7;

import java.util.Arrays;
import java.util.List;

public class Num41 {
	public static void main(String[] args) {
		List<String> cs = Arrays.asList("Java", "Java EE", "Java ME");
		// line n1
		System.out.print(b);
	}
}

/*
문제: n1 라인에 어떤 코드를 넣어야 false가 프린트되나요

선택한 오답: B) boolean b = cs.stream().anyMatch(w -> w.equals("Java"));
		  D) boolean b = cs.stream().allMatch(w -> w.equals("Java"));
정답: D) boolean b = cs.stream().allMatch(w -> w.equals("Java"));

이유: B)가 아닌 이유는 anyMatch의 경우는 하나라도 맞을경우 true를 반환하기때문에 모두 맞아야 true를 반환하는 D)가정답입니다.

*/
