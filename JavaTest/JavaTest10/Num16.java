package JavaTest10;

public class Foo {
	private void print() {
		System.out.println("Bonjure le monde!");
	}
	public void foo() {
		print();
	}
}

public class Num16 extends Foo{
	private void print() {
		System.out.println("Hello world!");
	}
	public void bar() {
		print();
	}
	public static void main(String[] args) {
		Num16 b = new Num16();
		b.foo();
		b.bar();
	}
}

/*

선택한 오답: B) Hello World!
			 Hello World!
정답: C) Bonjure le monde!
		Hello World!

이유: Foo의 print()가 private여서 Hello World가 2번출력될것 같았지만, 실제로 public void foo()는 public이였기때문에 상속을 잘 받게되며,
foo는 위의 private print가있는곳에 있기때문에 처음에는 Bonjure가뜨고 그이후에는 Hello가뜨는게 맞다고합니다.
*/