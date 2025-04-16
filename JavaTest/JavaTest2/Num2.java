package JavaTest2;


public class Num2 {
	public static void main(String[] args) {
		String myStr = "Hello world ";
		myStr.trim();
		int i1 = myStr.lastIndexOf(" ");
		System.out.println(i1);
	}
}

/*
선택한 오답: B) -1
정답: D) 11
컴파일결과 : 11

이유: trim()은 원본 문자열을 수정하지 않으며, 양끝의 공백을 제거한 값을 반환합니다.
그러므로 myStr = myStr.trim()을 하지않는이상 원본 글자가 반영되지 않습니다.
*/