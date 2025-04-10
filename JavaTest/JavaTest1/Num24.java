package JavaTest1;

public class Num24 {
	public static void main(String[] args) {
		try {
			int num = 10;
			int div = 0;
			int ans = num / div;
		} catch (ArithmeticException e) {
			ans = 0;						// n1
		} catch (Exception e) {
			System.out.println("Invalid calculation");
		}
		System.out.println("Answer = " + ans);	// n2
	}
}

/*
선택한 오답: A) Answer = 0
정답: E) Compilation fails at line n1 and line n2.

이유: ans 변수가 try 블록 내에 있었기 때문에 try 바깥블록으로 나가는 순간 int ans는 없는
항목이 됩니다. 그러므로 n1,n2 구역 전부 컴파일 에러가 정답입니다.
*/