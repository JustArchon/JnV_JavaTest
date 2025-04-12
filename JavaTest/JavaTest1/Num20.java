package JavaTest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num20 {
	public static void main(String[] args) {
		String[] arr = {"Hello", "How", "Are", "You", "Doing"};
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		if (list.removeIf((String s) -> (return s.length() <= 3;))) {
			System.out.println(s + "removed");
		}
	}
}

/*
선택한 오답: B) How, Are, and You removed
정답: A) Compilation fails
컴파일 결과: 컴파일 에러

이유: 람다 식에서 (return s.length() <= 3;) 이 부분이 중괄호로 감싸야 return이 작동된다고 합니다. 그 점을 수정해야 하며,
if안에서만 작동하는 String s는 외부에서 호출할수 없습니다 그러므로 print(s)를 람다식 안에서 표시해야합니다.
*/