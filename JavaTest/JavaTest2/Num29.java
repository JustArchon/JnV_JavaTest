package JavaTest2;


public class Num29 {
	public static void main(String[] args) {
		int[] numbers = {12,13,42,32,15,128,56,38,16};
		int[] keys = findMax(numbers);
	}
	
	/* line n1 */ {
		int[] keys = new int[3];
		/* code goes here */
		return keys;
	}
}

/*
문제: n1에 들어갈 라인이 맞는것은?
선택한 오답: A) public int findMax(int[] numbers)
정답: B) static int[] findMax(int[] max)

이유: 객체 생성없이 메소드를 활용할려면 static을 붙여야 합니다.
*/