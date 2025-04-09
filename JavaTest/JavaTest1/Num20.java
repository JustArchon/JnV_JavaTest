package JavaTest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num20 {
	public static void main(String[] args) {
		String[] arr = {"Hello", "How", "Are", "You", "Doing"};
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		if (list.removeIf((String s) => (return s.length() <= 3;))) {
			System.out.println(s + "removed");
		}
	}
}

/*
선택한 오답: B) How, Are, and You removed
정답: A) Compilation fails
컴파일 결과: 컴파일 에러

이유: asList로 만들어진 리스트는 크기가 불변으로 넘어오기때문에 remove 등이 지원되지 않습니다. 그러므로 컴파일에러가 정답입니다.
*/