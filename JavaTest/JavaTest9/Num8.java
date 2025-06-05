package JavaTest9;

class ConSuper {
	protected ConSuper() {
		this(2);
		System.out.print("3");
	}
	protected ConSuper(int a) {
		System.out.print(a);
	}
}

public class Num8 extends ConSuper{
	Num8() {
		this(4);
		System.out.print("1");
	}
	Num8(int a) {
		System.out.print(a);
	}
	public static void main(String[] args) {
		new Num8(4);
	}
}

/*

선택한 오답: C) 2341
정답: B) 234

이유: 마지막의 Num8이 생성자의 역할은 Num8(int a)를 실행하는 것이 마지막이라고 합니다. 그러다보니 super를 통한 23 + 4까지 출력하고나서의 남은 프린트1은 출력되지 않는다고합니다.
*/