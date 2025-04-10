package JavaTest1;

public class Num29 {
	Character c;
	boolean b;
	float f;
	void printAll() {
		System.out.println("c = " + c);
		System.out.println("b = " + b);
		System.out.println("f = " + f);
	}
	public static void main(String[] args) {
		Num29 f = new Num29();
		f.printAll();
	}
}

/*
선택한 오답: A) c = null
			 b = true
			 f = 0.0
정답: C) c = null
		b = false
		f = 0.0

이유: boolean을 초기화 하지않은 초기값은 'false'라고합니다. 그러므로 C가 정답입니다.
숫자는 0, 문자는 '\0', 참조타입(String, 래퍼 클래스(Integer, Character ...)) = null
*/