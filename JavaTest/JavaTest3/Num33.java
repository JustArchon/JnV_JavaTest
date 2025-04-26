package JavaTest3;

public interface A {
	abstract void x();
	public default void y() { }
}

public abstract class B {
	public abstract void z();
}

public class C extends B implements A{
	/* intert code here */
}

public class Num33 {
	public static void main(String[] args) {
		
	}
}

/*

선택한 오답: C) void x() {}
			 public void y() {}
			 public void z() {}
정답: A) public void x() {}
		public void z() {}

이유: 인터페이스 에서 abstract가 아닌, 이미 구현된 메소드는 따로 재정의할 필요가 없다고합니다.
그리고 abstract class와 다르게 interface는 접근자 자체가 암묵적으로 public으로 선언된다하며
인터페이스를 구현할때는 public으로 구현해야 오류가나지 않는다고합니다.
*/