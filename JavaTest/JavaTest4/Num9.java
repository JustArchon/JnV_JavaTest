package JavaTest4;

public class Num9 {
	public void analyze(Object[] o) {
		System.out.println("I am an object array.");
	}
	public void analyze(long[] l) {
		System.out.println("I am an array.");
	}
	public void analyze(Object o) {
		System.out.println("I am an object.");
	}
	public static void main(String[] args) {
		int[] nums = new int[10];
		new Num9().analyze(nums);		// line 1
	}
}

/*
선택한 오답: D) line1에서 에러발생후 컴파일실패
정답: A) I am an object.

이유: int[] nums라는 배열 자체는 기본형 int의 배열이라고합니다.
Object[] o가 아닌 이유는 Object[]는 참조형 배열이며, 자바는 int의 배열을 Object로 판단합니다.
그래서 I am an object. 가 정답입니다.
*/