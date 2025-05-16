package JavaTest6;

import java.util.Map;
import java.util.TreeMap;

public class Num28 {
	public static void main(String[] args) {
		Map<Integer, String> books = new TreeMap<>();
		books.put(1007, "A");
		books.put(1002, "C");
		books.put(1003, "B");
		books.put(1003, "B");
		System.out.println(books);
	}
}

/*

선택한 오답: B) {1007=A, 1003=B, 1003=B, 1002=C}
정답: D) {1002=C, 1003=B, 1007=A}

이유: Treemap은 중복 키를 허용하지않는다고합니다. 그러므로 자동적으로 오름차순으로 정렬이되는만큼
D) {1002=C, 1003=B, 1007=A}가 정답입니다.
*/