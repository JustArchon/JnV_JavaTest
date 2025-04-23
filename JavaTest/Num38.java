package JavaTest2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Num38 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			if(s == "C") {
				break;
			}
			else {
				continue;
				System.out.println(s);
			}
		}
	}
}

/*
문제: Which action enabled it to print AB?
번역) 어떤 동작이 AB를 출력하도록 만들었는가?
선택한 오답: A) Comment line 14 to 17
정답: C) Comment line 15.

이유: 문제에 모순이 조금있는 문제입니다. 문제가 왜? print AB가 진행되지 않았냐, 이런 식으로 해석하면
continue가 원인이 맞습니다. 하지만 문제는 어떤 동작이 AB를 출력하도록 만들었는가인데
continue는 println을 작동시키지않습니다.
*/