package JavaTest3;

import java.util.Arrays;

public class Num10 {
	public static void main(String[] args) {
		int[] secA = { 2,4,6,8,10 };
		int[] secB = { 2,4,8,6,10 };
		int res1 = Arrays.mismatch(secA, secB);
		int res2 = Arrays.compare(secA, secB);
		System.out.println(res1 + " : " + res2);
	}
}

/*
선택한 오답: C) 2 : 3
정답: B) 2 : -1

이유: mismatch, compare의 동작 원리는 mismatch는 배열을 비교 후, 첫번째로 다른 배열의 인덱스를 반환합니다.
compare는 비교하면서 A - B중 B가 크면 -1을 반환하며, A가 크면 1 둘이 같으면 0을 반환합니다.
mismatch는 3번째가 다르므로 2가나오고
그러므로 6 - 8 결과는 B가 크므로 2 : -1이 정답입니다.
*/