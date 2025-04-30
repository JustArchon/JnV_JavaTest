package JavaTest4;

public interface A {
	abstract void x();
}

public abstract class B /* position 1 */ {
	/* position 2 */
	public void x() {}
	public abstract void z();
}

public class C extends B implements A {
	/* position 3 */
}

public class Num6 {
	public static void main(String[] args) {}
}

/*
선택한 오답: B) @Override // position 2
		  	 public void z() { } // position 3
정답: D) public void z() { } // position 3

이유: C의 경우는 A의 abstract 사항을 구현해야합니다.
그 과정에서 B에는 이미 A에서 구현해야할점을 public void x() {}를 구현했고
이를 상속받았기때문에 C는 x를 다시 구현할필요는 없습니다.
그리고 B에서 abstract를 구현해야하므로 z()를 구현하면 문제없이 컴파일이됩니다.
*/