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
선택한 오답: C) 6 13
정답: A) 컴파일 오류

이유: x가 초기화되지않은채로 println을 진행 할 수 있기때문에 컴파일 오류가정답입니다.
*/