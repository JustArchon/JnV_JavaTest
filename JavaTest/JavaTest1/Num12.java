package JavaTest1;

public class Num12 {
	public static void main(String[] args) {
		Base b1 = new DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new DerivedB();
		b1 = (Base) b3;
		Base b4 = (DerivedA) b3;
		b1.test();
		b4.test();
	}
}

//Base.java:
class Base{
	public void test() {
		System.out.println("Base");
	}
}
//DerivedA.java:
class DerivedA extends Base{
	public void test() {
		System.out.println("DerivedA");
	}
}
//DerivedB.java:
class DerivedB extends DerivedA{
	public void test() {
		System.out.println("DerivedB");
	}
}



/*
선택한 오답: A) Base
		     DerivedA
정답: C) DerivedB
		DerivedB
컴파일 결과: DerivedB
		  DerivedB

이유: 메서드를 호출할때는 실제 객체 타입에 정해지는 것이며, 객체를 가리키는 변수의 타입으로는 정해지지 않는다합니다.
*/