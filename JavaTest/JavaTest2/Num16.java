package JavaTest2;


public class Num16 {
	public static void main(String[] args) {
		System.out.println("String main " + args[0]);
	}
}

/*
	javac MainTest.java
	java MainTest "A B C"
선택한 오답: A) String main A
정답: C) String main A B C
컴파일결과 : A B C

이유: 첫번째에 입력된줄의 내용을 전부 표시해주는 내용이므로 C) A B C가 정답입니다.
*/