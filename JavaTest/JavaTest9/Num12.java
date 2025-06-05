package JavaTest9;


// package test.t1;
public class A { 
	public int x = 42;
	protected A() { }
}

// package test.t2;
import test.t1.*;
public class B extends A {
	int x = 17;					// line 2
	public B() { super(); }
}

import test.t1.A;
import test.t2.B;
public class Num12 {
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.x);
	}
}

/*

선택한 오답: E) 라인 2번에서 컴파일 에러가난다.
정답: A) 42

이유: 메소드와 다르게 변수는 서로의 접근자가 달라질경우 에러가 아닌, 서로 별개의 존재로 바뀐다고합니다. 그런 관계로
A obj에서 b를 대입해도 a의 int x가 오버라이딩되지않고 별개의 존재로남게되고 호출시 42가 나오게된다고합니다.
*/