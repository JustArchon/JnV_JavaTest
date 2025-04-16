package JavaTest2;


public class Num6 {
	public static void main(String[] args) {
		String str = " ";
		str.trim();
		System.out.println(str.equals("") + " " + str.isEmpty());
	}
}

/*
선택한 오답: D) true true
정답: A) false false
컴파일결과 : false false

이유: trim()은 원본 문자열을 수정하지 않기때문에 str = str.trim()을 하지않는이상 반영되지 않습니다.
*/