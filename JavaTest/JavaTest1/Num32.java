package JavaTest1;

import java.util.ArrayList;

public class Num32 {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		points.remove(1);
		points.remove(null);
		System.out.println(points);
	}
}

/*
선택한 오답: A) A nullPointerException is thrown at runtime
정답: E) [1, 3, 4]

이유: ArrayList 자체에서는 null이라는 것 자체가 연산하거나 메서드를 호출 시, 널포인트 익셉션이 작동되는 것이라고합니다.
그러므로 ArrayList에서는 null이 추가되고 삭제되고 다 되므로, [1, 3, 4]가 정답입니다.
*/