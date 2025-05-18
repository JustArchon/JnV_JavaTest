package JavaTest6;

import java.util.ArrayDeque;
import java.util.Deque;

public class Num47 {
	public static void main(String[] args) {
		Deque<Integer> nums = new ArrayDeque<>();
		nums.add(1000);
		nums.push(2000);
		nums.add(3000);
		nums.push(4000);
		Integer i1 = nums.remove();
		Integer i2 = nums.pop();
		System.out.println(i1 + " : " + i2);
	}
}

/*

선택한 오답: D) 1000 : 2000
정답: A) 4000 : 2000

이유: ArrayDeque는 스택과 큐를 동시에 흉내낼수있는 자료구조라하며 add의 경우는 큐의 뒤쪽, push는 큐의 앞쪽에 삽입된다고합니다.
여기서 remove는 큐의 앞쪽을 제거하며, pop은 스택처럼 앞쪽 요소를 제거했으며
i1은 remove한 앞쪽의 값, i2도 pop한 값을 보여주게되며 [4000, 2000, 1000, 3000] 의 큐값에서
4000 : 2000이 나오게됩니다.
*/