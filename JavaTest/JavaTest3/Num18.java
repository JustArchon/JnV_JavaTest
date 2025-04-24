package JavaTest3;

import java.util.Iterator;
import java.util.List;

public class Num18 {
	public static void main(String[] args) {
		Iterator iter = List.of(1,2,3).iterator();
		while(iter.hasNext()) {
			foo(iter.next());
		}
		Iterator iter2 = List.of(1, 2, 3).iterator();
		while (iter.hasNext()) {
			bar(iter2.next());
		}
	}
	for (Iterator iter = List.of(1, 2, 3).iterator(); iter.hasNext();) {
		foo(iter.next());
	}
	for (Iterator iter2 = List.of(1, 2, 3).iterator(); iter.hasNext();) {
		bar(iter.next());
	}
}

/*
문제 Which loop incurs a compile time error?
어떤 반복문이 컴파일 시점에 오류를 유발하는가?"

선택한 오답: C) the loop starting line 16
정답: D) the loop starting line 19

이유: for (Iterator iter = List.of(1, 2, 3).iterator(); iter.hasNext();)
첫 번째 for에서 이미 iter를 참조하고 있습니다. 하지만,
두 번째에서
for (Iterator iter2 = List.of(1, 2, 3).iterator(); iter.hasNext();)
iter를 다시 재 참조하고있기때문에 19번째 줄에서 오류가 발생합니다.

incurs = 시점
foo, bar = java 프로그래밍에서 임시로 자주쓰는 임시 이름 한국의 x,y,z a,b,c 같은것
*/