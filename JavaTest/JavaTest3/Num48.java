package JavaTest3;

public class Num48 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ABCD");
	}
}

/*
문제: 어떻게 해야 sb를 "OBCD"로 바꿀수있는가?
선택한 오답: C) sb.replace(sb.indexOf("A"), sb.indexOf("A"), "O");
정답: B) sb.replace(sb.indexOf("A"), sb.indexOf("B"), "O");

이유: sb.replace은 StringBuilder.replace(int start, int end, String str)이런 구조이며 start, end 의 값을 받아서 그 사이의 공간을 str로 대체합니다.
오답처럼 A,A를 지정시 그 앞에 추가되는 형태로 OABCD형태로 되어버리며
OBCD로 바꾸고자한다면
indexof를 A, B형태로 해야 A의 공간에 O로 대체됩니다.
*/