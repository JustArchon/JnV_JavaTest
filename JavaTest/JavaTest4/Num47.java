package JavaTest4;

import java.io.Serializable;

enum Color implements Serializable{
	R(1), G(2), B(3);
	int c;
	public Color(int c) {
		this.c = c;
	}
}

public class Num47 {
	
}

/*
문제: 컴파일을 성공하려면 어떻게바꿔야하나요?

선택한 오답: D) Replace enum Color implements Serializable with public enum Color;
정답: A) Replace public Color(int c) with private Color(int c)

이유: 자바의 enum 생성자는 무조건 private 혹은 default를 통해서 private가 선언되게 해야한다고합니다.
그러므로 직접 생성되게 하면안되는 enum의 경우는 생성자를 private로 하는것이 맞습니다.

*/
