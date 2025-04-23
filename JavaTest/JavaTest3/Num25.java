package JavaTest3;

import java.io.IOException;


public class Num25 {
	public static void main(String fileName) throws IOException {
		int x;
		int y = 5;
		if (y > 2) {
			x = ++y;
			y = x + 7;
		
		} else {
			y++;
		}
		System.out.println(x + " " + y);
	}
}

/*
선택한 오답: D) B.java 파일만 컴파일에 실패한다.
정답: A) A파일만 컴파일에 성공한다.
컴파일결과 : B class 오류

이유: 지역변수는 접근 제한자를 사용할수 없다고합니다. private int가 불가능하다고 설명 할 수 있습니다.
main메소드의 경우는 컴파일은 되지만 main의 진입점이 작동되지않으므로 A만 정상적으로 사용 할 수 있기에 정답이 A인거라고 설명할수있을것 같습니다.
단 메소드하고 변수하고 이름을 같이쓰는건 좋은습관은 아니라고 합니다.
*/