package JavaTest5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Num11 {
	public static void main(String[] args) {
		Map<Integer, String> unsortMap = new HashMap<>();
		unsortMap.put(10,"z");
		unsortMap.put(5,"b");
		unsortMap.put(1,"d");
		unsortMap.put(7,"e");
		unsortMap.put(50,"j");
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(new Comparator<Integer>() {
			@Override
			public int compare (Integer o1, Integer o2) { return o2.compareTo(o1);}
		});
		treeMap.putAll(unsortMap);
		for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getValue() + " ");
		}
	}
}

/*

선택한 오답: B) d b e z j
정답: C) j z e b d

이유: Comparator<Integer> 선언 과정에서 return o2.compareTo(o1); 를 작성했고, 이는 내림차순 정렬을 의미합니다.
그러므로 C가 정답입니다.
*/