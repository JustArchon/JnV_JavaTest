package JavaTest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num41 {
	public static void main(String[] args) {
		String[] arr = { "Hi", "How", "Are", "You" };
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		if (arrList.removeIf(s -> {System.out.println(s); return s.length() <= 2;})) {
			System.out.println(" removed.");
		}
	}
}

/*
선택한 오답: A) 컴파일 실패
정답: C) HiHowAreYou removed

이유: {System.out.println(s);
	  return s.length() <= 2;}
	람다에 적혀진 코드를 추적해보면 우선적으로 배열내의 내용을 전부 출력하게되어있습니다. 그리고 제거 프로세스의경우는
	return에서만 판단합니다 이과정에서 Hi가 삭제되었고 true를 반환하게됩니다.
	그래서 removed 프린트가 호출되었으며 hihowareyou를 전부출력후 hi를 최종적으로는 삭제햇기때문에 removed가 추가되어 표시됩니다.
*/