package JavaTest8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;

public class Num15 {
	public static void main(String[] args) {
		Map<Integer, String> unsortMap = new HashMap<>();
		unsortMap.put(10, "z");
		unsortMap.put(5, "b");
		unsortMap.put(1, "d");
		unsortMap.put(7, "e");
		unsortMap.put(50, "j");
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(
			(o1, o2) -> o2.compareTo(o1));
		treeMap.putAll(unsortMap);
		for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}
	}
}

/*

선택한 오답: B) d b e z j
정답: C) j z e b d

이유: new TreeMap<Integer, String>((o1, o2) -> o2.compareTo(o1)); 에서 compareTo는 사실 o1.compareTo(o2)이런식으로 해야 오름차순이된다고합니다.
하지만 여기서는 o2.compareTo(o1)이므로 내림차순이 되므로 C가 정답입니다.
*/