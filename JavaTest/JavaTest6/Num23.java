package JavaTest6;

import java.util.function.UnaryOperator;

public class Num23 {
	public static void main(String[] args) {
		final String str1 = "Java";
		StringBuffer strBuf = new StringBuffer("Course");
		UnaryOperator<String> u = (str2) -> str1.concat(str2);
		UnaryOperator<String> c = (str3) -> str3.toLowerCase();
		System.out.println(u.apply(c.apply(strBuf)));			// n2
	}
}

/*

선택한 오답: C) Javacourse
정답: D) n2라인에서 컴파일 에러

이유: UnaryOperator는 String만 입력할 수 있다고 합니다. StringBuffer인 형태의 strBuf는 적용될수 없다고하며
컴파일되기 위해서는 StringBuffer를 String으로 바꿔야한다고 합니다. 
*/