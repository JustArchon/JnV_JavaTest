package JavaTest5;

import java.util.Map;
import java.util.TreeMap;

public class Num25 {
	public static void main(String[] args) {
		Map<Integer, String> books = new TreeMap<>();
		books.put(1007, "A");
		books.put(1002, "C");
		books.put(1001, "B");
		books.put(1003, "B");
		System.out.println(books);
	}
}

/*
선택한 오답: A) {1007 = A, 1002=C, 1001=B, 1003=B}
정답: B) {1001=B, 1002=C, 1003=B, 1007=A}

이유: TreeMap에서는 삽입시 자동으로 sort가 진행된다고합니다. 그러므로 정렬된 형태인 B가 정답입니다.
*/