package JavaTest2;


public class Num42 {
	public static void main(String[] args) {
		int ans;
		try {
			int num = 20;
			int div = 0;
			ans = num / div;
		} catch (ArithmeticException e) {
			ans = 0;						// line n1
		} catch (Exception e) {
			System.out.println("Invalid calculation");
		}
		System.out.println("Answer = " + ans);	// line n2
	}
}

/*
선택한 오답: 
정답: E) 컴파일 오류가 난다, n2, n1에서
컴파일결과 : D) n2 라인에서 에러가난다.

이유: 예외처리가된 변수는 초기화 되지 않는다고합니다. 그러므로 n2에서 표시될수없습니다.
*/