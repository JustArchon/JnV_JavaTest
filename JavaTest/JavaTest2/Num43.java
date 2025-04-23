package JavaTest2;


public class Num43 {
	public static void main(String[] args) {
		String s = "Java SE 8 1";
		int len = s.trim().length();
		System.out.println(len);
	}
}

/*
선택한 오답: C) 8
정답: B) 11
컴파일결과 : B) 11

이유: trim의 경우는 문자열의 시작과 끝의 공백을 없애는 명령어 이기때문에 Java SE 8 1의 공백자리까지 다합쳐서
11의 길이가 나타나게됩니다.
*/