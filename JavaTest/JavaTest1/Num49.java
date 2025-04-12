package JavaTest1;

import java.util.ArrayList;
import java.util.List;

public class Num49 {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Tech");
		arrayList.add("Expert");
		arrayList.set(0, "Java");
		arrayList.forEach(a -> a.concat("Forum"));
		arrayList.replaceAll(s -> s.concat("Group"));
		System.out.println(arrayList);
	}
}

/*
선택한 오답: C) [JavaForumGroup, ExpertForumGroup]
정답: B) [JavaGroup, ExpertGroup]

이유: forEach의 경우는 순회만 할뿐 객체의 내용을 수정하지 않습니다.
그러므로 Forum을 concat한 것은 적용되지 않습니다.
*/