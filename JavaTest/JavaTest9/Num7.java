package JavaTest9;

public class Num7 {
	public static void main(String[] args) {
		int i = 3;
		int j = 25;
		System.out.println(i > 2 ? 1 > 10 ? i * (j + 10) : i * j + 5 : i);
	}
}

/*

선택한 오답: C) 컴파일 오류
정답: D) 80

이유: 삼항연산자는 ? ?를 곂칠수 있다고합니다. 그래서 첫번째 조건은 true, 그다음에 false이므로 i * j + 5가 선택되고 80이 정답으로나옵니다.
*/