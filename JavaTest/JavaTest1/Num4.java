package JavaTest1;

public class Num4 {
	public static void main(String[] args) {
		
	}
}

/*
A.java:
package p1;
public class A {
}

B.java:
package p1.p2;
// line n1
public class B{
	public void doStuff(){
		A b = new A();
	}
}

C.java:
package p3;
// line n2
public class C {
	public static void main(String[] args) {
		A o1 = new A();
		B o2 = new B();
	}
}

선택한 오답: C) n1: Replace line n1 with: import p1.A;
				 Replace line n2 with: import p1.A; import p1.p2.B;
정답: B) Replace line n1 with: import p1.A;
		Replace line n2 with: import p1.*;

이유: p1.p2의 경로가 달라질수 있다는 점에서 p1.*를 하는게 간결하고 import문제없이 로드가 될 수 있기 때문에
B)가 정답이라고 합니다.
*/