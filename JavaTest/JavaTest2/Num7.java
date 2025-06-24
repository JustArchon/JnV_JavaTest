package JavaTest2;

import java.io.IOException;

class A {
	public void a() {}
	int a;
}

class B {
	protected int doSuff() {
		private int a = 100;
		return a++;
	}
}

public class Num7 {
	public static void main(String fileName) throws IOException {
		
	}
}

/*
선택한 오답: D) B.java 파일만 컴파일에 실패한다.
정답: A) A파일만 컴파일에 성공한다.
컴파일결과 : B class 오류

이유: 지역변수는 접근 제한자를 사용할수 없다고합니다. private int가 불가능하다고 설명 할 수 있습니다.
Num7쪽이 틀린이유는 문제에서는 C.java형식으로 전부다 다른 java 형식으로 나뉘어져있는데
C.java에서 import,package 선언 순서가 바뀌어있었다고합니다. 그래서 C.java도 실패합니다.
단 메소드하고 변수하고 이름을 같이쓰는건 좋은습관은 아니라고 합니다.
*/